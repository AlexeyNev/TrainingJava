package JavaMarathon;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String country = scanner.nextLine();
            if (country.equals("Stop")) {
                break;
            }
            else {
                switch (country) {
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим":
                    case "Милан":
                    case "Турин":
                        System.out.println("Италия");
                        break;
                    case "Ливерпуль":
                    case "Манчестер":
                    case "Лондон":
                        System.out.println("Англия");
                        break;
                    case "Берлин":
                    case "Мюнхен":
                    case "Кёльн":
                        System.out.println("Германия");
                        break;
                    default:
                        System.out.println("Неизвестная страна");
                        break;
                }
            }
        }



    }
}
