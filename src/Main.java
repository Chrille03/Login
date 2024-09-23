import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxForsøg = 3;
        boolean login = false;



        String [] usernames;
        usernames = new String[3];

        usernames[0] = "admin";
        usernames[1] = "user1";
        usernames[2] = "user2";

        String [] passwords;
        passwords = new String[3];

        passwords[0] = "password123";
        passwords[1] = "letmein";
        passwords[2] = "qwerty";
        System.out.println("Brugernavn: ");
        String username = input.next();
        System.out.println("Adgangskode: ");
        String password = input.next();

        for (int i = 0; i < usernames.length; i++) {
            if(username.equalsIgnoreCase(usernames[i]) && password.equalsIgnoreCase(passwords[i])){

            }
       }
    }
}