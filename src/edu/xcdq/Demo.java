package edu.xcdq;
/*
类的封装
   1 成员变量必须私有化 private修饰
   2 使用getter setter 提供对外的访问方式
 */

public class Demo {
    private String name;
    private int age;
    //设置值  setter
    public void setName(String name){
        this.name=name;
    }
    //获取值  getter
    public  String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age =age;
    }
    public  int getAge(){
        return this.age;
    }

}
