import java.util.ArrayList;

public class CaseFile {

    String caseId;
    String crime;
    String location;

    ArrayList<Suspect> suspects = new ArrayList<>();
    ArrayList<Evidence> evidenceList = new ArrayList<>();
    ArrayList<Clue> clues = new ArrayList<>();
    ArrayList<Interview> interviews = new ArrayList<>();

    public CaseFile(String caseId, String crime, String location) {
        this.caseId = caseId;
        this.crime = crime;
        this.location = location;
    }

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    public void addEvidence(Evidence evidence) {
        evidenceList.add(evidence);
    }

    public void addClue(Clue clue) {
        clues.add(clue);
    }

    public void addInterview(Interview interview) {
        interviews.add(interview);
    }

    public void showCase() {

        System.out.println("\n========== CASE DETAILS ==========");
        System.out.println("Case ID: " + caseId);
        System.out.println("Crime: " + crime);
        System.out.println("Location: " + location);

        System.out.println("\n---------- SUSPECTS ----------");

        if (suspects.isEmpty()) {
            System.out.println("No suspects added.");
        } else {
            for (Suspect s : suspects) {
                s.showSuspect();
            }
        }

        System.out.println("\n---------- EVIDENCE ----------");

        if (evidenceList.isEmpty()) {
            System.out.println("No evidence added.");
        } else {
            for (Evidence e : evidenceList) {
                e.showEvidence();
            }
        }

        System.out.println("\n---------- CLUES ----------");

        if (clues.isEmpty()) {
            System.out.println("No clues added.");
        } else {
            for (Clue c : clues) {
                c.showClue();
            }
        }

        System.out.println("\n---------- INTERVIEWS ----------");

        if (interviews.isEmpty()) {
            System.out.println("No interviews recorded.");
        } else {
            for (Interview i : interviews) {
                i.showInterview();
            }
        }
    }
}