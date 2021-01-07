package practice.DI;

import practice.IoC.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music song";
    }
}
