#Spring Security 学习笔记
###如何测试   
启动项目   
```$xslt
localhost:8080/hello  //会跳转到login页面
localhost:8080/和localhost:8080/home 白名单不会拦截
```
---
关键配置文件   
/config/MySecurityConfig.java   

---
用户名：随意输入   
密  码：123456
---

数据库增加   
```aidl
INSERT INTO `learn`.`user`(`id`, `user_name`, `pass_word`) VALUES ('168463588753674240', 'szhuan', '$2a$10$T6KvQ3OgTIUBMLaJD1t2fOBxs9yvYU8f6ERn6Pz5KLVPqRiCKefdO');

```

---

###如何解除认证(在com.learn.demo.config.MySecurityConfig里)   
```aidl
/**
     * 开发其他模块时候把这个注释掉就解除权限验证了
     * @param web
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/**");
    }
```   
---
