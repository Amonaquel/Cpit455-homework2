import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int sid;
    private List<Homework> homeworks;

    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
        this.homeworks = new ArrayList<>();
    }

    public void addHomework(Homework hw) {
        homeworks.add(hw);
    }

    public void showHomeworks() {
        System.out.println("\n Your Homeworks:");
        int i = 1;
        for (Homework hw : homeworks) {
            System.out.println(i + ". " + hw.getQuestion());
            i++;
        }
    }

    public void submitAnswers(Scanner sc) {
        for (Homework hw : homeworks) {
            System.out.print("\nAnswer for: " + hw.getQuestion() + " → ");
            String answer = sc.nextLine();
            hw.submitAnswer(answer);
        }
    }

    public void showGrades() {
        System.out.println("\nYour Grades:");
        int total = 0;
        for (int i = 0; i < homeworks.size(); i++) {
            Homework hw = homeworks.get(i);
            System.out.println((i + 1) + ". " + hw.getGrade() + "/5");
            total += hw.getGrade();
        }
        System.out.println("Total: " + total + "/" + (homeworks.size() * 5));
    }
}

