# 

**1**、配置文件application.properties中添加

**management.endpoint.shutdown.enabled=true** 开启actuator的shutdown的端点

**2、**

```java
org.geektimes.service.ShutdownService定义一个post类型的shutdown方法
```

```
org.geektimes.TestShutdownService是测试类。
```

