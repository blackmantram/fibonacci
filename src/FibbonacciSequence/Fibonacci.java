package FibbonacciSequence;


public class Fibonacci {
    
    public int generate (int n, int[] sequence){
        if (n<=1){
            sequence[n] = n;
            return n;
        }else{
            int a= n-1; int b =n-2;
            int result = generate (a, sequence)+ generate (b, sequence);
            sequence[n] = result;
            return result;
        }
    }   
}