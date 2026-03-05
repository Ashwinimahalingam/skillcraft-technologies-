import java.util.Scanner;

public class task1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("temp converter");
        System.out.println("1.celsius to fahrenheit and kelvin");
        System.out.println("2.fahrenheit to celsius and kelvin");
        System.out.println("3.kelvin to celsius and fahrenheit");
        System.out.println("enter your choice(1-3):");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("enter temp in celsius:");
                double celsius=sc.nextDouble();
                double fahrenheit=(celsius*9/5)+32;
                double kelvin=celsius+273.15;
                System.out.println("temp in fahrenheit:"+fahrenheit);
                System.out.println("temp in kelvin:"+kelvin);
                break;
            case 2:
                System.out.println("enter temp in fahrenheit:");
                double fahrenheit1=sc.nextDouble();
                double celsius1=(fahrenheit1-32)*5/9;
                double kelvin1=celsius1+273.15;
                System.out.println("temp in celsius:"+celsius1);
                System.out.println("temp in kelvin:"+kelvin1);
                break;
            case 3:
                System.out.println("enter temp in kelvin:");
                double kelvin2=sc.nextDouble();
                double celsius2=kelvin2-273.15;
                double fahrenheit2=(celsius2*9/5)+32;
                System.out.println("temp in celsius:"+celsius2);
                System.out.println("temp in fahrenheit:"+fahrenheit2);
                break;
            default:
                System.out.println("invalid choice");
        }
    }
    
}
