## 概述 

观察者模式（Observer，又叫做发布/订阅模式（Publish/Subscribe）），定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，他的所有观察者收到通知（并可能还会采取相应的措施）。

> 观察者模式（Observer Design Pattern）也被称为发布订阅模式（Publish-Subscribe Design Pattern）。
> 在 GoF 的《设计模式》一书中，它的定义是这样的：
>   Define a one-to-many dependency between objects so that when one 
>   object changes state, all its dependents are notified and updated 
>   automatically.
> 翻译成中文就是：在对象之间定义一个一对多的依赖，当一个对象状态改变的时候，
> 所有依赖的对象都会自动收到通知

## 重点
### 什么情况下需要用到这种设计模式？或者说，这种设计模式能解决什么问题呢？

观察者模式，是将观察者和被观察者代码解耦。
借助设计模式，我们利用更好的代码结构，将一大坨代码拆分成职责更单一的小类，
让其满足开闭原则、高内聚松耦合等特性，
以此来控制和应对代码的复杂性，提高代码的可扩展性。


## 示例说明

### 1. example1
jdk中观察者模式的实现方式
模拟某网站上老师开的课程，并订阅该课程的同学们的提问信息，
如有同学们提问，老师会收到相关提醒（如短信或者邮件）


### 2. example2 
2.1 guava中观察者模式的实现  <br/>
2.2 用 guava 的方式修改 example1 中的例子 <br/>
2.3 Guava Event Bus

## 博客地址 
https://www.jianshu.com/p/52c914162f4b



