package practice.IoC;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    //private Music music;
    //    //IoC
    //    @Autowired
    //    public MusicPlayer(Music music){
    //       this.music = music;
    //    }
    //
    //    public void playMusic(){
    //        System.out.println("Playing " + music.getSong());
    //    }



//    private Music music;
//    //IoC
//
//  //  public MusicPlayer(Music music){
//   //    this.music = music;
// //   }
//
//    public void playMusic(){
//        System.out.println("Playing " + music.getSong());
//    }



//    private ClassicalMusic classical;
//
//    private RockMusic rock;
//
//    @Autowired
//    public MusicPlayer(ClassicalMusic classical, RockMusic rock) {
//        this.classical = classical;
//        this.rock = rock;
//    }
//
//    public String playMusic() {
//        return "Playing " + classical.getSong();
//    }



//    @Autowired
//    @Qualifier("rockMusic")
//    private Music music;
//
//    public String playMusic() {
//        return "Playing " + music.getSong();
//    }



    private Music music1;

    private Music music2;

    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return "Playing " + music1.getSong() + ", "+ music2.getSong();
    }





}
