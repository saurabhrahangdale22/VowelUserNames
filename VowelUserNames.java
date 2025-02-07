import java.util.Scanner;

 class VowelUserNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the number of usernames: ");
        int count = scanner.nextInt();
        scanner.nextLine(); 

        String[] usernames = new String[count];

        
        System.out.println("Enter the usernames:");
        for (int i = 0; i < count; i++) {
            usernames[i] = scanner.nextLine();
        }

        System.out.println("\nUsernames starting with a vowel:");
        for (String username : usernames) {
            char firstChar = Character.toLowerCase(username.charAt(0));
            if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                System.out.println(username);
            }
        }

        scanner.close();
    }
}

