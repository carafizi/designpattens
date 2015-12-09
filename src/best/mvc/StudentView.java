package best.mvc;

public class StudentView {

    public void printStudentDetails(Student student){
        System.out.println("Student: ");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
    }
}
