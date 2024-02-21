import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner class has been defineted.
        Scanner index= new Scanner(System.in);

        //The variable data types have been defined.
        double meter, kilograms,result;

        //Get values from the user.
        System.out.print ("Please enter your height(m) = " );
        meter=index.nextDouble();

        System.out.print("Please enter your weight(kg) = ");
        kilograms= index.nextDouble();

        //The body mass index has been calculated.
        result= kilograms/(meter*meter);
        System.out.print("Your Body Mass Index = "+result);
    }
}