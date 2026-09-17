import java.util.Scanner;

public class DetectiveSystem {

    static Scanner sc = new Scanner(System.in);
    static CaseFile currentCase;

    public static void start() {

        System.out.println("=================================");
        System.out.println("         DIGITAL DETECTIVE");
        System.out.println("      Crime Investigation System");
        System.out.println("=================================");

        createCase();

        int choice;

        do {
            System.out.println("\n========== MAIN MENU ==========");
            System.out.println("1. Add Suspect");
            System.out.println("2. Add Evidence");
            System.out.println("3. View Case");
            System.out.println("4. Add Clue");
            System.out.println("5. Interview Suspect");
            System.out.println("6. Analyze Suspects");
            System.out.println("7. Final Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addSuspect();
                    break;

                case 2:
                    addEvidence();
                    break;

                case 3:
                    currentCase.showCase();
                    break;

                case 4:
                    addClue();
                    break;

                case 5:
                    interviewSuspect();
                    break;

                case 6:
                    analyze();
                    break;

                case 7:
                    finalReport();
                    break;

                case 8:
                    System.out.println("Investigation closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);
    }

    static void createCase() {

        System.out.print("Enter Case ID: ");
        String id = sc.nextLine();

        System.out.print("Enter crime: ");
        String crime = sc.nextLine();

        System.out.print("Enter location: ");
        String location = sc.nextLine();

        currentCase = new CaseFile(id, crime, location);

        System.out.println("Case created successfully!");
    }

    static void addSuspect() {

        System.out.println("\n========== ADD SUSPECT ==========");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Occupation: ");
        String occupation = sc.nextLine();

        System.out.print("Motive: ");
        String motive = sc.nextLine();

        System.out.print("Initial suspicion points: ");
        int points = sc.nextInt();
        sc.nextLine();

        Suspect suspect = new Suspect(
                name, age, occupation, motive
        );

        suspect.addSuspicion(points);
        currentCase.addSuspect(suspect);

        System.out.println("Suspect added successfully!");
    }

    static void addEvidence() {

        System.out.println("\n========== ADD EVIDENCE ==========");

        System.out.print("Evidence description: ");
        String description = sc.nextLine();

        System.out.print("Found at: ");
        String location = sc.nextLine();

        System.out.print("Related suspect: ");
        String suspect = sc.nextLine();

        Evidence evidence = new Evidence(
                description, location, suspect
        );

        currentCase.addEvidence(evidence);

        System.out.println("Evidence added successfully!");

        for (Suspect s : currentCase.suspects) {
            if (s.name.equalsIgnoreCase(suspect)) {
                s.addSuspicion(5);
            }
        }
    }

    static void addClue() {

        System.out.println("\n========== ADD CLUE ==========");

        System.out.print("Clue description: ");
        String description = sc.nextLine();

        System.out.print("Related suspect: ");
        String suspect = sc.nextLine();

        System.out.print("Suspicion points: ");
        int points = sc.nextInt();
        sc.nextLine();

        Clue clue = new Clue(
                description, suspect, points
        );

        currentCase.addClue(clue);

        for (Suspect s : currentCase.suspects) {
            if (s.name.equalsIgnoreCase(suspect)) {
                s.addSuspicion(points);
            }
        }

        System.out.println("Clue added successfully!");
    }

    static void interviewSuspect() {

        System.out.println("\n========== SUSPECT INTERVIEW ==========");

        System.out.print("Suspect name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Suspect s : currentCase.suspects) {

            if (s.name.equalsIgnoreCase(name)) {

                found = true;

                System.out.print("Question: ");
                String question = sc.nextLine();

                System.out.print("Answer: ");
                String answer = sc.nextLine();

                Interview interview =
                        new Interview(name, question, answer);

                currentCase.addInterview(interview);

                System.out.println("Interview recorded.");

                checkContradiction(name, answer);
            }
        }

        if (!found) {
            System.out.println("Suspect not found.");
        }
    }

    static void checkContradiction(String name, String answer) {

        String lowerAnswer = answer.toLowerCase();

        if (lowerAnswer.contains("home")
                || lowerAnswer.contains("library")
                || lowerAnswer.contains("canteen")) {

            System.out.println("Statement recorded for comparison.");
        }

        if (currentCase.interviews.size() >= 2) {

            Interview previous =
                    currentCase.interviews.get(
                            currentCase.interviews.size() - 2
                    );

            if (previous.suspectName.equalsIgnoreCase(name)
                    && !previous.answer.equalsIgnoreCase(answer)) {

                System.out.println("Possible contradiction detected!");
                
                for (Suspect s : currentCase.suspects) {
                    if (s.name.equalsIgnoreCase(name)) {
                        s.addSuspicion(5);
                    }
                }
            }
        }
    }

    static void analyze() {

        System.out.println("\n========== CASE ANALYSIS ==========");

        if (currentCase.suspects.isEmpty()) {
            System.out.println("No suspects available.");
            return;
        }

        for (Suspect s : currentCase.suspects) {

            System.out.println(
                    s.name + " -> Suspicion Score: "
                    + s.suspicion
            );
        }

        System.out.println("\nAnalysis completed.");
    }

    static void finalReport() {

        System.out.println("\n=================================");
        System.out.println("       FINAL INVESTIGATION REPORT");
        System.out.println("=================================");

        System.out.println("Case ID: " + currentCase.caseId);
        System.out.println("Crime: " + currentCase.crime);
        System.out.println("Location: " + currentCase.location);

        System.out.println("\nTotal suspects: "
                + currentCase.suspects.size());

        System.out.println("Evidence collected: "
                + currentCase.evidenceList.size());

        System.out.println("Clues collected: "
                + currentCase.clues.size());

        System.out.println("Interviews conducted: "
                + currentCase.interviews.size());

        if (!currentCase.suspects.isEmpty()) {

            Suspect highest = currentCase.suspects.get(0);

            for (Suspect s : currentCase.suspects) {
                if (s.suspicion > highest.suspicion) {
                    highest = s;
                }
            }

            System.out.println("\nHighest suspicion score: "
                    + highest.suspicion);

            System.out.println("Suspect requiring further investigation: "
                    + highest.name);
        }

        System.out.println("\nCase Status: Under Investigation");
        System.out.println("=================================");
    }
}