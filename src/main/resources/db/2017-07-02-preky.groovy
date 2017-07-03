package db

/**
 * Created by huiyu.chen on 2017/7/2.
 *
 */
databaseChangeLog(logicalFilePath: '2017-07-02-preky.groovy'){
    changeSet(author: 'huiyuchen', id: '2017-07-02-huiyuchen-1'){
        createTable(tableName: "user"){
            column(name: 'user_id', type: 'INT UNSIGNED', autoIncrement: true, remarks: '用户id'){
                constraints(primaryKey: true)
            }
            column(name: 'user_num', type: 'VARCHAR(32)', remarks: '用户账号')
            column(name: 'user_name', type: 'VARCHAR(32)', remarks: '用户名')
            column(name: 'user_password', type: 'VARCHAR(32)', remarks: '密码')
            column(name: 'user_img', type: 'VARCHAR(32)', remarks: '头像')
            column(name: 'user_mail', type: 'VARCHAR(32)', remarks: '邮箱地址')
            column(name: 'user_phone', type: '', remarks: '联系方式')
            column(name: 'user_sex', type: 'VARCHAR(2)', remarks: '性别')
            column(name: 'user_status', type: 'VARCHAR(2)', remarks: '当前状态')
            column(name: 'user_birthday', type: 'TIMESTAMP', remarks: '出生日期')
            column(name: 'created_Date', type: 'TIMESTAMP', remarks: '创建时间')
            column(name: 'created_by', type: 'BIGINT UNSIGNED', remarks: '创建用户ID')
            column(name: 'updated_Date', type: 'TIMESTAMP', remarks: '更新时间')
            column(name: 'updated_by', type: 'BIGINT UNSIGNED', remarks: '更新用户ID')
        }
    }
}
