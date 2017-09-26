# Spring Cloud Tutorial

spring cloud 教程

项目基于spring cloud 最新版本(Dalston), 包含或将会包含一系列重要组件:

- 服务注册与发现[eureka-server]
- 外部化配置中心[config-server]
- gateway网关[api-gateway]
- 断路器
- 链路追踪
- spring data整合
- spring boot admin

各组件的实现力求简单,不包含多节点 高可用的实现,以便于微服务入门.

更多内容, 欢迎关注微信公众号「黑客与杂家」, 共同学习、 分享、 实践。 

![sub](https://github.com/LeoYangbs/spring-cloud-tutorial/blob/master/docs/img/sub.jpg)

## 版本说明

| 版本     | 时间         | 内容                                       |
| ------ | ---------- | ---------------------------------------- |
| v0.0.1 | 2017-09-23 | 发布 eureka-server,config-server,api-gateway |
|        |            |                                          |
|        |            |                                          |
|        |            |                                          |

整体架构图:

![微服务架构](https://github.com/LeoYangbs/spring-cloud-tutorial/blob/master/docs/img/%E5%BE%AE%E6%9C%8D%E5%8A%A1%E6%9E%B6%E6%9E%84.png)

使用介绍

先后启动 eureka-server config-server api-gateway basic-service

注册中心面板:

![eureka](https://github.com/LeoYangbs/spring-cloud-tutorial/blob/master/docs/img/eureka.png)

网关调用basic-service GET:http://localhost:8080/basic-service/v1/micro/services/basic/fetch-config

或直接调用basic-service GET:http://localhost:8081/v1/micro/services/basic/fetch-config


response:

```
{
  "currenct_service ": "basic-service",
  "project_name ": "spring-cloud-tutorial"
}
```

配置仓库参考:https://github.com/LeoYangbs/config-repository






