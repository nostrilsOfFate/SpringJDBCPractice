package practice.HW2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Doing my initialization process");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroing process");
    }

    @Override
    public String getSong() {
        return "Classical music song";
    }

}
