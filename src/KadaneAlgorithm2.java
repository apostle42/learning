public class KadaneAlgorithm2 {
    public static int sum(int [] arr){
        int a = 0, b = 0, c = 0;
        for ( int n : arr) {
            a += n;
            b = Math.min(a, b);
            c = Math.max(c, a - b);

        }
        return c;
    }
}
