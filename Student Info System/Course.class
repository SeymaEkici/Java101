
public class Course{

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(String name, String code, String prefix){
        
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher){
        
        if (this.prefix.equals(Teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Transaction successful.");
        } else {
            System.out.println(Teacher.name + " this academic does not lecture.");
        }
    }

    public void printTeacher(){
        
        if(courseTeacher != null){
            System.out.println(this.name + " this academic: " + courseTeacher.name);
        }else {
            System.out.println("No Academician has been assigned to course " + this.name);
        }
    }
    
}