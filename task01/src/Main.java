package sg.edu.nus.iss;

//import java.io.Console;
import java.util.Scanner;

//import javax.print.attribute.HashAttributeSet;

/**
 * Task 01 calculator
 *
 */
public class Main
{


    public static void main( String[] args )
    {

        int last = 0;
        boolean keeprunning = true;

        //Console con = System.console();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome.");

        //while (!scan.equals("exit"))

        while (keeprunning) {

            String calc = scan.nextLine();

            if (calc.equals("exit")){
                System.out.println("Bye bye");
                scan.close();
                System.exit(0);
            }

            else {

            String [] lr = calc.split(" ");
            int a;
            int b;

            if (lr[0].equals("$last")){
                a = last;
            } else {
                a = Integer.parseInt(lr[0]);
            }

            if (lr[2].equals("$last")){
                b = last;
            } else {
                b = Integer.parseInt(lr[2]);
            }


            
            String doMath = lr[1];

        switch (doMath) {
            case "+":
            last = a + b;
            
            break;

            case "-":
            last = a-b;
            
            break;

            case "*":
            last = a*b;
            
            break;

            case "/":
            last = a/b;
            
            break;

            default:
            System.err.println("invalid operator");
            
            continue;

        }

        System.out.println(last);

        }
    }
        //System.out.println("Bye bye");
        //scan.close();
        //System.exit(0);

        
        
        
                 


            



        


        

        

        

    }
}
