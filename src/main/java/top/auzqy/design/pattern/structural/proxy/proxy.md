## 概述 

代理模式（Proxy），为其他对象提供一种代理，以控制这个对象的访问。
代理对象在客户端和目标对象之间起到中介的作用

常用的有二种： <br/>
1.静态代理 <br/>
2.动态代理 <br/>
&nbsp;&nbsp; 所谓动态，就是可以动态的指定将要被代理的对象，以及被代理的方法. <br/>
&nbsp;&nbsp; 2.1 jdk的动态代理 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当目标类实现的接口时，可以使用jdk的动态代理，如果没有实现接口，则不能用。  <br/>
&nbsp;&nbsp; 2.2 cglib的动态代理 <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当目标累没有实现接口时，使用cglib的动态代理，他的原理是为其动态的生成子类来完成增强，故目标类和目标方法是否有被 final 修饰，需要格外关注一下； <br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;同时当类有实现某个接口的时候，也是可以使用cglib的； <br/>


## 示例说明

### 1. example1
模拟一个商城网站，客服下订单时，访问数据库时多数源的情况


### 2. example2 todo


## 博客地址 todo




