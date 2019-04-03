1.ORM：Object/Relationship Mapping,对象关系映射

2.写SQL语句有什么不好？

1）不同的数据库使用不同的SQL语法不同。

2）同样的功能在不同的数据库中有不同的实现方式

3）程序过分的依赖SQL对程序的移植以及扩展维护等带来很大的麻烦。

3.通过Hibernate API编写访问数据库的代码

1）创建配置对象：Configuration config = new Configuration().configure();

2）创建服务注册对象：ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();

3）创建会话工厂对象：

sessionFactory = config.buildSessionFactory(serviceRegistry);

4）打开会话：session = sessionFactory.openSession();

5）开启事务：transaction = session.beginTransaction();

4.三个重要注解

1）@Before：在test编译之前执行

2）@Test：单元测试模块

3）@After：单元测试之后执行

5.hibernate.cfg.xml常用的配置![1554283355879](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554283355879.png)

hibernate前缀可以省略不写

6.session简介：操纵数据库的对象

1)获得session对象呢？

openSession、getCurrentSession（需要配置(⊙o⊙)？）

2）两种方式的区别：getCurrentSession在事务提交或者回滚之后会自动关闭，而openSession需要你手动关闭。如果使用openSession而没有手动关闭，多次之后会导致连接池溢出。openSession每次创建新的session对象，而getCurrentSession使用现有的session对象。

7.transcation简介：hibernate对数据的操作是封装在事务中的，而且非自动提交。所以用session保存对象时，如果不开启事务，并且手工提交事务，对象并不会真正保存在数据库中。

8.hbm配置文档：

![1554288756062](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554288756062.png)

![1554288828112](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554288828112.png)

![1554288843432](C:\Users\郭艳艳\AppData\Roaming\Typora\typora-user-images\1554288843432.png)

