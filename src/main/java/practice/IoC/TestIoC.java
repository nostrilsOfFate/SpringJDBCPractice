package practice.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");
//        Music music = context.getBean("musicBeanIoC", Music.class);

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer mc = new MusicPlayer(music);//IOC внедрение зависимости вручную
//        mc.playMusic();
//
//        Music music2 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer mc2 = new MusicPlayer(music2);//IOC внедрение зависимости вручную
//        mc.playMusic();


//        MusicPlayer mc = context.getBean("musicPlayer",MusicPlayer.class);
//        mc.playMusic();


        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
