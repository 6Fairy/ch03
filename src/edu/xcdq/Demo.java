package edu.xcdq;
/*
类的封装
   1 成员变量必须私有化 private修饰
   2 使用getter setter 提供对外的访问方式
 */

public class Demo {
    private String name;
    private int age;
    private int  weight;
    private int  high;


    //设置值  setter
    public void setName(String name) {
        this.name = name;
    }

    //获取值  getter
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public  void setWeight(int weight){ this.weight = weight;}

    public int getWeight() {
        return this.weight;
    }
    public  void setHigh(int high){this.high=high;}
    public  int  getHigh(){return this.high;}
}
