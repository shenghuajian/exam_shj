## Spring面试题

### 数据库设计三大范式？

* 第一范式：每个列都不可以再拆分。
* 第二范式：在第一范式的基础上，非主键列完全依赖于主键，而不能是依赖于主键的一部分。
* 第三范式：在第二范式的基础上，非主键列只依赖于主键，不依赖于其他非主键

### JAVA中PO，DTO，VO的区别？

* VO（value object：值对象） 通常用于业务层之间的数据传递，由new创建，由GC回收 和PO一样也是仅仅包含数据而已，但应是抽象出的业务对象，可以和表对应，也可以不是
* PO（persistant object：持久层对象） 是ORM(Objevt Relational Mapping)框架中Entity，PO属性和数据库中表的字段形成一一对应关系 VO和PO，都是属性加上属性的get和set方法；表面看没什么不同，但代表的含义是完全不同的
* DTO（data transfer object：数据传输对象） 是一种设计模式之间传输数据的软件应用系统，数据传输目标往往是数据访问对象从数据库中检索数据 数据传输对象与数据交互对象或数据访问对象之间的差异是一个以不具任何行为除了存储和检索的数据。简而言之，就是接口之间传递的数据封装

### 详细描述什么是Spring？

* Spring是一个轻量级Java开发框架，目的是为了解决企业级应用开发的业务逻辑层和其他各层的耦合问题。
* Spring最根本的使命是解决企业级应用开发的复杂性，即简化Java开发。两个核心特性，也就是依赖注入（DI）和面向切面编程（AOP）。

### 什么是 Spring IoC？

* 控制反转即 IoC (Inversion of Control)，它把传统上由程序代码直接操控的对象的调用权交给容器，通过容器来实现对象组件的装配和管理。所谓的“控制反转”概念就是对组件对象控制权的转移，从程序代码本身转移到了外部容器。
* Spring IoC 负责创建对象，管理对象（通过依赖注入（DI），装配对象，配置对象，并且管理这些对象的整个生命周期。

### 什么是 Spring AOP？描述其应用场景（最少2个）

* AOP：一般称为面向切面编程，作为面向对象的一种补充，用于将那些与业务无关，但却对多个对象产生影响的公共行为和逻辑，抽取并封装为一个可重用的模块，这个模块被命名为“切面”，减少系统中的重复代码，降低了模块间的耦合度，同时提高了系统的可维护性。
* 可用于权限认证、日志、事务处理等。

### 描述Spring Bean的作用域？

* singleton : bean 在每个 Spring IoC 容器中只有一个实例。
* prototype：一个 bean 的定义可以有多个实例。
* request：每次 HTTP 请求都会创建一个 bean。
* session：在一个 HTTP Session 中，一个 bean 定义对应一个实例。
* global-session：在一个全局的 HTTP Session 中，一个 bean 定义对应一个实例。
* request，session，global-session 作用域仅在基于 web 的 Spring ApplicationContext 情形下有效。

### Spring 注入有几种方式？

* Setter 注入
* 构造器注入
* 静态工厂方法注入
* 实例工厂方法注入

### SpringBean 生命周期？

* Bean的定义——Bean的初始化——Bean的使用——Bean的销毁

### Spring 框架中用到了哪些设计模式？（不低于3个）

* 工厂模式：BeanFactory 就是简单工厂模式的体现，用来创建对象的实例；
* 单例模式：Bean 默认为单例模式。
* 代理模式：Spring 的 AOP 功能用到了 JDK 的动态代理和 CGLIB 字节码生成技术；
* 观察者模式：定义对象键一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都会得到通知被制动更新，如 Spring 中 listener 的实现 – ApplicationListener。
* 模板方法：用来解决代码重复的问题。比如：RestTemplate , JMSTemplate , JPATemplate。

### 描述 Spring 事务传播行为？

* Spring 事务传播行为：是当多个事务同时存在的时候，Spring 如何处理这些事务的行为。
* ①required：若当前没有事务，就创建一个新事务；反之，就加入该事务，该设置是最常用的设置。
* ②supports：支持当前事务，若当前存在事务，就加入该事务；反之，就以非事务执行。
* ③ mandatory：支持当前事务，若当前存在事务，就加入该事务；反之，就抛出异常。
* ④requires_new：创建新事务，无论当前存不存在事务，都创建新事务。
* ⑤not_supported：以非事务方式执行操作，若当前存在事务，就把当前事务挂起。
* ⑥never：以非事务方式执行，若当前存在事务，则抛出异常。
* ⑦nested：若当前存在事务，则在嵌套事务内执行；反之，则按 REQUIRE属性执行。

### 描述 Spring 事务的隔离级别？

* 1、default：用底层数据库的设置隔离级别；
* 2、read_uncommitted：读未提交，最低隔离级别、事务未提交前，就可被其他事务读取（会出现幻读、脏读、不可重复读）；
* 3、read_committed：读已提交，一个事务提交后才能被其他事务读取到（会造成幻读、不可重复读），SQL server 的默认级别；
* 4、repeatable_read：可重复读，保证多次读取同一个数据时，其值都和事务开始时候的内容是一致，禁止读取到别的事务未提交的数据（会造成幻读），MySQL 的默认级别；
* 5、serializable：序列化，代价最高最可靠的隔离级别，该隔离级别能防止脏读、不可重复读、幻读

### Spring 事务传播行为required和requires_new*区别？

* required：支持当前事务，若当前有事务，那么加入事务；反之，则新建一个
* requires_new：支持当前事务，若当前有事务，则挂起当前事务，然后新创建一个事务；反之，则自己创建一个事务。





## Spring MVC面试题

### Java 有什么缺点（至少3条）？

* 需要运行环境、不适合开发桌面应用程序
* 由于为了跨平台的功能，所以极大的增加了产品的复杂性。
* 无法定义一个好的标准使得开发时使用框架，必须先了解框架，延缓了开发的时间。

### JAVA 常见编码规范（说5条）？

* 不能以下划线或美元符号开始，也不能以下划线或美元符号结束
* 严禁使用拼音与英文混合的方式，更不允许直接使用中文的方式
* 方法名、参数名、成员变量、局部变量都必须遵从驼峰命名方式
* 常量命名全部大写，单词间用下划线隔开
* 包名统一使用小写，点分隔符之间有且仅有一个自然语义的英语单词

### 说出 git 命令（至少说6个）并分别说出其含义？

* git init 初始化本地 git 仓库
* git status 查看当前版本状态
* git add  将该文件添加到缓存
* git commit -m ‘xxx’ 提交
* git log 显示日志
* git branch 显示本地分支
* git remote -v 列出远程分支详细信息

### Spring 中如果发生循环注入会怎样？(a注入b b注入a)

* Spring内部代码是当解析依赖注入关系时，先判断是不是 @Lazy Bean，若是，则暂不解析该依赖；反之，则会进行依赖Bean的查找，若查找不到则会创建。
* 但是在创建时，由于和需要注入的 Bean 有循环依赖关系，所以注入 Bean 创建失败。

### Spring MVC 中的 Bean 是线程安全的吗？ 说出你的解决方案？

* Spring MVC 是单例模式，当涉及到改变成员变量时就会产生线程不安全；
* 最简单的解决方法是在 Controller 类上添加 @scope 注解实现多例

### Spring MVC 的执行流程？

* 用户发送请求至前端控制器 DispatcherServlet
* DispatcherServlet 收到请求后，调用 HandlerMapping 处理器映射器，请求获取 Handler
* 处理器映射器根据请求 url 找到具体的处理器，生成处理器对象及处理器拦截器，一并返回 DispatcherServlet
* DispatcherServlet 调用 HandlerAdapter 处理器适配器
* HandlerAdapter 经过适配调用具体处理器
* Handler 执行完成返回 ModelAndView
* HandlerAdapter 将 Handler 执行结果 ModelAndView 返回给 DispatcherServlet
* DispatcherServlet 将 ModelAndView 传给 ViewResolver 视图解析器进行解析
* ViewResolver 解析后返回具体 View
* DispatcherServlet 对 View 进行渲染视图
* DispatcherServlet 响应用户

### @RequestBody 和 @ResponseBody 的区别？

* @RequestBody：主要用来接收前端传递给后端的 Json 字符串中的数据的(请求体中的数据的)
* @ResponseBody：该注解用于将 Controller 的方法返回的对象，通过适当的 HttpMessageConverter 转换为指定格式后，写入到 Response 对象的 body 数据区

### @RequestParam 和 @PathViriable 的区别？

* 请求路径上有个id的变量值，可以通过 @PathViriable 来获取 @RequestMapping
* @RequestParam 用来获得静态的URL请求入参\**** ***\*，\*******\*Spring 注解时 action 里用到。

### @Resource 和 @Autowired/ @Qualifier 的区别？

* @Autowired 根据类型注入
* @Resource 默认根据名字注入，其次按照类型搜索
* @Autowired 和 @Qualifier 两个结合起来可以根据名字和类型注入

### @RequestMapping 注解作用？

* 是一个用来处理请求地址映射的注解，可用于类或方法上。
* 用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。





## Spring Boot面试题

### Maven的Scope区别和描述

* 一组 dependency 一般包含4个标签，groupId 和 artifactId 相当于项目的定位。

* groupId 是包名，artifactId 是唯一ID。version 代表版本号。而 scope 是为了限制 dependency 的作用范围

* compile：是scope的默认值，表示此依赖会参与项目的编译,测试,运行和打包

* provided：会参与编译，测试和运行。不会被打包到 artifact 中

* runtime：不会参与编译阶段.但在测试,运行和打包阶段都会参与

* test：只参与测试和执行阶段

  

* system：需要告知maven如何去找到依赖,如果需要引用的依赖在Maven仓库不存在时会使用

* import：从其他 pom 文件中导入依赖

### 描述Spring @Configuration @Bean @ComponentScan @PropertySource @Value注解

* @Configuration配置类
* @Bean创建bean交由spring管理
* @ComponentScan 包扫描，扫描多个包
* @PropertySource获取配置文件
* @Value 获取配置文件中的值

### 什么是 Spring Boot，优点和缺点?

* Spring Boot 是 Spring 开源组织下的子项目，是 Spring 组件一站式解决方案，主要是简化了使用 Spring 的难度，简省了繁重的配置，提供了各种启动器，开发者能快速上手。

* 容易上手，提升开发效率，开箱即用，远离繁琐的配置。
  提供了一系列大型项目通用的非业务性功能

  没有代码生成，也不需要XML配置。
  避免大量的 Maven 导入和各种版本冲突。

* 例如：内嵌服务器、安全管理、运行数据监控、运行状况检查和外部化配置等。

* 版本迭代速度很快，一些模块改动很大

  由于不用自己做配置，报错时很难定位

### 什么是 yml ? 语法格式（说3点)

* YAML 是一种人类可读的数据序列化语言。它通常用于配置文件。YAML 具有分层配置数据。
* 使用缩进表示层级关系
* 缩进时不允许使用 Tab键，只允许使用空格
* 缩进的空格的数目不重要，只要相同层级的元素左对齐即可
* 大小写敏感

### Spring Boot (4个注解)并说明其作用

* @SpringBootApplication：核心启动类的注解，是一个组合注解
* @SpringBootConfiguration： Spring Boot 的配置注解
* @EnableAutoConfiguration：自动配置注解，根据依赖自动配置项目的配置项
* @AutoConfigurationPackage：将该注解所在的包作为自动配置包
* @SpringBootTest：Spring Boot 的测试注解

### Spring Boot 的核心注解是哪个？主要由哪几个注解组成的？

* 启动类上面的注解是 @SpringBootApplication，它也是 Spring Boot 的核心注解，主要组合包含了以下 3 个注解：
* @SpringBootConfiguration：组合了 @Configuration 注解，实现配置文件的功能。
* @EnableAutoConfiguration：打开自动配置的功能，也可以关闭某个自动配置的选项
* @ComponentScan：Spring 组件扫描。

### Spring-boot-maven-plugin 插件作用

* Spring Boot的Maven插件能够以Maven的方式为应用提供Spring Boot的支持，即为Spring Boot应用提供了执行Maven操作的可能。
* Spring Boot Maven plugin能够将Spring Boot应用打包为可执行的jar或war文件，然后以通常的方式运行Spring Boot应用。

### Spring Boot 自动配置的原理

* 注解 @EnableAutoConfiguration，@Configuration，@ConditionalOnClass 就是自动配置的核心，@EnableAutoConfiguration 给容器导入META-INF/spring.factories 里定义的自动配置类。
* 筛选有效的自动配置类。
* 每一个自动配置类结合对应的 xxxProperties.java 读取配置文件进行自动配置功能

### Spring Boot 读取配置文件的方式

* 读取 application 文件
* @Value 注解读取方式
* @ConfigurationProperties 注解读取方式
* @PropertySource + @Value 注解读取方式
* @PropertySource + @ConfigurationProperties 注解读取方式
* Environment 读取方式

### application 和 bootstrap 配置文件的区别

* bootstrap (. yml 或者 . properties)：bootstrap 由父 ApplicationContext 加载的，比 applicaton 优先加载，配置在应用程序上下文的引导阶段生效。且 bootstrap 里面的属性不能被覆盖；
* application (. yml 或者 . properties)： 由ApplicatonContext 加载，用于 spring boot 项目的自动化配置。
