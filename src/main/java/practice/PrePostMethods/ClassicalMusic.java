package practice.PrePostMethods;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
    private ClassicalMusic(){
    }
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
