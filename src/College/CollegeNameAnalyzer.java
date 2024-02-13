package College;

public class CollegeNameAnalyzer {
    public static void main(String[] args) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (String name : args) {
            if (Character.isDigit(name.charAt(0))) {
                System.out.println("Numbers are not allowed as names: " + name);
                continue;
            }

            char firstChar = Character.toLowerCase(name.charAt(0));
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Number of names starting with a vowel: " + vowelCount);
        System.out.println("Number of names starting with a consonant: " + consonantCount);
    }
}
