package practice.HW2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestJavaCodeConf {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer mc = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(mc.playMusic());
        context.close();
    }
}
