package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 2");
        int[][] array = new int[5][5];
        elemMatrix(array);
        //вызов функции поиска дубликатов
        System.out.println("Задача 1");
        arrayValue();
    }

    public static void arrayValue(){
        //ввод размера массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Введите элементы массива");
        //ввод элементов массива
        for(int i=0; i<size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("Создан массив: "+Arrays.toString(myArray));
        System.out.println("Индексы дубликатов: ");
        //проходим по всему массиву, и если были найдены дубликаты, выводим их индексы в консоль
        for(int i=0; i<myArray.length; i++) {
            for (int j=i+1; j<myArray.length; j++) {
                if(myArray[i] == myArray[j]) {
                    System.out.println(j);
                }
            }
        }
    }

    //функция поиска максимального и минимального элементов в матрице
    public static void elemMatrix(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int)(Math.random()*10);
            }
        }

        //выводим матрицу в консоль
        printMatrix(array);

        //считаем максимальный элемент матрицы
        int MaxValue = 0;
        int maxi = 0, maxj = 0;
        //проходим по всей матрице
        for (int i = array.length-1; i > 0; i--) {
            for (int j = array.length-1; j > 0 ; j--) {
                //если есть два максимальных элемента, то используем тот, чья сумма индексов больше
                if(array[i][j] > MaxValue){
                    MaxValue = array[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }


        maxi = maxi+1;
        maxj = maxj+1;
        System.out.println("Максимальный элемент матрицы:");
        System.out.println("array[" + maxi + "][" + maxj + "] = " + MaxValue);



        //находим минимальный элемент матрицы
        int mini = 0;
        int minj  = 0;
        int MinValue = array[0][0];
        //проходим по всей матрице
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                //если встретились два минимальных, то выбираем того, чья сумма индексов меньше
                if(array[i][j] < MinValue){
                    MinValue = array[i][j];
                    mini = i;
                    minj = j;
                }
            }
        }
        mini = mini+1;
        minj = minj+1;
        System.out.println("Минимальный элемент матрицы:");
        System.out.println("array[" + mini + "][" + minj + "] = " + MinValue);

    }


    //функция вывода матрицы на экран
    public static void printMatrix(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
