1.Spring的一些资源

http://spring.io/

http://projects.spring.io/spring-framework/

2.Spring简介：一个开源框架，为了解决企业应用开发的复杂性而创建的，但现在已经不止应用于企业应用。是一个轻量级的控制反转和面向切面的容器框架。

3.Spring的作用

1）容器

2）提供了多种支持（JMS、MQ支持、UnitTest等）

3）AOP（事务管理、日志等）

4）提供了众多方便应用的辅助类（JDBC Template等）

5）对主流应用框架（Hibernate等）提供了良好的支持

4.适用范围

1）构建企业应用（SpringMVC+Spring+Hibernate/ibatis）

2）单独使用Bean容器（Bean管理）

3）单独使用AOP进行切面处理

4）其他的Spring功能，如：对消息的支持

5）在互联网中的应用

5.IOC：控制反转，控制权的转移，应用程序本身不负责依赖对象的创建和维护，而是由外部容器负责创建和维护。DI（依赖注入）是一种实现方式。目的是创建对象并且组装对象之间的关系。、

6.Bean容器的初始化

1）BeanFactory提供配置结构和基本功能，加载并出示化Bean，涉及两个包：org.springframework.beans、org.springframework.context

2）ApplicationContext保存了Bean对象并在Spring中被广泛使用：可以通过本地文件、ClassPath、Web应用中的依赖servlet或者Listener

![1554383898193](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554383898193.png)

7.Spring的注入：在启动Spring容器加载Bean配置的时候完成对成员变量的赋值行为。常用的两种注入方式是：设值注入、构造注入。

![1554384060826](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554384060826.png)

![1554384184458](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554384184458.png)