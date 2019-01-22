
public class OOP {

    OOP(){


//        Guitar guiter = new Guitar("Tronand",18);
//        guiter.setName("Tronand");
//
//        guiter.setColor("Blue");
//
//
//        System.out.println(guiter);

//        Person person = new Person(1,"Jon Dao",30,"USA",Long.parseLong("01934567"));
//        System.out.println(person);

        Student student = new Student(1,"Jon Dao",30,"USA",Long.parseLong("01934567"),4.00);
        //Student student1 = new Student();

        //        System.out.println(student);

        Operations operations = new Operations();
        System.out.println( operations.sum(10,5.5) );
        System.out.println(operations.sum(10,15,20));

    }

    public static void main(String[] args){

        new OOP();

    }


}
