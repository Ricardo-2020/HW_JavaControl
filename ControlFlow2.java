// Answer to the Easy Question - 20
//    PROOF:
// public static void main(String[] args) {
//     int k = 80;

//     for (int i = 0; i < 5; i++) {

//            k = k - 12;

//     }
//     System.out.printf("%d", k);
    
// }

import java.util.Scanner;

public class ControlFlow2 {

    public static void main(String[] args) {

        char output = '*';
        int count = 0;
        int i = 0;
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter # of lines: ");
        int numLines = input.nextInt();
        input.close();

        for ( i = 1; i <= numLines; i++) {
            for ( j = 0; j < i; j++) {
                System.out.printf("%c", output);
                count++;
                // once enough '*' are printed new line
                // resets count also
                if (count == i) {
                    System.out.printf("\n");
                    count = 0;
                    break;
                }
            }
        }
        
        
        


    }
}