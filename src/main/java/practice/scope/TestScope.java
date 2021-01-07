package practice.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//scope practice
//        MusicPlayer mc = context.getBean("musicPlayerScope", MusicPlayer.class);
//        MusicPlayer mc1 = context.getBean("musicPlayerScope", MusicPlayer.class);
//
//        boolean comp = mc == mc1;
//
//        System.out.println(comp);
//        System.out.println(mc);
//        System.out.println(mc1);
//
//        mc.setVolume(23);
//
//        System.out.println(mc.getVolume());
//        System.out.println(mc1.getVolume());

        //init destroy methods practice

        ClassicalMusic classicalMusic = context.getBean("musicBeanClassicalScope", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


        context.close();
    }
}
