package basics;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // طلب إدخال الاسم
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // طلب إدخال العمر
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // طلب إدخال رقم عشري
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();

        // إظهار النتائج
        System.out.println("\n--- User Info ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
}
