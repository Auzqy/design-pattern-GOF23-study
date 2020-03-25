## 概述 

观察者模式（Observer，又叫做发布/订阅模式（Publish/Subscribe）），定义了对象之间的一对多依赖，让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，他的所有观察者收到通知（并可能还会采取相应的措施）。

> 观察者模式（Observer Design Pattern）也被称为发布订阅模式（Publish-Subscribe Design Pattern）。
> 在 GoF 的《设计模式》一书中，它的定义是这样的：
>   Define a one-to-many dependency between objects so that when one 
>   object changes state, all its dependents are notified and updated 
>   automatically.
> 翻译成中文就是：在对象之间定义一个一对多的依赖，当一个对象状态改变的时候，
> 所有依赖的对象都会自动收到通知

## 示例说明

### 1. example1
jdk中观察者模式的实现方式
模拟某网站上老师开的课程，并订阅该课程的同学们的提问信息，
如有同学们提问，老师会收到相关提醒（如短信或者邮件）


### 2. example2 
2.1 guava中观察者模式的实现  <br/>
2.2 用 guava 的方式修改 example1 中的例子 <br/>


## 博客地址 
https://www.jianshu.com/p/52c914162f4b



