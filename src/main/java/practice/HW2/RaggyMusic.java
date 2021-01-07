package practice.HW2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RaggyMusic implements Music {
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization process raggy");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroing process raggy");
    }

    @Override
    public String getSong() {
        return "Raggy music song";
    }
}
