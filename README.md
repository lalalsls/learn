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
5. mq引入 RocketMQ或者Kafka，建议消息列队选择前者，后者尝试日志分析
6. ES引入（最后再做）
7. 熔断机制（目前完全不懂这个能干什么）
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


