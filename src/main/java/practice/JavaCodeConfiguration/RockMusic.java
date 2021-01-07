package practice.JavaCodeConfiguration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier(value="rockMusic")
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music song";
    }
}
