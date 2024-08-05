package MathsOperator;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 37;
        boolean[] prime = new boolean[n+1];
        Sieve(n, prime);
    }
    
    //Initially the array "prime" by default has zero at all its index, so we have taken 0 as a true if prime rather than to set the value to 1 at all index and then making false(reset to 0) to those index which is not prime.
    // We will be doing imaging the reverse if index is set to 0 then it is prime and then in the inner loop we will set all its multiple as false(set as 1), again in the next pass outer loop will check for the next index which have 0 and setting its multiple as 1
    // We are setting there's multiple as 1(false) so that it should not be considered next time for checking wheter it is prime or not, which improves the time complexity.


    //Outer loop will run only sqrt(n) and for those value inner loop will make there's multiple false and when this loop ends it means now after this loop all the remaining index which are not marked false are prime and no need to check.
    // eg: let n = 40; then outer loop runs only 6 times and inner loop make all the multiple of 2,3,4,5&6 in between 2 to 40 as false and loop ends, now all the number which are not marked as false between 6 to 40 are prime; 

    private static void Sieve(int n , boolean[] prime){
        for (int i = 2; i*i <= n; i++) { 
            if (!prime[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    prime[j]=true;
                }
            }
        }
       
        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // for i = 2 inner loop will run n/2, i=3 inner loop runs n/3, i = 5, inner loop runs n/5, (inner loop only runs if i is prime no)
    //Time complexity : O((n/2+n/3+n/5+n/7+...))=O(n(1/2+1/3+1/5+1/7+...))=O(n*(log(logn)))
}
