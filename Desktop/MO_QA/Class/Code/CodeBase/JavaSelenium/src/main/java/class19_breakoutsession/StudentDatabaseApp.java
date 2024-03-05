package class19_breakoutsession;

import java.util.Scanner;

public class StudentDatabaseApp 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        
        int numStudents = scanner.nextInt();
        
        scanner.nextLine(); 

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) 
        {
            System.out.println("Enter student information for Student #" + (i + 1));
            
            System.out.print("First Name: ");
            
            String firstName = scanner.nextLine();
            
            System.out.print("Last Name: ");
            
            String lastName = scanner.nextLine();
            
            System.out.print("Student ID: ");
            
            int studentID = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Number of Courses: ");
            int numCourses = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String[] courses = new String[numCourses];
            for (int j = 0; j < numCourses; j++) 
            {
                System.out.print("Course " + (j + 1) + ": ");
                courses[j] = scanner.nextLine();
            }

            students[i] = new Student(firstName, lastName, studentID, email, courses);
        }

        System.out.print("Enter the student ID to search: ");
        int searchID = scanner.nextInt();
        
        Student.searchStudentByID(students, searchID);

        scanner.close();
    }
}

