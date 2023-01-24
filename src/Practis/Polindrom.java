package Practis;

public class Polindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrom("ABBA BBBB ABba"));
        System.out.println(isPalindrom("ABBA 2345 AB':ba"));
        System.out.println(isPalindrom("ABcvvbA 2345 ABba"));
        System.out.println(isPalindrom("Madam, I'm Adam"));
    }

    public static boolean isPalindrom(String text) {
        String s1 = text.toUpperCase().replaceAll("[^A-Za-z]","");
        StringBuffer s2 = new StringBuffer(s1).reverse();
        boolean answer = true;

        for (int count = 0; count < s1.length(); count++) {
            if (s1.charAt(count) != s2.charAt(count)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
