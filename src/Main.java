import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sidInput = 0;
        String passInput = "";
        boolean loggedIn = false;


        while (!loggedIn) {
            try {
                System.out.print("Enter SID: ");
                sidInput = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Password: ");
                passInput = sc.nextLine();

                if (sidInput == 2236248 && passInput.equals("1234")) {
                    System.out.println("Login successful!\n");
                    loggedIn = true;
                } else {
                    System.out.println("Login failed! Invalid SID or password. Try again.\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid SID format! Must be a number.\n");
                sc.nextLine();
            }
        }


        Student me = new Student("Abdulrhaman", 2236248);


        me.addHomework(new Homework("What is Java?", "A programming language"));
        me.addHomework(new Homework("What does JVM stand for?", "Java Virtual Machine"));
        me.addHomework(new Homework("True or False: 2 + 2 = 5?", "False"));


        me.showHomeworks();


        me.submitAnswers(sc);


        me.showGrades();

        sc.close();
    }
}
