import java.util.Scanner;

public class student {
    Scanner firstname1 = new Scanner(System.in);
    Scanner lastname1 = new Scanner(System.in);
    public String toString() {
        String firstname = firstname1.nextLine();
        String lastname = lastname1.nextLine();
        return "My firstname " + firstname + " last name " + lastname;
    }

    public static void main(String[] args) {
        System.out.print("Input you firstname and lastname : ");
        student p = new student();
        System.out.println(p.toString());
    }

}
