package Class017_CollectionFrameworks.List;

public class EXP_107_CLASSstudent {

        static  class Student {
        String name;
        String rollNo;

        Student(String name, String rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo='" + rollNo + '\'' +
                    '}';
        }
    }

        public static void main(String[] args) {
            Student s = new Student("Pramod", "101");
            System.out.println(s);
        }

}
