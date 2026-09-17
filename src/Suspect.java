public class Suspect {

    String name;
    int age;
    String occupation;
    String motive;
    int suspicion;

    public Suspect(String name, int age, String occupation, String motive) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.motive = motive;
        this.suspicion = 0;
    }

    public void addSuspicion(int points) {
        suspicion += points;
    }

    public void showSuspect() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + occupation);
        System.out.println("Motive: " + motive);
        System.out.println("Suspicion Score: " + suspicion);
        System.out.println("----------------------------");
    }
}