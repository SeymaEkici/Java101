
class Student{

    String name;
    String studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemical;
    double avarage;
    boolean isPass;

    public Student (String name, int classes, String studentNo, Course math, Course physics, Course chemical){

        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemical = chemical;
        calculateAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote (int math, int physics, int chemical){

        if(math >= 0 && math <= 100){
            this.math.note = math;
        }

        if(physics >= 0 && physics <= 100){
            this.physics.note = physics;
        }

        if(chemical >= 0 && chemical <= 100){
            this.chemical.note = chemical;
        }
    }

    public void isPass() {

        if(this.math.note == 0 || this.physics.note == 0 || this.chemical.note == 0){
            
            System.out.println("Notes have not been entered completly");
        }else {
            
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Avarage is: " + this.avarage);

            if(this.isPass){
                System.out.println("Passed the class.");
            }else {
                System.out.println("Couldn't pass the class.");
            }
        }
    }

    public void calculateAvarage() {
        this.avarage = (this.math.note + this.physics.note + this.chemical.note) / 3;
    }

    public boolean isCheckPass() {
        calculateAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student \t:" + this.name);
        System.out.println("Math note \t:" + this.math.note);
        System.out.println("Physics note \t:" + this.physics.note);
        System.out.println("Chemical note \t:" + this.chemical.note);
    }
}