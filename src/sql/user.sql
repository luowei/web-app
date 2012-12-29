
use test;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id编号',
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(200) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `sex` enum('male','female','unknown') COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '性别',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `address` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
  `profile` varchar(1024) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

insert into `user` (`id`, `username`, `password`, `sex`, `age`, `address`, `profile`) values('1','luowei','luowei','male','23','中国上海','一个好人。。。。。');
insert into `user` (`id`, `username`, `password`, `sex`, `age`, `address`, `profile`) values('2','test','test','male','20','中国北就','一个测试用户...');
