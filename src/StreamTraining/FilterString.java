package StreamTraining;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Если условие громоздкое, то можно расположить несколько вызовов filter подряд.
 * Ваша задача отфильтровать список строк по следующему признаку.
 * Строка должна начинаться на "A" и заканчиваться на ".java"
 * startsWith начало строки
 * endsWith конец строки
 */

public class FilterString {
    public static List<String> filter(List<String> data) {
        return data.stream()
                .filter(e -> e.startsWith("A"))
                .filter(e -> e.endsWith(".java"))
                .collect(Collectors.toList());
    }
}