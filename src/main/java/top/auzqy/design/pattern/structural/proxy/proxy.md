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

## cglib 动态代理与 jdk 的动态代理

### [参考一](https://www.cnblogs.com/fillPv/p/5939277.html)
1、原理

   jdk静态代理实现比较简单，一般是直接代理对象直接包装了被代理对象。

　 jdk动态代理是接口代理，被代理类A需要实现业务接口，业务代理类B需要实现InvocationHandler接口。

   jdk动态代理会根据被代理对象生成一个继承了Proxy类，并实现了该业务接口的jdk代理类，
   该类的字节码会被传进去的ClassLoader加载，创建了jdk代理对象实例，

   jdk代理对象实例在创建时，业务代理对象实例会被赋值给Proxy类，
   jdk代理对象实例也就有了业务代理对象实例，
   同时jdk代理对象实例通过反射根据被代理类的业务方法创建了相应的Method对象m（可能有多个）。
   当jdk代理对象实例调用业务方法，如proxy.addUser();
   这个会先把对应的m对象作为参数传给invoke()方法（就是invoke方法的第二个参数），
   调用了jdk代理对象实例的invoke()回调方法，在invoke方法里面再通过反射来调用被代理对象的因为方法，
   即result = method.invoke(target, args);。

  cglib动态代理是继承代理，通过ASM字节码框架修改字节码生成新的子类，重写并增强方法的功能。

2、优缺点

     jdk静态代理类只能为一个被代理类服务，如果需要代理的类比较多，那么会产生过多的代理类。jdk静态代理在编译时产生class文件，运行时无需产生，可直接使用，效率好。

     jdk动态代理必须实现接口，通过反射来动态代理方法，消耗系统性能。但是无需产生过多的代理类，避免了重复代码的产生，系统更加灵活。

     cglib动态代理无需实现接口，通过生成子类字节码来实现，比反射快一点，没有性能问题。但是由于cglib会继承被代理类，需要重写被代理方法，所以被代理类不能是final类，被代理方法不能是final。

因此，cglib的应用更加广泛一点。

## 博客地址 todo


## 参考
- [这篇不错](https://blog.csdn.net/flyfeifei66/article/details/81481222)
- [这篇不错](https://www.jianshu.com/p/49ebf34afd03)



