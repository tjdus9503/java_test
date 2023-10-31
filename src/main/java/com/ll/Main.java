package com.ll;

public class Main {
    public static void main(String[] args){
        System.out.println("main 함수가 실행되었습니다.");
    }


}

interface TV {
    final int MAX_VOLUME = 100;
    void turnOn();
    void turnOff();
    void changeVolume(int volume);
    void changeChannel(int channel);
}