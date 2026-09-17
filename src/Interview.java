public class Interview {

    String suspectName;
    String question;
    String answer;

    public Interview(String suspectName, String question, String answer) {
        this.suspectName = suspectName;
        this.question = question;
        this.answer = answer;
    }

    public void showInterview() {
        System.out.println("Suspect: " + suspectName);
        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);
        System.out.println("----------------------------");
    }
}
