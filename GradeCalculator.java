import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // collecting marks in all subject
        System.out.println("Enter the number of subjects:");
        int numSubjects = scanner.nextInt();
        int[] subjectMarks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextInt();
        }

        //  Total Marks is calculated 
        int totalMarks = 0;
        for (int marks : subjectMarks) {
            totalMarks += marks;
        }

        // Now  Average Percentage is calculated 
        double averagePercentage = (double) totalMarks / numSubjects;

        // Decision for grade 
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        //  Results checking 
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
