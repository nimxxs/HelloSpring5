package hello.spring.basic;

import hello.spring.bean.Spring5Bean03;
import hello.spring.bean.Spring5Bean03Eng;
import hello.spring.bean.Spring5Bean03Jpn;
import hello.spring.bean.Spring5Bean03Kor;

public class Spring5App03 {
    // 네 번째 사례
    // 인사말을 한국어, 영어, 일본어로 출력하도록 기능 추가

    public static void main(String[] args) {
        // 인터페이스는 불완전 클래스이기 때문에
        // 객체화 불가
        Spring5Bean03 app03 =  null;

        app03 = new Spring5Bean03Kor();
        app03.sayHello("스프링5!!");

        app03 = new Spring5Bean03Eng();
        app03.sayHello("Spring5!!");

        app03 = new Spring5Bean03Jpn();
        app03.sayHello("スプリング5!!");

    }

}
