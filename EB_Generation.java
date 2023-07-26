import java.util.Scanner;

public class EB_Generation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the customer's mobile number: ");
        String mno = scanner.nextLine();
        System.out.println("Enter the customer's house number: ");
        int hno = scanner.nextInt();
        
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the customer's area: ");
        String area = a.nextLine();
     
        System.out.println("Enter the customer's bill number: ");
        int billno = scanner.nextInt();
        System.out.println("Enter the current units consumed: ");
        int currentUnits = scanner.nextInt();
        System.out.println("Enter the previous units consumed: ");
        int previousUnits = scanner.nextInt();
          System.out.println("Enter Date: ");

       int unit = previousUnits + currentUnits;
       int  EB_Generation = unit-100;
       if(unit<=100){
        System.out.println("Your Bill is RS.0/-");
       }
       else if (unit<=200)
       {
        System.out.println("Your Bill is Rs. " + (EB_Generation)*4);
       }
       else if (unit <=500){
        EB_Generation = ((EB_Generation-100)*8) + 400;
       }
        System.out.println("Customer name: " + name);
        System.out.println("Customer mobile number: " + mno);
        System.out.println("Customer house number: " + hno);
        System.out.println("Customer area: " + area);
        System.out.println("Customer bill number: " + billno);
        System.out.println("Current units consumed: " + currentUnits);
        System.out.println("Previous units consumed: " + previousUnits);
        System.out.println("Electricity bill amount: " + EB_Generation);
        
    }
}