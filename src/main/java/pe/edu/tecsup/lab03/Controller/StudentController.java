package pe.edu.tecsup.lab03.Controller;

public class StudentController {

    private String schoolName;
    private int totalStudents;

    // Constructor
    public StudentController() {
        this.schoolName = "TECSUP";
        this.totalStudents = 1000;
    }

    public String getStudents() {
        return "Lista de estudiantes de " + schoolName + " con un total de " + totalStudents + " estudiantes.";
    }

    public String getStudentById(int id) {
        return "Información del estudiante con ID: " + id;
    }

    public String updateStudent(int id, String studentInfo) {
        return "Actualizando información del estudiante con ID: " + id + " a: " + studentInfo;
    }

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        System.out.println(controller.getStudents());
        System.out.println(controller.getStudentById(1));
        System.out.println(controller.updateStudent(1, "Nuevo estudiante"));
    }
}
