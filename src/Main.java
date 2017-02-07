import java.util.Scanner;

public class Main {

    public static String getUserInput(){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Welcome to the Pig Latin translator!");
        System.out.println("Enter a line to be translated:");
        String userInput = scan1.nextLine();
        userInput = userInput.toLowerCase();
        return userInput;

    }

    public static void pigLatinTranslator(String userInput) {

        String[] parts = userInput.split(" ");

        int i = parts.length;

        for (int j = 0; j < i; j++) {

            if (parts[j].charAt(0) == 'a' || parts[j].charAt(0) == 'e' || parts[j].charAt(0) == 'i' ||
                    parts[j].charAt(0) == 'o' || parts[j].charAt(0) == 'u') {
                parts[j] = parts[j].concat("way");
            } else {
                int k = parts[j].length();
                for (int m = 0; m < k; m++) {
                    if (parts[j].charAt(m) == 'a' || parts[j].charAt(m) == 'e' || parts[j].charAt(m) == 'i' ||
                            parts[j].charAt(m) == 'o' || parts[j].charAt(m) == 'u') {
                        String tempStr = "";
                        tempStr = parts[j].substring(m, k);
                        parts[j] = parts[j].substring(0, m);
                        parts[j] = parts[j].concat("ay");
                        parts[j] = tempStr + parts[j];
                        break;

                    }
                }
            }

            System.out.print(parts[j] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        String userinput2 = "yes";
        do {

            String userInput = getUserInput();
            pigLatinTranslator(userInput);
            System.out.println();


            System.out.println("Translate another line? (yes/no)");
            userinput2 = scan1.nextLine();
        }
        while (userinput2.equalsIgnoreCase("yes"));

    }
}
