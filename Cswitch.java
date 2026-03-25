import java.util.Scanner;
public class Cswitch {
    public static void main(String[] args) {
        System.out.println("enter your age ");
      /*   Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
         if(age >= 18){
            System.out.println("you are a boy ");
        }   
        else if (age > 22){
            System.out.println("you are now adult");

        }else{
             System.out.println("you  are now getting old");
        }*/

        // switch*
        System.out.println("enter you num (1-7)");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt(); 
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY"); 
                break; 
            case 4:
                System.out.println("THURSDAY"); 
                break; 
            case 5:
                System.out.println("FRIDAY"); 
                break;
            case 6:
                System.out.println("SATURDAY"); 
                break;
            case 7:
                System.out.println("SUNDAY"); 
                break; 

            default:
                break;
        }     
        System.out.println("you are enter the wrong num ");





    }
    
}
