package practice.scope;

import practice.scope.Music;

public class ClassicalMusic implements Music {
    private ClassicalMusic(){
    }
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit(){
        System.out.println("Doing my initialization process");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroing process");
    }

    @Override
    public String getSong() {
        return "Classical music song";
    }



}
