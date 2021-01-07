package practice.PrePostMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPrePost {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer mc = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(mc.getName());
        System.out.println(mc.getVolume());

        ClassicalMusic cm = context.getBean("classicalMusic", ClassicalMusic.class);
        //ClassicalMusic cm1 = context.getBean("classicalMusic", ClassicalMusic.class);
        // System.out.println(cm==cm1);
        System.out.println(cm.getSong());

        context.close();
    }
}
