package com.ll;

public class LambdaExam {
    public static void main(String[] args) {
        
        // myIf : 익명 클래스로 객체 생성
        MyIf myIf = new MyIf() {
            public void myFun() {
                System.out.println("Method from myIf");
            }
        };

        myIf.myFun();

        // myIf2 : 람다 표현식으로 작성
        MyIf myIf2 = () -> {
            System.out.println("Method from myIf2");
            System.out.println("...");
        };

        myIf2.myFun();

        // myIf3 : 한 줄이라서 중괄호를 없앰
        MyIf myIf3 = () -> System.out.println("Method from myIf3");

        myIf3.myFun();

        // myIf4 : 매개변수가 1개인 메소드가 있는 MyIf2
        MyIf2 myIf4 = (msg) -> System.out.println(msg);

        myIf4.myFun("Method from myIf4");

        // myIf5 : 매개변수가 가공없이 함수의 인자로 사용되며 호출 시, 메소드 참조로 작성 가능
        MyIf2 myIf5 = System.out::println;

        myIf5.myFun("Method from myIf5");

        // myIf6 : 정의해 놓은 메소드를 사용하여 재정의하기
        MyIf2 myIf6 = msg -> LambdaExam.print(msg);

        myIf6.myFun("Method from myIf6");

        // myIf7 : 매개변수 가공없이 함수의 인자로 들어갈 때, 해당 메소드를 메소드 참조로 작성하기
        MyIf2 myIf7 = LambdaExam::print;

        myIf7.myFun("Method from myIf7");
    }
    public static void print(String msg) {
        System.out.println(msg);
    }
}

interface MyIf {
    void myFun ();
}

interface MyIf2 {
    void myFun (String msg);
}