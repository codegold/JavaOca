package app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDrive {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Performer performer = (Performer) context.getBean("poeticDuke");
        performer.perform();
    }
}
