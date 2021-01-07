package practice.HW2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> listMusic = new ArrayList<>();

    @Qualifier()
    private List<Music> listMusic2 = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> listMusic){
       this.listMusic=listMusic;
    }

    public List<Music> getListMusic() {
        return listMusic;
    }

    public String playMusic(){
        Random random = new Random();
        return "Playing: " + listMusic.get(random.nextInt(listMusic.size())).getSong()
                + " with volume " + this.volume;
    }

}
