package com.gkain.weather.lib;
class Value {
    int i;
}
public class Compare {
    public static void  main (String[] args){

        Integer a1 = new Integer(50);
        Integer a2 = new Integer(50);
        Value v1 = new Value();
        Value v2 = new Value();
        int q1 =5;
        int q2 =5;
        System.out.println("equals " +a1.equals(a2)); // сравнивание содержимого объектов
        System.out.println(a1==a2); // Сравнение ссылок
// System.out.println(q1.equals(q2)); // error
        v1.i=v2.i=100;


        System.out.println("Sravnenie v1 v2 ");
        System.out.println(v1.equals(v2)); // сравнивает ссылки ( нужно переопределить метод)
        System.out.println("Max , min  (int) "+ Integer.MAX_VALUE + Integer.MIN_VALUE);
    }
}
