public class Student {
        private
        String username;
        String password;
        public Student(String studentUsername, String studentPass){
            username = studentUsername;
            password = studentPass;
        }
        public String getUsername() {
            return username;
        }

     public static boolean isStudentValid(String inputusername, String inputpassword) {
            for (String[] student : DataBase.students) {
                if (student[0].equals(inputusername) && student[1].equals(inputpassword)) {
                    return true;
                }
            }
            return false;
        }

       public static void printSubjects() {
            for (String subject : DataBase.subjects) {
                System.out.println(subject);
            }
        }
    }