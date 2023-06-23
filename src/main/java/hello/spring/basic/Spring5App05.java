package hello.spring.basic;

import hello.spring.bean.Spring5Bean03;
import hello.spring.bean.Spring5Bean04Factory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Spring5App05 {
    // spring framework 첫 번째 사례
    // 인사말을 한국어, 영어, 일본어로 출력하도록 기능 추가


    public static void main(String[] args) {
        BeanFactory bf = new XmlBeanFactory(
                new FileSystemResource("src/bean05.xml"));

        Spring5Bean03 bean = null;

        bean = (Spring5Bean03) bf.getBean("kor");
        bean.sayHello("스프링5!!");

        bean = (Spring5Bean03) bf.getBean("eng");
        bean.sayHello("Spring5!!");

        bean = (Spring5Bean03) bf.getBean("jpn");
        bean.sayHello("スプリング5!!");

    }

}
