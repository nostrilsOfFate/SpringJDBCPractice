package practice.HW1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicType type){
        Random random = new Random();
        int randNum = random.nextInt(3);

        switch (type) {
            case ROCK:System.out.println(classicalMusic.getSongs().get(randNum));
            case CLASSICAL:System.out.println(rockMusic.getSongs().get(randNum));
            default: System.out.println("ERROR");
        }
    }



}
