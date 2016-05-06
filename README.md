#Ostar
----
###部署条件
* 安装JDK7或以上版本
* 安装Tomcat7或以版本
* 安装Zookeeper3.4.6

###配置步骤
* 将apache-tomcat-7.0.67\conf\server.xml文件中的<Connector port="8080"...>增加URIEncoding="UTF-8"属性，以支持GET请求时中文参数
* 在模块ostar-security\src\main\resources\config.properties文件中配置连接用户权限库的数据库、Zookeeper服务注册中心地址/端口号
* 在模块ostar-analysis\src\main\resources\config.properties文件中配置连接分析库的数据库、Zookeeper服务注册中心地址/端口号
* 在模块ostar-analysis-web\src\main\resources\config.properties文件配置Zookeeper服务注册中心地址/端口号

###部署步骤
* 安装IDE开发工具，必须支持Maven工程文件导入，例如IngelliJ IDEA或者Eclipse，建议IngelliJ IDEA
* 参照以下网址，将DUBBOX编译安装至本地Maven仓库中
```js
https://github.com/dangdangdotcom/dubbox 
```
* 将项目从GIT上Clone至本地（git clone git://...）
* 将项目以Maven工程的方式导入IDE中
* 使用Maven命令package将根目录下所有模块进行打包，在不同的TOMCAT实例中部署
```js
将Web模块ostar-analysis-web/target/ostar-analysis-web-1.0-SNAPSHOT.war文件拷贝至apache-tomcat-7.0.67/webapps目录下，并更名为ROOT.war
将服务模块ostar-analysis/target/ostar-analysis-1.0-SNAPSHOT.war文件拷贝至apache-tomcat-7.0.67/webapps目录下，并更名为ROOT.war
将服务模块ostar-security/target/ostar-security-1.0-SNAPSHOT.war文件拷贝至apache-tomcat-7.0.67/webapps目录下，并更名为ROOT.war
```
* 启动Tomcat，访问http://IP:8080
```js
    示例登陆用户admin/admin具有管理员权限，wxp/wxp具有普通权限
```
    
###模块介绍
* ostar-pojo：项目共用的POJO对象，对应于数据库的表
* ostar-api：各服务模块API接口定义
* ostar-infrastructure：数据库访问基础功能定义
* ostar-security：用户权限及管理相关
* ostar-analysis：分析服务实现模块
* ostar-analysis-web：分析平台展现Web模块