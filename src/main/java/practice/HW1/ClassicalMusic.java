package practice.HW1;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
    private List<String> list = new ArrayList<String>();
    {
        list.add("aaaaaaaAA");
        list.add("ooooOOOoooo");
        list.add("uuuuuuUUUUuuu");
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
