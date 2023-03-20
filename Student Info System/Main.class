
public class Main{
    public static void main(String[] args) {
        
        Course math = new Course("maths", "MATH101", "MATH");
        Course physics = new Course("physics", "PHYS101", "PHYS");
        Course chemical = new Course("chemicals", "CHEM101", "CHEM");

        Teacher teacher1 = new Teacher("Seyma Ekici", "2023022001", "MATH");
        math.addTeacher(teacher1);

        Teacher teacher2 = new Teacher("Al-Haitam", "2023022002", "PHYS");
        physics.addTeacher(teacher2);

        Teacher teacher3 = new Teacher("Lisa Mommy", "2023022003", "CHEM");
        chemical.addTeacher(teacher3);

        Student student1 = new Student("Kaeya Alberich", 4, "202302004", math, physics, chemical);
        student1.addBulkExamNote(100, 20, 60);
        student1.isPass();

        Student student2 = new Student("Kaveh the Architect", 4 , "202302005", math, physics, chemical);
        student2.addBulkExamNote(80, 100, 10);
        student2.isPass();

        Student student3 = new Student("Granddady Zhongli ", 4, "202302004", math, physics, chemical);
        student3.addBulkExamNote(70, 20, 40);
        student3.isPass();
    }
}