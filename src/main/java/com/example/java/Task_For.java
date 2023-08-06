package com.example.java;

public class Task_For {
    int start;
    int stop;

    public Task_For(){
        start = 0;
        stop = 0;
    }

    public Task_For(int start_add, int stop_add){
        start = start_add;
        stop = stop_add;
    }

    public int K_four(int member){
        if(member % 4 == 0){
            return member;
        }
        return 0;
    }

    public void Print(){
        int i;
        for(i = stop; i > start; i--){
            if(K_four(i) != 0){
                System.out.println(i + " ");
            }
        }
    }
}

