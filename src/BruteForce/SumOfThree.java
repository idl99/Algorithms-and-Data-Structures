package BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfThree {

    static int compute(int[] data){
        int count = 0;
        int n = data.length;
        
        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k = j+1; k<n; k++){
                    if(data[i] + data[j] + data[k] == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        // Test input: 30,-40,-20,-10,40,0,10,5
        // Test output: 4
        System.out.print("Enter values separated by commas: ");
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::valueOf).toArray();

        System.out.println(String.format("Output: %d", SumOfThree.compute(input)));
    }

}