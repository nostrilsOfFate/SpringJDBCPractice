package practice.HW1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHW1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic(), new RockMusic());
        musicPlayer.playMusic(MusicType.CLASSICAL);
        musicPlayer.playMusic(MusicType.ROCK);

        context.close();
    }
}
