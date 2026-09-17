# Digital Detective

## Crime Investigation System

Digital Detective is a Java-based command-line application designed to
simulate a basic crime investigation process.

The system helps a detective create a case, add suspects, record
evidence and clues, conduct interviews, analyze suspicion scores and
generate a final investigation report.

---

## Student Details

**Name:** Nimish Yadav  
**Registration Number:** 25BAI11011  
**GitHub:**https://github.com/nimish25bai11011-sudo

---

## Objectives

- To apply Java Object-Oriented Programming concepts.
- To organize crime investigation information using different classes.
- To manage suspects, evidence, clues and interviews.
- To perform basic investigation analysis.
- To generate a simple final case report.

---

## Features

- Create a new crime case
- Add suspects
- Record evidence
- Add investigation clues
- Conduct suspect interviews
- Detect possible contradictions in statements
- Calculate suspicion scores
- Analyze suspects
- Generate a final investigation report
- Simple command-line menu

---

## Technologies Used

- Java
- Object-Oriented Programming
- ArrayList
- Scanner
- Command-Line Interface
- Git and GitHub

---

## Project Structure

```text
DIGITAL-DETECTIVE/
│
├── src/
│   ├── Main.java
│   ├── DetectiveSystem.java
│   ├── CaseFile.java
│   ├── Suspect.java
│   ├── Evidence.java
│   ├── Clue.java
│   └── Interview.java
│
├── README.md
├── statement.md
└── .gitignore
```

---

## Main Modules

### 1. Case Management

Creates and stores basic case information such as:

- Case ID
- Crime
- Location

### 2. Suspect Management

Allows the user to add suspects and store:

- Name
- Age
- Occupation
- Motive
- Suspicion score

### 3. Evidence and Clue Management

The system records evidence and clues related to suspects.

Investigation information can increase the suspicion score.

### 4. Interview Management

The user can record questions and answers during suspect interviews.

The system can identify possible contradictions between repeated
statements.

### 5. Suspect Analysis

The system displays suspicion scores for all suspects and identifies
the suspect requiring further investigation based on the highest score.

### 6. Final Report

Generates a summary containing:

- Case information
- Number of suspects
- Evidence collected
- Clues collected
- Interviews conducted
- Suspicion information
- Current case status

---

## Requirements

- Java JDK 17 or newer
- Command Prompt, PowerShell or Terminal
- Git (for GitHub submission)

---

## How to Run

### Step 1: Clone the Repository

```bash
git clone https://github.com/nimish25bai11011-sudo/DIGITAL-DETECTIVE.git
```

### Step 2: Open the Project Folder

```bash
cd DIGITAL-DETECTIVE
```

### Step 3: Go to the Source Folder

```bash
cd src
```

### Step 4: Compile the Program

```bash
javac *.java
```

### Step 5: Run the Program

```bash
java Main
```

---

## Example

After starting the program, enter the case information:

```text
=================================
         DIGITAL DETECTIVE
      Crime Investigation System
=================================

Enter Case ID: CASE001
Enter crime: Theft
Enter location: College Library
Case created successfully!
```

### Example Suspect

```text
Name: Rahul
Age: 21
Occupation: Student
Motive: Financial problem
Initial suspicion points: 5
```

The system calculates the suspicion score based on the investigation
information entered by the user.

---

## Testing

The project was tested by:

1. Compiling all Java source files using `javac`.
2. Running the application using `java Main`.
3. Creating a sample crime case.
4. Adding suspects.
5. Adding evidence.
6. Adding investigation clues.
7. Recording suspect interviews.
8. Checking suspicion score calculations.
9. Generating the final investigation report.

---

## Non-Functional Requirements

### Usability

The application should have a simple menu so that users can easily
perform investigation operations.

### Performance

The system should process normal user inputs quickly.

### Reliability

The program should provide appropriate messages for invalid menu
choices and missing suspects.

### Maintainability

The application is divided into separate Java classes so that the
code can be easier to understand and modify.

### Portability

The application can run on systems that have a compatible Java JDK.

---

## Limitations

- Data is stored only while the program is running.
- The application currently uses a command-line interface.
- It does not use a database.
- Suspicion scoring is based on simple predefined rules.
- The project is an educational simulation and is not intended for
  real criminal investigations.

---

## Future Enhancements

- Add database or file storage.
- Add investigator login.
- Add case history.
- Add search and filtering.
- Improve contradiction detection.
- Add a graphical user interface.
- Add relationship analysis between suspects and evidence.

---

## Learning Outcomes

Through this project, the following Java concepts are demonstrated:

- Classes and Objects
- Constructors
- Methods
- Encapsulation
- ArrayList
- Loops
- Conditional Statements
- Switch Statements
- User Input using Scanner
- Basic Object-Oriented Programming
- Modular program design

---

## Author

**Nimish Yadav**

Digital Detective - Crime Investigation System
