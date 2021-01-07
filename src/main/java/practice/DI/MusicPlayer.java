package practice.DI;

import practice.IoC.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
//    private Music music;
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;


    //IoC через конструктор
    public MusicPlayer(
            //Music music
            List<Music> musicList
    ){
       this.musicList=musicList;
       // this.music = music;

    }

    //IoC через сеттер
//    public void setMusic(Music music) {
//        this.music = music;
//    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer(){}

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

//    public void playMusic(){
//        System.out.println("Playing " + music.getSong());
//    }

    public void playMusicList(){
        System.out.print("Playing ");
        for (Music music : musicList) {
            System.out.println(music.getSong());
        }
    }
}
