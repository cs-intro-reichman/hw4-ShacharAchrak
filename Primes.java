public class Primes {
    public static void main(String[] args) {
       int n = Integer.parseInt(args[0]);
       boolean [] arr = new boolean [n+1];

       for (int i = 2; i<arr.length; i++){
        arr[i] =true;
       }

       for (int p = 2; p*p <n; p++){
        if (arr[p]){
             for (int i = p * p; i <= n; i += p){
                arr[i] = false;
             }
        }
       }

       int count = 0;
       for (int i = 2; i<=n; i++){
        if (arr[i]){
            System.out.println(i);
            count ++;
       }
    }
   
    System.out.println("There are " + count + " primes between 2 and " + n + " (" +  (int) ((double) count / (n) * 100) + "% are primes)");
   }
}