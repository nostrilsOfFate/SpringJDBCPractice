package practice.JavaCodeConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaCodeConf {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
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
