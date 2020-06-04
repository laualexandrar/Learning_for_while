public class FibonacciSequence {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int temporal;
        int limite = 100;

        System.out.print(n1);
        System.out.print(n2);

        while (n1 +n2 <= limite){
            temporal = n1;
            n1 = n2;
            n2 = n1 + temporal;
            System.out.print(n2);

        }
    }
}