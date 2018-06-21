public class haystack {
    public static void main(String[] args) {
        Object[] haystack1 = new Object[]{"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        String needlePos = findNeedle(haystack1);
        System.out.println(needlePos);
    }

    public static String findNeedle(Object[] haystack) {
        int position = 0;

        for(int i = 0; i < haystack.length; ++i) {
            if(haystack[i] == "needle") {
                position = i + 1;
            }
        }

        return "Needle found at position " + position;
    }
}
