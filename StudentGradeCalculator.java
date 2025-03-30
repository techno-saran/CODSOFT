import java.util.Scanner;
public class StudentGradeCalculator {
    public static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'o';
        } else if (percentage >= 80) {
            return 'A';
        } else if (percentage >= 70) {
            return 'B';
        } else if (percentage >= 60) {
            return 'C';
        } else if (percentage >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        double[] marks = new double[numSubjects];
        double totalMarks = 0;
        
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextDouble();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input. Marks should be between 0 and 100.");
                System.out.print("Enter marks obtained in subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextDouble();
            }
            totalMarks += marks[i];
        }
       double averagePercentage = totalMarks / numSubjects;
        char grade = calculateGrade(averagePercentage);
        
        System.out.println("\n--- Student Grade Report ---");
        System.out.println("Total Marks: " + totalMarks + "/" + (numSubjects * 100));
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
