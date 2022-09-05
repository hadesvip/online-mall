# online-mall（领域驱动设计实践）
## 一、技术栈
* Java11
* Spring Cloud Alibaba 
  * Nacos 1.4.3
* Maven
* MySQL5.7
* Lombok

## 二、构建

```shell
cd online-mall/online-mall-start
mvn package spring-boot:repackage
cd target
java -jar online-mall-start-1.0.jar
```
