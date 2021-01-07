package practice.JavaCodeConfiguration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;




    public Music getMusic1() {
        return music1;
    }

    public void setMusic1(Music music1) {
        this.music1 = music1;
    }

    public Music getMusic2() {
        return music2;
    }

    public void setMusic2(Music music2) {
        this.music2 = music2;
    }

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

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2
    ){
       this.music1=music1;
       this.music2=music2;
    }

    public String playMusic(){
        return "Playing: "+ music1.getSong() + " " + music2.getSong();
    }



}
