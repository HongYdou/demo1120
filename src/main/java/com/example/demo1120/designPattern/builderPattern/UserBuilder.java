package com.example.demo1120.designPattern.builderPattern;

public class UserBuilder {


    // 下面是和 User 一模一样的一堆属性
    private String  name;
    private String password;
    private String nickName;
    private Integer age;

    // 链式调用设置各个属性值，返回 this，即 UserBuilder
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder nickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }
    // build() 方法负责将 UserBuilder 中设置好的属性“复制”到 User 中。
    // 当然，可以在 “复制” 之前做点检验
    public User build() {
//        if (name == null || password == null) {
//            throw new RuntimeException("用户名和密码必填");
//        }
//        if (age <= 0 || age >= 150) {
//            throw new RuntimeException("年龄不合法");
//        }
//        // 还可以做赋予”默认值“的功能
//        if (nickName == null) {
//            nickName = name;
//        }
        //可以通过构造方法构建
        //return new User(name, password, nickName, age);
        User user = new User();
        if (age!=null){
            user.setAge(age);
        }
        if (null!=name&&!"".equals(nickName)){
            user.setName(name);
        }
        if (null!=nickName&&!"".equals(nickName)) {
            user.setNickName(nickName);
        }
        if (null!=password&&!"".equals(password)) {
            user.setPassword(password);
        }
        return user;
    }
}
