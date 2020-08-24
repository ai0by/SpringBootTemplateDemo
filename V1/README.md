# 规范及目录结构

## 核心代码块及演示
```
demo
├─DemoApplication.java
├─config
|    └Swagger2.java # swagger文档配置
├─service
|    └TestService.java # 后缀以Service结尾，服务层
├─pojo
|  └UserPojo.java  # 后缀以Pojo结尾实体，可以把POJO作为支持业务逻辑的协助类（出入参）
├─exception
|     ├─BaseExceptionInfo.java # 接口 基类接口
|     ├─BizException.java  # 自定义异常类型
|     └GlobalExceptionHandler.java # 全局异常处理
├─entry
|   ├─ResultBody.java  # 返回值到前端格式处理
|   └UserEntry.java  # 后缀以Entry结尾，数据库实体，可以配合Pojo完成业务逻辑
├─enums
|   └CommonEnum.java # 公共枚举类
├─dao
|  └UserDao.java  # model层 持久层 后缀以Dao结尾的接口类型，配合mybatis使用
├─controller
|     └TestController.java  # 控制层，入口


example
├─demo
|  ├─DemoApplication.java
|  ├─service
|  |    └TestService.java
|  ├─pojo
|  |  └UserPojo.java
|  ├─exception
|  |     ├─BaseExceptionInfo.java
|  |     ├─BizException.java
|  |     └GlobalExceptionHandler.java
|  ├─enums
|  |   └CommonEnum.java
|  ├─entry
|  |   ├─ResultBody.java
|  |   └UserEntry.java
|  ├─dao
|  |  └UserDao.java
|  ├─controller
|  |     └TestController.java

```
核心配置及mybatis文件
```
resources
├─application-dev.yml  # 开发版配置文件
├─application.yml   # 指定配置文件路径
├─logback.xml  # logback配置
├─mapper   # mybatis mapper配置文件路径，在application中需要指定该路径
|   └UserMapper.xml  # 以Mapper结尾的mybatis配置文件
```

