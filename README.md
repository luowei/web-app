web-app
=======

一个基础的采用spring mvc的maven web骨架项目，
已配置好了spring data jpa，和spring jdbcTeimplate
的自定义的实现。

-------------------------------------------------------------
1.采用spring mvc框架；
2.既有对spring data jpa实现的应用；
3.也有对spring jdbctemplate的应用；

在com.common.dao中，UserDao的实现是用spring data jpa来完成；
custom子包中BaseDao是基础接口， 其实现类是 BaseDaoImpl 继承了 JdbcDaoSupport
UserDaoCustom是自定义的操作持久层的接口，其实现类是 UserDaoImpl 是BaseDaoImpl的子类，从而可以方便的使用jdbcTemplate;

注意：对于持久操作类，如果要使spring data jpa的实现与自定义的现在结合，相辅相承，则自定义的接口名称须尾缀Custom,自定义
实现名称尾缀应为：jpa的接口+Impl;
例如：UserDao 由 spring data jpa的simpleReposity实现，UserDaoCustom是自定义的实现接口，UserDaoImpl是实现UserDaoCustom
的实现；
