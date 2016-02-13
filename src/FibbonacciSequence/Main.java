package FibbonacciSequence;

public class Main {

    public static void main(String[] args) {
        int n = 25;
        int[] sequence = new int[n+1];
        
        Fibonacci f = new Fibonacci();
        f.generate(n, sequence);
        
        for(int i=0; i<sequence.length; i++)
            System.out.println("f("+i+"): "+sequence[i]);
    }
}
