public class Main {

    public static void main(String [] args){
        Object [] thang = new Object[]{"stuff",1234,8965,"needle","crap"};
        String testStr = "Helloworld!";
        System.out.println("Runing Kadane Algorithms");
        KadaneAlgorithm.main();
        System.out.printf("\nRunning Haystack: ");//needs to be fixed :|
        haystack.main();
        System.out.println("\nRun No. 2: " + haystack.findNeedle(thang));

        System.out.printf("\nBumps in the road: \n" + BumpsTheRoad.bumps("______n___n_"));

        System.out.println("\n\nString Beans:\n");
        System.out.println("\nPalindrome 1: " + Strings.palindrome1("aba"));
        System.out.println("\nPalindrome 2: " + Strings.palindrome2("racecar"));
        System.out.println("\nRemove char: " + Strings.removeCharacter("aba", 'a'));
        System.out.println("\nCompare: " + Strings.compare("abc", "def"));
        System.out.println("\nTo Char: " + Strings.toCharArry(testStr).length);
        if (Strings.toCharArry(testStr).length >= 12)
            System.out.println("What the heck?! Too long!");
        else
            System.out.println("What the hello?! Too short!");

        System.out.println("\nPermutations: " + Strings.permutations("kevin"));



    }


}
