package elseifStatements;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Your grade is A");
        } else if (marks >= 80) {
            System.out.println("Your grade is B");
        } else if (marks >= 70) {
            System.out.println("Your grade is C");
        } else if (marks >= 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }

        scanner.close();
    }
    
}
