package com.ll;

public class Main {
    public static void main(String[] args){
        System.out.println("main 함수가 실행되었습니다.");
        System.out.println("한 줄 추가했어요.");
        System.out.println("두 줄 추가했어요.");
        System.out.println("세 줄 추가했어요.");
    }


}

interface TV {
    final int MAX_VOLUME = 100;
    void turnOn();
    void turnOff();
    void changeVolume(int volume);
    void changeChannel(int channel);
}