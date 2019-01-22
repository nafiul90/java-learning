import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args){
        Random random =new Random();
        Scanner sc = new Scanner(System.in);

        int magic_number = random.nextInt(5);
        //System.out.println(magic_number);



        for(int i=0;i<5;i++){
            System.out.println("Guess a number");
            int num = sc.nextInt();
            if(num == magic_number){
                System.out.println("Success");
                break;
            }else if(num < magic_number){
                System.out.println("faield");
                System.out.println("Your number is less then the magic number");
            }else{
                System.out.println("faield");
                System.out.println("Your number is greater then the magic number");
            }
        }



    }

}
