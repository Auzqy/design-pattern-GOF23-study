## 概述 

责任链模式（Chain of responsibility），使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。

## 示例说明

### 1. example1
模拟一个视频课程发布上线的过程，
正常的过程是需要通过手记审批，同时通过视频审批
缺一就不让通过。


### 2. example2 
员工向领导提涨薪

部门领导（0,1000] --> 人事总监（1000，3000] --> 老板 (3000,正无穷)

### 3. example3
- servlet filter
- spring interceptor

![servlet filter + spring interceptor 请求处理流程](.chain_of_responsibility_images/ce2ebc90.png)

[特别棒的参考](https://time.geekbang.org/column/article/217395?utm_source=pinpaizhuanqu&utm_medium=geektime&utm_campaign=guanwang&utm_term=guanwang&utm_content=0511)

## 博客地址 
https://www.jianshu.com/p/055db474b20a



