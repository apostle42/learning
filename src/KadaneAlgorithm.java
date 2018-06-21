

public class KadaneAlgorithm {
    public static void main(String[] args) {
        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(KadaneAlgorithm2.sum(new int[]{-2, 2, -3, 4, -1, -2, 1, -5, 4}));

    }

    public static int sequence(int[] arr) {
        int maxEnding = 0, maxSoFar = 0;

        for (int num : arr) {
            maxEnding += num;
            if(maxEnding < 0) {
                maxEnding = 0;
            }
            if(maxSoFar < maxEnding )
                maxSoFar = maxEnding;

        }
        return maxSoFar;
    }
}
