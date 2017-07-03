#!/usr/bin/env bash

# 获取初始化数据库的jar包
mkdir -p target

if [ ! -f target/hap-liquibase-tools.jar ]
then
    curl http://nexus.saas.hand-china.com/content/repositories/rdc/com/hand/hap/cloud/hap-liquibase-tools/1.0/hap-liquibase-tools-1.0.jar -o target/hap-liquibase-tools.jar
fi

# 执行jar包
java -Dspring.datasource.url='jdbc:mysql://localhost:3306/prekydb?useUnicode=true&characterEncoding=utf-8&useSSL=false'\
 -Dspring.datasource.username=root\
 -Dspring.datasource.password=root\
 -Ddata.init=true -Ddata.drop=true\
 -Ddata.dir=target/classes\
 -jar hap-liquibase-tools.jar
