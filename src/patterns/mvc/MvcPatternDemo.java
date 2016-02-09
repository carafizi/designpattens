package patterns.mvc;

public class MvcPatternDemo {

    public static void main(String[] args) {

        //fetch student record based on his ID no from the database
        Student model  = retriveStudentFromDatabase("12");

        //Create a view : to write student details on console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retriveStudentFromDatabase(String id){
        Student student = new Student();
        student.setName("Robert");
        student.setId(id);
        return student;
    }
}
