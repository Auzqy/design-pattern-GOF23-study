
## 概述 

观察者模式（Observer，又叫做发布/订阅模式（Publish/Subscribe）），定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，他的所有观察者收到通知（并可能还会采取相应的措施）。




定义一系列的算法，把它们一个个封装起来，并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化。

spring中在实例化对象的时候用到Strategy模式

在SimpleInstantiationStrategy中有如下代码说明了策略模式的使用情况：


## 示例说明

### 1. example1
商场促销 <br/>
商场搞活动，有三种促销方式: <br/>
1. 返现促销 <br/>
2. 满减促销 <br/>
3. 立减促销 <br/>

eg1_1 普通的策略模式的实现方式 <br/>
&nbsp;&nbsp;缺点：这种写法并不能完全的免除if/else的判断
    
eg1_2 结合工厂模式（演进一下） <br/>
&nbsp;&nbsp;好处/目的： <br/>
&nbsp;&nbsp;&nbsp;&nbsp;1_2.1 消除if/else的判断 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;1_2.2 避免多次创建重复的对象（比如满减啊，返现啊等这些类） <br/>


### 2. example2 todo



## 博客地址 
https://www.jianshu.com/p/52c914162f4b



