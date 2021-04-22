package edu.xcdq;

public class Main {

    public static void main(String[] args) {
	    System.out.println(1*0.4+1*0.6);
        System.out.println(1*0.4+2*0.6);
        System.out.println(1*0.4+3*0.6);
        System.out.println(1*0.4+4*0.6);
        System.out.println(1*0.4+5*0.6);
        System.out.println(1*0.4+6*0.6);

        System.out.println(add(1,1));
        System.out.println(add(1,2));
        System.out.println(add(1,3));
        System.out.println(add(1,4));
    }
    //把一些列的步骤放在一个方法当中管理起来，供后续反复调用  该过程叫做方法的封装
    public static double add(int a,int b){
        return  a*0.4 +  b*0.6;
    }
}
