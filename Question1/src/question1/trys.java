package Question1;

/**
 *
 * @author User
 */
public class trys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int number, i, k, count = 1;
        number = 5;
        count = number - 1;
    
        count = 1;
        for (k = 1; k <= number - 1; k++)
        {
            for (i = 1; i <= count; i++)
              System.out.print(" ");
            count++;
            for (i = 1; i <= 2 * (number - k) - 1; i++)
              System.out.print("0");
            System.out.println();
        }
  }
}