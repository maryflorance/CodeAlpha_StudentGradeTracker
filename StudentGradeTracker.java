import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter grades for students (enter -1 to finish):");

        while (true) {
            int grade = scanner.nextInt();
            if (grade == -1) break;
            if (grade >= 0 && grade <= 100) {
                grades.add(grade);
            } else {
                System.out.println("Please enter a valid grade (0-100) or -1 to finish.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            System.out.println("Average Grade: " + calculateAverage(grades));
            System.out.println("Highest Grade: " + findHighest(grades));
            System.out.println("Lowest Grade: " + findLowest(grades));
        }

        scanner.close();
    }

    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    private static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}