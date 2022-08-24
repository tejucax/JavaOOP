package Model;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kara Mia");
        System.out.println(student.getName());
        student.setAge(19);
        System.out.println(student.getAge());
        student.setGender("Female");
        System.out.println(student.getGender());
        student.setStudentNumber(22001);
        System.out.println(student.getStudentNumber());
    }
}