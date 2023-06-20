package project1;
import java.util.*;
public class Email {
    public static boolean searchEmail(List<String> emailId, String searchEmail) {
        for (String email : emailId) {
            if (email.equals(searchEmail)) {
                return true;
            }
        }
        return false;
    }
public static void main(String[] args) {
        ArrayList<String> emailId = new ArrayList<>();
        emailId.add("Obito@email.com");
        emailId.add("Naruto@email.com");
        emailId.add("Kakashi@email.com");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email to search: ");
        String searchEmail = scanner.nextLine();
        boolean found=searchEmail(emailId, searchEmail);
        if (found) {
            System.out.println("Email ID found");
        } else {
            System.out.println("Email ID not found");
        }
    }
}