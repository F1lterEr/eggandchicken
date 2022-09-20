package com.company;

import java.util.Scanner;

public class Main extends Thread {
    Scanner scanner = new Scanner(System.in);
    public void run(){
        System.out.println("Слово Курица было произнесено: (введите число)");
        int h = scanner.nextInt();
        for (int i = 0; i < h; i++){
            try {
                sleep(1000);
            }
            catch (InterruptedException e){}
            System.out.println("Яйцо");
        }
    }
}

