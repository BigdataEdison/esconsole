

ELasticsearch 查询平台(es-console)功能 eleme—ES查询平台致力于打造集成查询、管理、监控于一身，能够为公司提供ELasticsearch服务的一款产品。 
查询平台

    集群概览（查看集群节点的情况）
    索引概览（查看所有的索引）
    数据浏览（对索引数据进行浏览）
    基本查询（对索引数据进行精确匹配，模糊匹配，范围查询）
    复合查询（DSL语句查询）

监控平台

    对索引速度、搜索速度、内存磁盘使用、JVM GC、线程数、QPS等进行实时监控

权限管理 
	ES自身安全：通过使用search guard插件做了ES集群自身的安全。
	Search-guard是Elasticsearch集群部署在Linux服务器上面的一层安全认证，保证http和tcp通信访问是安全。通常的情况下，连接 ES 有两种方式，一种是 http 接口，默认端口 9200，主要用于非 Java 语言客户端，一种是 TCP，默认端口是 9300，主要用于 ES 集群内节点互联或 Java 客户端访问 ES 集群。Search-guard对这两种访问方式都有安全措施。 提供用户组的权限。系统管理里面有用户管理和角色管理两个大类：（1）用户管理中有一栏是修改权限，可指定该用户为哪一个用户组。设定后，可以修改。不 同的用户组的权限控制完全不同，访问的集群数据也不同。（2）角色管理，即为用户组权限管理，可以授权的勾选。授权生成之后，也可以修改授权。 权限控制的粒度到集群级别。这样，是为了保证产研部门的业务人员只能看到自己部门的集群。当然，如果想看到其他部门的数据，可以申请权限。申请通过后，我们审批。 索引级别。根据业务需求，考虑权限到索引级别。 项目说明


具有如下特点

    轻量级的权限系统，只涉及Spring、Shiro、Mybatis后端框架，降低学习使用成本
    友好的代码结构及注释，便于阅读及二次开发
    支持HTML、JSP、Velocity、Freemarker等视图，零技术门槛
    灵活的权限控制，可控制到页面或按钮，满足绝大部分的权限需求
    页面交互使用Vue2.x，极大的提高了开发效率
    完善的代码生成机制，可在线生成entity、xml、dao、service、html、js、sql代码，减少70%以上的开发任务
    引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
    引入API模板，根据token作为登录令牌，极大的方便了APP接口开发
    引入Hibernate Validator校验框架，轻松实现后端校验
    引入云存储服务，已支持：七牛云、阿里云、腾讯云等
    引入路由机制，刷新页面会停留在当前页

项目结构

esconsole
├─doc  项目SQL语句
├─es-common 公共模块
│  ├─annotation 公共注解
│  ├─oss 云存储服务
│  ├─validator 后台校验
│  └─db.properties 数据库配置文件
│ 
├─es-api API模块（接口开发）
│ 
├─es-gen 代码生成器模块
│  ├─template 代码生成器模板（可增加或修改相应模板）
│  └─generator.properties 配置文件（配置包名、类型转换等）
│ 
├─es-schedule 定时任务模块
│
├─es-shiro 权限模块
│ 
├─es-shiro-dept 部门权限模块（待开发）
│ 
├──es-web 管理后台模块
│  ├─js 系统业务js代码
│  ├─statics 第三方库、插件等静态资源
│  ├─index.html AdminLTE主题风格（默认主题）
│  └─index1.html Layui主题风格

技术选型：

    核心框架：Spring Framework 4.3
    安全框架：Apache Shiro 1.3
    视图框架：Spring MVC 4.3
    持久层框架：MyBatis 3.3
    定时器：Quartz 2.2
    数据库连接池：Druid 1.0
    日志管理：SLF4J 1.7、Log4j
    页面交互：Vue2.x

软件需求

    JDK1.7+
    MySQL5.5+
    Tomcat7.0+
    Maven3.0+

