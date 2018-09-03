package org.gonnys;

public class Main {

    public static void main(String[] args) {
        Horse[] arr = new Horse[4];
        arr[0] = new Horse("인재(검은폭포)");
        arr[1] = new Horse("영준(에이셉비)");
        arr[2] = new Horse("고은(전설의다크소울)");
        arr[3] = new Horse("아람(찌꾸)");

        for (Horse h : arr) {
            h.start();

        }
//        Looper looper = new Looper();
//
//        new Thread(() -> {
//          looper.loop();
//        }).start(); //
//        looper.loop();
//
//        new Thread(() -> {
//            looper.loop();
//        }).start();
//
//
//        looper.loop();
//
    }
}
