package StreamTraining;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список строк. Вам нужно к каждой строке прибавить ".java"
 *
 * Например:
 * Из {"One"} нужно получить {"One.java"}
 */

public class StringMap {
    public static List<String> map(List<String> names) {
        return names.stream()
                .map(e -> e.concat(".java"))
                .collect(Collectors.toList());
    }
}