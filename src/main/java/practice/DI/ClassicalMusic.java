package practice.DI;

import practice.IoC.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical music song";
    }
}
