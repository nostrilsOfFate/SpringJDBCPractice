package practice.HW2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayerPrePost.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RaggyMusic raggyMusic() {
        return new RaggyMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), raggyMusic());
    }

//Как получить анотациями лист бинов? ---->
//    @Bean
//    @Qualifier("musicList")
//    public ClassicalMusic classicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    @Bean
//    @Qualifier("musicList")
//    public RockMusic rockMusic() {
//        return new RockMusic();
//    }
//
//    @Bean
//    @Qualifier("musicList")
//    public RaggyMusic raggyMusic() {
//        return new RaggyMusic();
//    }
//
//    @Bean
//    public MusicPlayer musicPlayer(List<Music> musicList) {
//        return new MusicPlayer(musicList);
//    }
//
//    @Bean
//    public Computer computer(MusicPlayer musicPlayer){
//        return new Computer(musicPlayer);
//    }

}
