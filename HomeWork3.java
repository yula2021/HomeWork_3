package com.company;
     //Вариант 5.
import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {
    public static void main(String[] args) {
//5. Заполнить массив случайными неповторяющимися числами в диапазоне [m; n].
        int [] value = new int[20];
        Random num = new Random();
        for (int x = 0; x <value.length - 1; x++) {
            value[x] = x+1;
        }
        for (int x = 0; x < value.length-1; x++)  {
            int r = num.nextInt(20 - x) + x;
            int temp = value[x];
            value[x] = value[r];
            value[r] = temp;
        }
        System.out.println(Arrays.toString(value));
        System.out.println();

//Вывести в консоль фигуру, образованную числами: pattern 23
        StringBuilder sb = new StringBuilder("");
        for (int i = 5; i >= 0; i--) {
            String j;
            if (i == 4) {
                j = "1";
                sb = sb.append("1 1 1 1 " + j + "\n");
            }
            if (i == 3) {
                j = "2 2";
                sb = sb.append("1 1 1 " + j + "\n");
            }
            if (i == 2) {
                j = "3 3 3";
                sb = sb.append("1 1 " + j + "\n");
            }
            if (i == 1) {
                j = "4 4 4 4";
                sb = sb.append("1 " + j + "\n");
            }
            if (i == 0) {
                j = "5 5 5 5 5";
                sb = sb.append(j);

                System.out.println(sb);}
        }
    }
}
