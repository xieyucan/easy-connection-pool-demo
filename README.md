## EasyConnectionPoolDemo动态连接池实例
求star、求指教。

### 简介
EasyConnectionPoolDemo是SpringBoot动态配置多数据源连接池[spring-boot-easy-connection-pool](https://github.com/xieyucan/spring-boot-easy-connection-pool "spring-boot-easy-connection-pool")项目的实例。

EasyConnectionPoolDemo项目中分别演示了使用常见Jpa、JdbcTemplate、MyBatis作为持久层框架的项目案例。

按理说spring-boot-easy-connection-pool处理的是DataSource，对各种持久层框架而言是透明的，使用场景也是很类似，比较简单。但是为了更加具体详细的说明演示
，就做了这个项目。此项目中分别使用了两个数据、两个表进行演示；理论上而言：如果项目中添加了支持JDBC协议驱动的数据源配置，则可实现数据源动态切换逻辑。
该连接池项目还有一个特点：在启动阶段会打印详细的连接信息以及连接表信息，如下图所示：

![启动图片](https://github.com/xieyucan/easy-connection-pool-demo/blob/master/images/start.jpeg)

### V1.0.1 - 更新说明
新增从默认数据库中获取数据源连接信息，使用说明。

#### 1. 实例地址
```javascript
https://github.com/xieyucan/easy-connection-pool-demo/blob/master/easy-jdbctemplate/src/main/java/com/xieahui/easy/jdbctemplate/service/MyDb3Service.java
```

### 准备
该项目演示使用的是MySql数据库，所以运行项目的前提是要有MySql数据库。新建数据库及表
 1. easy_pool_demo - student
 2. db1 - user

easy_pool_demo作为了默认数据库，建表语句在项目根目录的script中。

### MyBatis框架中的用法
MyBatis是一款非常优秀的持久层框架，尤其是在互联网企业中使用的人群超级多。

演示项目 [easy-mybatis](https://github.com/xieyucan/easy-connection-pool-demo/tree/master/easy-mybatis)

演示用例 [easy-mybatis-MyBatisApplicationTest](https://github.com/xieyucan/easy-connection-pool-demo/tree/master/easy-mybatis/src/test/java/com/xieahui/easy/mybatis)


### JPA中的用法
JPA是SpringBoot默认集成的持久层框架，如果使用过Hibernate，那么对JPA则很快上手。使用JPA开发CRUD，可以说是非常的迅速、顺手。
在管理项目中做功能开发没有比JPA开发效率更高的了，如果你觉得使用起来不是很方便，那一定是没有找到正确的用法。这个项目中只是为了演示spring-boot-easy-connection-pool项目
如何支持JPA的开发，并没有对JPA技术进行详细介绍。

演示项目 [easy-jpa](https://github.com/xieyucan/easy-connection-pool-demo/tree/master/easy-jpa)

演示用例 [easy-jpa-JpaApplicationTest](https://github.com/xieyucan/easy-connection-pool-demo/blob/master/easy-jpa/src/test/java/com/xieahui/easy/jpa)


### JdbcTemplate中的用法
JdbcTemplate很早之前就在SpringJdbc中出现了。由于它只对原生数据连接操作使用模板模式进行简单包装（如果没有任何封装，那么使用起来是非常蹩脚的），所以更接近原生操作；这也注定了它比其他几个框架更加灵活且学习成本更低。我们则更容易根据自己的业务场景、使用习惯封装出独特的持久层方案。

演示项目 [easy-jdbctemplate](https://github.com/xieyucan/easy-connection-pool-demo/tree/master/easy-jdbctemplate)

演示用例 [easy-jpa-JdbcTemplateApplicationTest](https://github.com/xieyucan/easy-connection-pool-demo/tree/master/easy-jdbctemplate/src/test/java/com/xieahui/easy/jdbctemplate)

以上，如有问题可以邮件联系我。祝好！
