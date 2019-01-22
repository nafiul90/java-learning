public class Student extends Person{

    double CGPA;
//    public Student() {
//
//    }

    public Student(int id, String name, int age, String address, long phone, double CGPA) {
        super(id,name,age,address,phone);
        this.CGPA = CGPA;
    }
}
