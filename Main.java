
public class Main {
	public static void main(String[] args) {
        Student student1 =new Student(1, "Ali", "Atak");
        Student student2 =new Student(2, "Ayşe", "Kahraman");
        Student student3 =new Student(3, "Veli", "Gündoğdu");
        
        Student[] students = {student1, student2, student3};
        
        Course course1 = new Course();
        course1.id = 1;
        course1.courseName = "Java Kampı";
        course1.teacher = "Engin Demiroğ";
        
        Course course2 = new Course();
        course2.id = 2;
        course2.courseName = "C# Kampı";
        course2.teacher = "Engin Demiroğ";
        
        StudentManager studentManager = new StudentManager();
        studentManager.addToStudentList(student1);
        studentManager.addToStudentList(student2);
        studentManager.addToStudentList(student3);
        
        
    }
}
