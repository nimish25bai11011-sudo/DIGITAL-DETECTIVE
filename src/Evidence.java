public class Evidence {

    String description;
    String location;
    String relatedSuspect;

    public Evidence(String description, String location, String relatedSuspect) {
        this.description = description;
        this.location = location;
        this.relatedSuspect = relatedSuspect;
    }

    public void showEvidence() {
        System.out.println("Evidence: " + description);
        System.out.println("Found at: " + location);
        System.out.println("Related suspect: " + relatedSuspect);
        System.out.println("----------------------------");
    }
}
