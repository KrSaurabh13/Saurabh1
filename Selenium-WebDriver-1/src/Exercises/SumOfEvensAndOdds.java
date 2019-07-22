package Exercises;

import java.util.Arrays;
 
 
public class SumOfEvensAndOdds {
                
                //Function 
                public int[] getSumOfEvensAndOdds(int[] input) {
                                // Student code begins here
                int x[] = new int[5];
                                int sumEven =0 , sumOdd = 0;
                                
                                for(int i=0; i<input.length; i++) {
                                                 if (input[i] % 2 == 0)
                                                {
                                                                sumEven = sumEven + input[i];
                                                
                                                } else {
                                                                sumOdd = sumOdd + input[i];
                                                
                                                }
                                }
                                
                                x[0] = sumEven;
                                x[1] = sumOdd;
                
 
                                return x;
                                // Student code ends here
                }              
 
                public void printSumOfEvensAndOdds(int[] input) {
                                System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
                }
 
                public static void main(String[] args) {
 
                                try {
                                                int[] input = new int[args.length];
                                                for (int i = 0; i < input.length; i++) {
                                                                input[i] = Integer.parseInt(args[i]);
                                                }

                                                SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
                                                obj.printSumOfEvensAndOdds(input);
                                } catch (NumberFormatException e) {
                                                System.out.println("Only numbers are allowed.");
                                }
 
                }
}
 
 
