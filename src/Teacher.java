public class Teacher extends Person{

    double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address, long phone, double salary) {
        super(id, name, age, address, phone);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
