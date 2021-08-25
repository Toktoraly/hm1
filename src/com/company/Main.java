package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    String name = "Toktorbai";
    String word = "Salam aleikum";
    final int num = 111;
    name = word +num;
    name = "Toktorbai";
    name = name + word + num;
        System.out.println(name);
    if (num<0){
        System.out.println("Вы сохранили отрицательное число!!");
        if(num>0){
            System.out.println("Вы сохранили положительное число!!");
        }
    }else{
        System.out.println("Вы сохранили ноль");
    }
        Scanner scan = new Scanner(System.in);
        System.out.println("Как к вам обращаться? Мистер? Мисс?");
        String regal = scan.next();
        System.out.println("Введите Ваше имя "+regal);
        String nam = scan.next();

        System.out.println("Введите ваш ваш возраст "+regal+" " + nam);
        int age = scan.nextInt();
        System.out.println("Очень приятно было с вам поговорить!" +regal+" "+ nam);


    }

}
