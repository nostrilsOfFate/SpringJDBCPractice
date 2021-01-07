package practice.DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //DI
        //MusicPlayer mc = context.getBean("musicPlayerDI", practice.DI.MusicPlayer.class);

        MusicPlayer mc = context.getBean("musicPlayerDI", practice.DI.MusicPlayer.class);
        //mc.playMusic();
        mc.playMusicList();
        System.out.println(mc.getName());
        System.out.println(mc.getVolume());
        context.close();
    }
}
