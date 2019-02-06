import java.util.Arrays;
import java.util.Scanner;

public class QuickFind{

    int[] data;

    QuickFind(int[] data){
        this.data = data;
    }

    boolean isConnected(int x, int y){
        if(data[x] == data[y]){
            return true;
        }
        return false;
    }

    void union(int p, int q) {

        int pVal = this.data[p];
        int qVal = this.data[q];

        for (int x = 0; x < data.length; x++) {
            if (data[x] == pVal) {
                data[x] = qVal;
            }

        }

    }

    public static void main(String[] args){

        System.out.print("Enter values separated by commas: ");
        Scanner sc = new Scanner(System.in);
        int[] input = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::valueOf).toArray();

//      Test data: [0,1,2,3,4,5,6,7,8,9]
//
//      test operations = expected output
//
//      union(2,1) = [0,1,1,3,4,5,6,7,8,9]
//      isConnected(1,2) = True
//      isConnected(1,3) = False
//      union(1,3) = [0,3,3,3,4,5,6,7,8,9]
        QuickFind qf = new QuickFind(input);
        qf.union(2,1);

        Arrays.stream(qf.data).forEach(value -> System.out.print(value+" "));
        System.out.println();

        System.out.println("isConnected(1,2) = " + qf.isConnected(1,2));
        System.out.println("isConnected(1,2) = " + qf.isConnected(1,3));

        qf.union(1,3);

        Arrays.stream(qf.data).forEach(value -> System.out.print(value+" "));
        System.out.println();


    }


}