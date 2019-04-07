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

8.Bean

1）Bean的常用配置项：Id、Class、Scope、Constructor arguments、Properties、Autowiring mode、lazy-initialization/destruction method。只有Class是必须的。

2）Bean的作用域：singleton（单例，每一个Bean容器中只存在一份）、prototype（每次请求创建新的实例，destroy方式不生效）、request（每次http请求创建一个实例且仅在当前request内有效）、session（每次请求http创建，当前session内有效）、global session（每次基于portlet的web中有效，如果是在web中，同session）。

3）Bean的生命周期：定义、初始化、使用、销毁。

![1554535473239](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554535473239.png)

![1554535591301](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554535591301.png)

![1554535638404](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554535638404.png)

4）Aware接口：实现Aware接口的bean在被初始化之后，可以获取相应资源。通过Aware接口，可以对Spring相应资源进行操作。为对Spring进行简单的扩展提供了方便的入口。

5）自动装配：

![1554539667147](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554539667147.png)

6）Resource

![1554541830178](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554541830178.png)

![1554541902198](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554541902198.png)

9.Bean的注解实现和例子

1）<context:component-scan>包含<context:annotation-config>,通常在使用前者后，不再使用后者。AutoWiredAnnotationBeanPostProcessor和CommonAnnotationBeanPostProcessor也会被包含进来。

2）默认情况下，类被自动发现并注册bean的条件是：使用@Component，@Repository，@Service，@Controller注解或者使用@Component自定义注解。

![1554543197622](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554543197622.png)

![1554543237684](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554543237684.png)

3）扫描过程中组件被自动检测，那么Bean名称是由BeanNameGenerator生成的（@Component，@Repository，@Service，@Controller都会有个name属性用于显式设置Bean Name）。可以自定义命名策略，实现BeanNameGenerator接口，**一定要包含一个无参构造器**。

4）@Required注解适用于bean属性的setter方法，这个注解仅仅表示，受影响的bean属性必须在配置的时候被填充，通过在bean定义或者通过自动装配一个明确的属性值。在使用Autowired的时候，每个类只能由一个required=true.

5）@AutoWired的必要属性建议使用@Required注解。可以使用@Autowired注解那些总所周知的解析依赖性接口（如：BeanFactory、ApplicationConetxt、Environment、ResourceLoader、ApplicationEventPublisher、MessageSource）。@AutoWired是由Spring BeanPostProcessor处理的，所以不能在自己的BeanPostProcessor或者BeanFactoryPostProcessor类型应用这些注解，这些类型必须通过XML或者Spring的@Bean注解来加载。@order注解只对list有效，对map无效。

6）@Qualifier可以缩小范围（或指定唯一），也可以用于指定单独的构造器参数或者方法参数。可以用于注解几何类型变量。

![1554623029592](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554623029592.png)

在自定义注解的时候，可以在上面用@Qualifer注解，这样就定义了我们注解的@Qualifer.

10.基于Java容器的注解

1）@Bean标识一个用于配置和初始化一个由SpringIOC容器管理的新对象的方法，类似于XML配置文件的<bean/>

2）可以在Spring的@Component注解的类中使用@Bean注解任何方法（仅仅式可以）。通常@Bean与@Configuration搭配。

3）@ImportResource引入资源文件。



