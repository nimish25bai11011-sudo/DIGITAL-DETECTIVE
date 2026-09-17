public class Clue {

    String description;
    String relatedSuspect;
    int points;

    public Clue(String description, String relatedSuspect, int points) {
        this.description = description;
        this.relatedSuspect = relatedSuspect;
        this.points = points;
    }

    public void showClue() {
        System.out.println("Clue: " + description);
        System.out.println("Related suspect: " + relatedSuspect);
        System.out.println("Suspicion points: " + points);
        System.out.println("----------------------------");
    }
}