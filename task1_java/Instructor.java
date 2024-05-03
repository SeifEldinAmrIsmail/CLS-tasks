public class Instructor {
   private String username;
   private String password;

    public Instructor(String instructorUsername, String instructorPassword) {
        username = instructorUsername;
        password = instructorPassword;
    }
    public String getUsername() {
        return username;
    }
  
   public static boolean isInstructorValid(String inputusername, String inputpassword) {
        for (String[] instructor : DataBase.instructors) {
            if (instructor[0].equals(inputusername) && instructor[1].equals(inputpassword)) {
                return true;
            }
        }
        return false;
    }
    public static void printStudents() {
        for (String[] student : DataBase.students) {
            System.out.println(student[0]);
        }
    }
}