package com.example.java;

public class Ari {
    int summa = 0;
    int last_number = 0;
    int count_class = 0;
    int summa_chet = 0;
    int last_number_chet = 0;
    int count_class_chet = 0;

    public Ari(){
        summa = 0;
        last_number = 0;
        count_class = 0;
        summa_chet = 0;
        last_number_chet = 0;
        count_class_chet = 0;
    }

    public Ari(int last_number_add){
        summa = last_number_add;
        last_number = last_number_add;
        count_class++;
        if(last_number_add % 2 == 0){
            summa_chet = last_number_add;
            last_number_chet = last_number_add;
            count_class_chet++;
        }
    }

    public void Ari_Add(int last_number_add){
        summa += last_number_add;
        last_number = last_number_add;
        count_class++;
        if(last_number_add % 2 == 0){
            summa_chet += last_number_add;
            last_number_chet = last_number_add;
            count_class_chet++;
        }
    }

    public void Ari_chet(){
        float SA_OOP_chet;
        SA_OOP_chet = (float)summa_chet/count_class_chet;
        System.out.println("Среднее арифметическое четных чисел вашего ввода = " + SA_OOP_chet);
    }

    public void Print(){
        float SA_OOP;
        SA_OOP = (float)summa/count_class;
        System.out.println("Среднее арифметическое вашего ввода = " + SA_OOP);
    }
}
