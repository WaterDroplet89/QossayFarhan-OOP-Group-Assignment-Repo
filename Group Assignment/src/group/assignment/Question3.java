/*
 * Question 3 (Integer Inputs)
 * 
 * This program will acquire integer inputs and display the largest 
 * and smallest numbers and the number and summation of prime numbers.
 * Type 0 to finish.
 * @ Qossay Abuamriya B02210014
 * version 1.2 
 */
package group.assignment;
    
    //Using Util.Scanner library to allow user to key in values from terminal   
    import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        
        // Declare all the needed variables for this program 
        int Number;
        int Sentinel = 0; 
        int count = 0;
        int max = -2147483648 , min = 2147483647 ; // using the max and min int values as defaults 
        int primeCount = 0 , primeTotal = 0 ; 

        // Start an infinte loop to input the integers
        while ( true ) { 
            System.out.print("? ");
            // Create an input object to allow user to key in values 
            Scanner input = new Scanner(System.in);
            Number = input.nextInt();
            
            //Check if the number equals the sentinel value if yes will break out of loop
            if (Number == Sentinel){
                break;
            }
            
            // counter to count the the number of entered integers  
            count += 1;
            
            
            // determine max and min values 
            if (Number > max ){
                max = Number ; 
                }
            if ( Number < min ){
                min = Number ;    
            }
    }
        System.out.println("Number of input values          = "+count);
        System.out.println("Largest number                  = "+max);
        System.out.println("Smallest number                 = "+min);    
    
    
    }
}
  
