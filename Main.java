
public class Main {
	public static void main(String[] args) {
        Student student1 =new Student(1, "Ali", "Atak");
        Student student2 =new Student(2, "Ay�e", "Kahraman");
        Student student3 =new Student(3, "Veli", "G�ndo�du");
        
        Student[] students = {student1, student2, student3};
        
        Course course1 = new Course();
        course1.id = 1;
        course1.courseName = "Java Kamp�";
        course1.teacher = "Engin Demiro�";
        
        Course course2 = new Course();
        course2.id = 2;
        course2.courseName = "C# Kamp�";
        course2.teacher = "Engin Demiro�";
        
        StudentManager studentManager = new StudentManager();
        studentManager.addToStudentList(student1);
        studentManager.addToStudentList(student2);
        studentManager.addToStudentList(student3);
        
        
    }
}
