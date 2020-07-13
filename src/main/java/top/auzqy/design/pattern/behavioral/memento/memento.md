## 概述 

备忘录模式，也叫快照（Snapshot）模式，英文翻译是 Memento Design Pattern。

在 GoF 的《设计模式》一书中，备忘录模式是这么定义的：
> Captures and externalizes an object’s internal state 
> so that it can be restored later, all without violating encapsulation.
> 翻译成中文就是：
> 在不违背封装原则的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，
> 以便之后恢复对象为先前的状态。


## 重点

- 为什么存储和恢复副本会违背封装原则？
- 备忘录模式是如何做到不违背封装原则的？


## 示例说明

### 1. example1

#### 背景介绍
假设有这样一道面试题，希望你编写一个小程序，可以接收命令行的输入。
用户输入文本时，
程序将其追加存储在内存文本中；用户输入“:list”，
程序在命令行中输出内存文本的内容；用户输入“:undo”，
程序会撤销上一次输入的文本，也就是从内存文本中将上次输入的文本删除掉。

举了个小例子来解释一下这个需求，
如下所示：
```shell script
>hello
>:list
hello
>world
>:list
helloworld
>:undo
>:list
hello
```

1. eg1_1 简易实现
    上面的代码基本上已经实现了最基本的备忘录的功能。
    但是，如果我们深究一下的话，还有一些问题要解决，那就是前面定义中提到的第二点：
    要在不违背封装原则的前提下，进行对象的备份和恢复。
    而上面的代码并不满足这一点，主要体现在下面两方面：
    
    - 第一，为了能用快照恢复 InputText 对象，我们在 InputText 类中定义了 setText() 函数，
      但这个函数有可能会被其他业务使用，所以，暴露不应该暴露的函数违背了封装原则；
    - 第二，快照本身是不可变的，理论上讲，不应该包含任何 set() 等修改内部状态的函数，
      但在上面的代码实现中，“快照“这个业务模型复用了 InputText 类的定义，
      而 InputText 类本身有一系列修改内部状态的函数，
      所以，用 InputText 类来表示快照违背了封装原则。

2. eg1_2 改进版本
    针对以上问题，我们对代码做两点修改。
    
    其一，定义一个独立的类（Snapshot 类）来表示快照，而不是复用 InputText 类。
        这个类只暴露 get() 方法，没有 set() 等任何修改内部状态的方法。
        
    其二，在 InputText 类中，我们把 setText() 方法重命名为 restoreSnapshot() 方法，
        用意更加明确，只用来恢复对象。
    
    


## 参考
[参考](https://time.geekbang.org/column/article/223947?utm_source=pinpaizhuanqu&utm_medium=geektime&utm_campaign=guanwang&utm_term=guanwang&utm_content=0511)

## 博客地址 
~~https://www.jianshu.com/p/52c914162f4b~~




