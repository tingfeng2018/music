--创建一个数据库
CREATE DATABASE music_ DEFAULT CHARACTER SET UTF8;

--切换数据库
USE music_


CREATE TABLE category(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '音乐分类名称'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='音乐分类表';

--插入歌曲分类嘻哈电子 民歌轻音乐爵士古典
INSERT INTO category(name) VALUES("流行"),("摇滚"),("乡村"),("民谣"),("R&B");

--用户角色表(此表为用户管理表)
CREATE TABLE role(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '用户角色名称'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='用户角色表';

--创建用户角色表
INSERT INTO role(name) VALUES("admin"),("public");

--歌曲来源表
CREATE TABLE source(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '歌曲来源：内地，港台，欧美，日本，韩国，其他'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='歌曲来源表';
--插入歌曲来源表
INSERT INTO source(name) VALUES("内地"),("港台"),("欧美"),("日本"),("韩国"),("其他");


--歌手类型
CREATE TABLE style(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '歌手类型名称,男；女；组合'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='歌手类型表';

--插入歌手类型
INSERT INTO style(name) VALUES("男"),("女"),("组合");

--歌手表(歌手姓名/组合/other)
CREATE TABLE singer(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '歌手名称',
	`style_id` INT NOT NULL  COMMENT '关联歌手类型表的主键',
	FOREIGN KEY (style_id) REFERENCES style(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='歌手表';

--插入歌手
INSERT INTO singer(name,style_id) VALUES("张杰",1000),("薛之谦",1000),("周杰伦",1000),("李圣杰",1000);

--专辑表
CREATE TABLE album(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '专辑名称',
	`singer_id` INT COMMENT '关联歌手主键',
	FOREIGN KEY (singer_id) REFERENCES singer(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='专辑表';


--音乐表
CREATE TABLE music(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT '音乐名称',
	`create_time` DATETIME COMMENT '创建时间',
	`music_url` VARCHAR(255) NOT NULL DEFAULT 'music/李圣杰 - 痴心绝对.mp3' COMMENT '歌曲地址',
	`music_img_url` VARCHAR(255) NOT NULL DEFAULT 'images/default.jpg' COMMENT '歌曲封面图地址',
	`category_id` INT NOT NULL COMMENT '关联类目表的主键 流行/摇滚/嘻哈/R&B....',
	`source_id` INT NOT NULL COMMENT '关联歌曲来源表的主键',
	`singer_id` INT NOT NULL COMMENT '关联歌手表ID',
	`album_id` INT  COMMENT '关联专辑表的主键',
	FOREIGN KEY (album_id) REFERENCES album(id),
	FOREIGN KEY (category_id) REFERENCES category(id),
	FOREIGN KEY (singer_id) REFERENCES singer(id),
	FOREIGN KEY (source_id) REFERENCES source(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='音乐表';

--插入音乐
INSERT INTO music(name,create_time,music_url,music_img_url,category_id,source_id,singer_id)
VALUES("痴心绝对",now(),"music/李圣杰 - 痴心绝对.mp3","images/default.jpg",1000,1001,1003);

--mv表
CREATE TABLE mv(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL COMMENT 'mv名称',
	`create_time` DATETIME COMMENT '创建时间',
	`mv_url` VARCHAR(255) NOT NULL DEFAULT 'music/李圣杰 - 痴心绝对.mp4' COMMENT 'mv地址',
	`mv_img_url` VARCHAR(255) NOT NULL DEFAULT 'images/default.jpg' COMMENT 'mv封面图地址',
	`category_id` INT NOT NULL COMMENT '关联类目表的主键 流行/摇滚/嘻哈/R&B....',
	`source_id` INT NOT NULL COMMENT '关联歌曲来源表的主键',
	`singer_id` INT NOT NULL COMMENT '关联歌手表ID',
	`album_id` INT  COMMENT '关联专辑表的主键',
	FOREIGN KEY (album_id) REFERENCES album(id),
	FOREIGN KEY (category_id) REFERENCES category(id),
	FOREIGN KEY (singer_id) REFERENCES singer(id),
	FOREIGN KEY (source_id) REFERENCES source(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='mv表';
INSERT INTO mv(name,create_time,mv_url,mv_img_url,category_id,source_id,singer_id)
VALUES("痴心绝对",now(),"music/李圣杰 - 痴心绝对.mp4","images/default.jpg",1000,1001,1003);



--用户表
CREATE TABLE user(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`name` VARCHAR(255) NOT NULL DEFAULT 'MUSIC' COMMENT '用户名称',
	`age` INT COMMENT '年龄',
	`email` VARCHAR(50) NOT NULL COMMENT '邮箱',
	`password` VARCHAR(100) NOT NULL COMMENT '密码',
	`gender` INT COMMENT '性别1:男，0:女',
	`role_id` INT NOT NULL COMMENT '关联角色表的主键',
	`preference_id` INT DEFAULT '1' COMMENT '用户偏好 1：流行,2:古典，3:R&B,4:电音...',
	`signature` VARCHAR(30) DEFAULT '我是歌神' COMMENT '用户签名',
	FOREIGN KEY (role_id) REFERENCES role(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='用户表';
--给邮箱添加唯一约束,防止用户登录的名字出现重复
ALTER TABLE user ADD UNIQUE (email);
--修改用户表name,密码的约束条件
--ALTER TABLE user modify `name` VARCHAR(255) NOT NULL DEFAULT 'MUSIC' COMMENT '用户名称';
--ALTER TABLE user modify `password` VARCHAR(255) NOT NULL DEFAULT '123456' COMMENT '密码';

--插入用户
INSERT INTO user(name,age,email,password,gender,role_id,preference_id,signature)
VALUES("管理01",18,"admin@163.com","111111",1,1000,1,"我是最美的");

--用户音乐视频关联表
CREATE TABLE user_music_mv(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
	`user_id` INT NOT NULL COMMENT '用户ID，关联用户表主键',
	`music_id` INT COMMENT '音乐ID，关联音乐表主键',
	`mv_id` INT COMMENT '视频ID，关联视频表主键',
	`isStutas` INT NOT NULL COMMENT '是否是视频或者是音频',
	FOREIGN KEY (user_id) REFERENCES user(id),
	FOREIGN KEY (music_id) REFERENCES music(id),
	FOREIGN KEY (mv_id) REFERENCES mv(id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=UTF8 COMMENT='用户音乐视频关联表';




--创建测试数据库表
CREATE TABLE demo(
  `id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  `name` VARCHAR(20) NOT NULL UNIQUE COMMENT '名字'
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET UTF8 COMMENT="测试表";
