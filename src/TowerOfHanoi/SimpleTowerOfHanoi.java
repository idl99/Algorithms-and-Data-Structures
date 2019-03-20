package TowerOfHanoi;

class SimpleTowerOfHanoi {

    static void towerOfHanoi(int n, char from, char to, char aux){
        if (n == 1)
        {
            System.out.println("Moving disk 1 from rod " +  from + " to rod " + to);
            return;
        }
        towerOfHanoi(n-1, from, aux, to);
        System.out.println("Moving disk " + n + " from rod " +  from + " to rod " + to);
        towerOfHanoi(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }

}
