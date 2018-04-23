package com.gkain.weather.lib;
class  Letter{
    char c;
    String s;
}
public class Imena {
     static void f(Letter y){
         y.c = 'z';
     }
     static void d(Letter y) {
         y.c = 'v';
         y.s = "dd";
     }
    public  static  void main (String [] args){
         Letter x = new Letter();
         x.c = 'a';
         System.out.println("1:x.c... "+x.c);
         f(x);
         System.out.println("2:x.c... "+x.c);
         d(x);
         System.out.println("3:x.c... "+x.c);
    }
}
