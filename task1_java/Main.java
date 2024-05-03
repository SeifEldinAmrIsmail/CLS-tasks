import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
       if(Instructor.isInstructorValid(username, password))
       {
        System.out.println("Welcome, " + username + " Here are list of the students:");
        Instructor.printStudents();
       }

       else if (Student.isStudentValid(username, password)) {
        System.out.println("Welcome, " + username + "! Here are the subjects:");
        Student.printSubjects();
    } 
    else {
        System.out.println("Invalid username or password.");
    }
    }
}