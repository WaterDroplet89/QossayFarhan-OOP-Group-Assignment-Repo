/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group.assignment;

    import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        
        int Number = 0;
        int Sentinel = 0; 
        int count = 0;
        int max = -2147483648 , min = 2147483647 ;

        while ( true ) { 
            
            if (Number != Sentinel){
                System.out.print("? ");
                Scanner input = new Scanner(System.in);
                Number = input.nextInt();
                count += 1;
                
                if (Number > max ){
                    max = Number ; 
                }
                
                if ( Number < min ){
                    min = Number ;    
            }
            else{
                break;
            }
            }
           
        }
        
        
            System.out.println(max);
            System.out.println(min);
           
    }
  
}

    
}
