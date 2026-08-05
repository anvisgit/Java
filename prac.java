import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter Student's Name:");
            String name = sc.next();

            System.out.println("Enter Roll Number:");
            int rno = sc.nextInt();

            int[] marks = new int[5];
            int total = 0;
            int highest, lowest, failed = 0;
            double avg;
            char grade;
            boolean pass;

            System.out.println("Enter the marks for 5 subjects:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
                total += marks[i];
            }

            highest = marks[0];
            lowest = marks[0];

            for (int i = 0; i < 5; i++) {

                if (marks[i] > highest) {
                    highest = marks[i];
                }

                if (marks[i] < lowest) {
                    lowest = marks[i];
                }

                if (marks[i] < 40) {
                    failed++;
                }
            }

            avg = total / 5.0;

            if (failed == 0) {
                pass = true;
            } else {
                pass = false;
            }

            if (avg >= 90) {
                grade = 'A';
            } else if (avg >= 80) {
                grade = 'B';
            } else if (avg >= 70) {
                grade = 'C';
            } else if (avg >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("\n========== STUDENT REPORT ==========");
            System.out.println("Name             : " + name);
            System.out.println("Roll Number      : " + rno);
            System.out.println("Total Marks      : " + total);
            System.out.printf("Average Marks    : %.2f\n", avg);
            System.out.println("Highest Marks    : " + highest);
            System.out.println("Lowest Marks     : " + lowest);
            System.out.println("Failed Subjects  : " + failed);
            System.out.println("Result           : " + (pass ? "PASS" : "FAIL"));
            System.out.println("Grade            : " + grade);

        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }
}
