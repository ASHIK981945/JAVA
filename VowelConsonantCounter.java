public class VowelConsonantCounter {
    public static void main(String[] args) {
        String A = "nepathya";
        int vowels = 0;
        int consonent = 0;
        for (int i = 0; i < A.length(); i++) {

            char ch = A.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                    || ch == 'O' || ch == 'U') {
                vowels++;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                consonent++;
            }

        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonent: " + consonent);

    }
}
