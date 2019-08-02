# learn
learn Spring boot  
## 技术路线设想  
1. Spring Boot
   1. Spring data mongodb 
   2. mybatis-plus
   3. flyway
   4. Spring Security （引入完成30%）SZHuan
2. React/ant design
3. Mongodb/MySql
4. Swagger-ui  http://localhost:8080/swagger-ui.html 文档页面
<br>swagger-ui接口文档,有如下几点问题
    1. 2.9.2版本有些bug,会在刷新页面后,后台报错((已修改)可以换旧版本或者只替换他扫描逻辑的依赖包)
    2. 另外实体类做传入参数时,他的实体类反射扫描,不能很好的显示继承的BaseEntity对象(目前无解决方案)

5. mq引入 RocketMQ或者Kafka，建议消息列队选择前者，后者尝试日志分析
6. ES引入（最后再做）
7. 熔断机制（目前完全不懂这个能干什么）   
(这个应该是和监控及微服务分布式一起做的,将所有的服务统一管理,当压力过大时,主动触发熔断,避免资源耗尽,有点像跳闸一样,现在想这个还太早)   
8. 九月份开始整合Hbase Kafka redis机制（目前Kafka简单实践已经成功）

## 业务功能
1. 基本的注册、登陆、用户管理、权限管理、添加新用户。




---
####2019-07-30 SZHuan 进度   
1.引入雪花id生成器   
2.创建User类   
3.单元测试User的Save方法   
 ```aidl
这个方法的id是在com.learn.demo.util.SnowFlakeUtil这个生成的。   
    password要用与Spring Security5配置中的加密方法相同，passwordEncoder.encode(你的password)。
```
4.引入swagger2文档生成器 http://localhost:8080/swagger-ui.html   
5.如想暂时关闭Security，请参考Security学习文档里面做了解释，请不要改动或者删除代码！！！！！！


