package edu.xcdq;

public class testDemo {
    public static void main(String[] args) {
        /*Demo demo = new Demo();
        demo.name = "小明";
        demo.age = 99 ;
        System.out.println(demo.name);
        System.out.println(demo.age);*/


        Demo demo = new Demo();
        demo.setName("小明");
        demo.setAge(19);
        demo.setWeight(2);
        demo.setHigh(3);
        System.out.println(demo.getName());
        System.out.println(demo.getAge());
        System.out.println(demo.getWeight());
        System.out.println((demo.getHigh()));
    }
}
