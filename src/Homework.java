class Homework {
    private String question;
    private String correctAnswer;
    private int grade;

    public Homework(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer.toLowerCase();
        this.grade = 0;
    }

    public String getQuestion() {
        return question;
    }

    public void submitAnswer(String answer) {
        if (answer.toLowerCase().equals(correctAnswer)) {
            grade = 5;
            System.out.println("Correct! You got 5/5");
        } else {
            grade = 0;
            System.out.println("Wrong! You got 0/5");
        }
    }

    public int getGrade() {
        return grade;
    }
}