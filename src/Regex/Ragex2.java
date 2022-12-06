package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ragex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH"; //есть строка
//        Pattern pattern1 = Pattern.compile("ABC"); //создаем паттерн, который с помощью compile() будет искать "ABCD"

        String s1 = "ABDOP"; //есть строка
        Pattern pattern1 = Pattern.compile("AB[C-F]OP");

        Matcher matcher = pattern1.matcher(s1); // сравниваем паттерн1 и s1 на соответсвие с помощью объекта matcher

        while (matcher.find()) { //через цикл с помощью find() ищем есть ли совпадения
            System.out.println("Position: " + matcher.start() + " " + matcher.group()); // и если есть - выводим их с помощью group()
        }
    }
}
