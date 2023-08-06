package com.example.java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void Input(int[] mass, int count){
        int a;
        Scanner scanner_number = new Scanner(System.in);
        for (int j = 0; j < count; j++){
            a = scanner_number.nextInt();
            mass[j] = a;
        }
    }

    public static void Input_Ari(Ari tmp, int count){
        int a;
        Scanner scanner_number = new Scanner(System.in);
        for (int j = 0; j < count; j++){
            a = scanner_number.nextInt();
            tmp.Ari_Add(a);
        }
    }

    public static void Print(int[] mass, int count){
        for (int j = 0; j < count; j++){
            System.out.println(mass[j]);
        }
    }

    public static float SA(int[] mass, int count){
        int summ = 0;
        float sa = 0;
        for (int j = 0; j < count; j++){
            summ += mass[j];
        }
        sa = (float)summ/count;
        return sa;
    }

    public static float SA_chet(int[] mass, int count){
        int summ = 0;
        int iter = 0;
        float sa_chet = 0;
        for (int j = 0; j < count; j++) {
            if (mass[j] % 2 == 0) {
                summ += mass[j];
                iter++;
            }
        }
        sa_chet = (float)summ/iter;
        return sa_chet;
    }

    public static void main(String[] args) {
        int count;
         Scanner scanner_count = new Scanner(System.in);
        System.out.println("Сколько чисел вы хотите ввести?");
        count = scanner_count.nextInt();
        System.out.println("Введите не более " + count + " чисел");
        int[] mass = new int[count];
        Input(mass, count);
        System.out.println("Среднее арифметическое вашего ввода = " + SA(mass, count));
        System.out.println("Среднее арифметическое четных чисел вашего ввода = " + SA_chet(mass, count));

        // Я не совсем понял надо ли через классы или просто кодом, поэтому второй вариант через ООП

        Ari tmp = new Ari();
        System.out.println("Введите не более " + count + " чисел");
        Input_Ari(tmp, count);
        tmp.Print();
        tmp.Ari_chet();

        //Задание 4 часть 2
        System.out.println("\nЗадание на цикл For");
        Task_For tmp_1 = new Task_For(1, 100);
        tmp_1.Print();

        //Задание 4 часть 3
        System.out.println("\nЗадание Цифры числа");
        System.out.println("Введите число");
        count = scanner_count.nextInt();
        Full_number tmp_2 = new Full_number(count);
        tmp_2.Summ();
        tmp_2.Summ_nechet();
        tmp_2.Max();
    }
}