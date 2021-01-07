package practice.firstBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import practice.firstBean.TestBean;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testbean = context.getBean("testBean", TestBean.class);
        // id od bean and class of bean
        System.out.println(testbean.getName());

        context.close();
    }
}
