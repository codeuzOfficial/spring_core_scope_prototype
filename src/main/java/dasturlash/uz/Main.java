package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student1 = (Student) context.getBean("student");
        Student student2 = (Student) context.getBean("student");
        Student student3 = (Student) context.getBean("student");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}