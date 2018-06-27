public class BumpsTheRoad {
    public static String bumps(final String road) {
        int bump = 0;
        for (char rd : road.toCharArray()) {
            if ( rd == 'n')
                bump++;
        }
        if (bump >= 15)
            return "Car Dead";

        else
            return "Woohoo!";// your code here
    }
}