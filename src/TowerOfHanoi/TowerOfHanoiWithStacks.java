package TowerOfHanoi;

import java.util.Scanner;
import java.util.Stack;

public class TowerOfHanoiWithStacks {

    public static void move(int n, Stack<Integer> source, Stack<Integer> destination, Stack<Integer> aux){
        if (n>0) {
            move(n-1, source, aux, destination); // Step 1 - Recursively move all discs excluding the bottom most disc to the aux
            // Bottom most disc of problem set
            int disk = source.pop();
            destination.push(disk); // Step 2 - Move bottom most disc to the destination
            move(n-1, aux, destination, source); // Step 3 - Recursively move all discs from aux to destination
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Get number of disks
        System.out.print("Enter the number of disks: ");
        int noOfDisc = sc.nextInt();

        // Creating the tower
        Stack<Integer> source = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        // Initializing the source tower with discs
        for(int i=1; i<=noOfDisc; i++){
            source.push(i);
        }

        System.out.println("=== Before solving puzzle ===");
        System.out.println("Source" + source.toString()); // Stack ordered such that R most element is top of stack
        System.out.println("Destination" + destination.toString());

        TowerOfHanoiWithStacks.move(noOfDisc, source, destination,
                aux);

        System.out.println("=== After solving puzzle ===");
        System.out.println("Source" + source.toString());
        System.out.println("Destination" + destination.toString());

    }

}
