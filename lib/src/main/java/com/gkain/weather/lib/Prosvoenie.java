package com.gkain.weather.lib;
 class Tank{
     /* static */ int level;
    int a;
    int b;
}
public class Prosvoenie {
    public static void main (String[]args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        Tank num = new Tank();
        t1.level=9;
        t2.level=47;
        System.out.println("1: t1,level:"+t1.level+",t2,level:"+t2.level);
        t1.level=t2.level;
        System.out.println("2: t1.level"+t1.level +",t2.level:"+ t2.level);
        t1.level=27;
        System.out.println("3: t1.level:" +t1.level+",t2.level:"+t2.level);


        num.a=5;
        num.b=10;
        num.a=num.b; // сохраняет 2 разных объекта , а не выбрасывает 1 из них
        System.out.println("a:"+num.a+"b:"+num.b+1);
        System.out.println(  num.a==num.b);


    }
}
