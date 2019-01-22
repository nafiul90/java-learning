public class Method {

    Method(){
        double s=sum(10,5.5);
//        System.out.println(s);

        //sayHello("Nafiul");
        System.out.println(hello("Nafiul"));

    }

    public static void main(String[] args){

        new Method();

    }


    double  sum(int a, double b){
        double s = a+b;
        return s;
    }

    void sayHello(String name){
        System.out.println("hello "+name);
    }

    String hello(String name){
        return "hello "+name;
    }
}
