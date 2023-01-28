package codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class One {
    public int sum(List<?> mixed) {
        int x = 0;

        for (Object s : mixed) {
            x += Integer.parseInt(s.toString());
        }
        return x;
    }
}

