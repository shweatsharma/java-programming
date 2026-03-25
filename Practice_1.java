import java.util.Scanner;
public class Practice_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you math num ");
        double sub1 =  sc.nextInt();

        System.out.println("enter you science num ");
        double sub2 =  sc.nextInt();

        System.out.println("enter you sst num ");
        double sub3 =  sc.nextInt();

        System.out.println("enter you english num ");
        double sub4 =  sc.nextInt();

        System.out.println("enter you hindi num ");
        double sub5 =  sc.nextInt();

        double sum = (sub1 + sub2 + sub3 + sub4 + sub5 );
        System.out.println("the total percentage is " + sum / 5);

      
      
      
      
    }



    
}
