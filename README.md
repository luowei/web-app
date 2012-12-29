#web-app

[web-app](https://github.com/luowei/web-app)是一个基础的采用spring mvc的maven web骨架项目，
已配置好了**spring data jpa**，和**spring jdbcTeimplate**的自定义的实现。

-------------------------------------------------------------
1. 采用spring mvc框架;
2. 既有对spring data jpa实现的应用;
3. 也有对spring jdbctemplate的应用;


在`com.common.dao`中，UserDao的实现是用spring data jpa来完成;
custom子包中BaseDao是基础接口， 其实现类是 BaseDaoImpl 继承了 JdbcDaoSupport;
UserDaoCustom是自定义的操作持久层的接口，其实现类是 UserDaoImpl 是BaseDaoImpl的子类，从而可以方便的使用jdbcTemplate;


**注意**：对于持久操作类，如果要使spring data jpa的实现与自定义的现在结合，相辅相承，则自定义的接口名称须尾缀**Custom**,自定义实现名称尾缀应为：**jpa的接口+Impl**;

> 例如：UserDao 由 spring data jpa的simpleReposity实现，UserDaoCustom是自定义的实现接口，UserDaoImpl是实现UserDaoCustom的实现；


###运行构建项目:
- 使用jetty插件运行: `clean jetty:run -e`
- 创建项目骨架: `clean archetype:create-from-project`
* intellij 截图:
![创建项目骨架 maven build](https://raw.github.com/luowei/web-app/master/doc/img/archetype.png)



###把骨架安装到本地仓库:
1. 进到项目的 target/generated-sources/archetype 目录下;
2. 运行: `clean install`


###把骨架发布到本地仓库:
 * 方法一:`clean deploy`
 * 方法二:手动上传archetype目录里的pom.xml 与 archetype/target下的web-app-archetype-1.0-RELEASE.jar




- [我的博客](http://blog.163.com/luowei505050@126):http://blog.163.com/luowei505050@126

- create with help of : [prose](http://prose.io):http://prose.io








