package practice.HW1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusic")
public class RockMusic implements Music {

    private List<String> list = new ArrayList<>();

    {
        list.add("ARRR");
        list.add("ORRR");
        list.add("URRR");
    }

    @Override
    public List<String> getSongs() {
        return list;
    }
}
