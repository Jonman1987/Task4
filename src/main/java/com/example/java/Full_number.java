package com.example.java;

public class Full_number {
    int number = 0;

    public Full_number(){
        number = 0;
    }

    public Full_number(int digit){
        number = digit;
    }

    public void Summ(){
        int summ = 0;
        String number = String.valueOf(this.number);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            summ += j;
        }
        System.out.println("Сумма всех цифр: " + summ);
    }

    public void Summ_nechet(){
        int summ_n = 0;
        String number = String.valueOf(this.number);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            if (j % 2 != 0) {
                summ_n += j;
            }
        }
        System.out.println("Сумма всех нечетных цифр: " + summ_n);
    }

    public void Max(){
        int max = 0;
        int tmp = 0;
        String number = String.valueOf(this.number);
        for(int i = 0; i < number.length(); i++) {
            int j = Character.digit(number.charAt(i), 10);
            tmp = j;
            if(tmp > max){
                max = tmp;
            }
        }
        System.out.println("Максимальная цифра в числе: " + max);
    }
}
