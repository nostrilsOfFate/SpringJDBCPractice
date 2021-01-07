package practice.scope;

import practice.scope.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music song";
    }
}
