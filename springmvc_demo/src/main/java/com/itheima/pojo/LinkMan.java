package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 包名:cn.itcast.pojo
 * 作者:Leevi
 * 日期2020-06-11  14:54
 * 1. 实现Serializable接口
 * 2. 成员变量私有，变量名和查询的结果的字段名保持一致
 * 3. 变量类型如果是基本数据类型则声明成包装类型
 * 4. 给所有私有成员变量提供公有的get和set方法
 * 5. 如果要打印当前类的对象，则重写toString方法
 * 6. 一定保证当前类有空参构造
 *
 * 使用Lombok简化实体类的开发
 * 1. idea中下载；lombok插件
 * 2. 在要使用lombok的项目中引入lombok的依赖
 *
 * Data 注解: 添加toString方法、equals方法、hashCode方法、各个变量的get和set方法
 * AllArgsConstructor 注解: 添加全参构造
 * NoArgsConstructor 注解: 无参构造
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LinkMan implements Serializable {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String address;
    private String qq;
    private String email;

}
