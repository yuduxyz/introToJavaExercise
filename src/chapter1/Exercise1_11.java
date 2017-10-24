package chapter1;

public class Exercise1_11 {
    public static void main (String[] args) {
        double now = 312032486;
        for (int yearCnt = 1; yearCnt <= 5; yearCnt++ ) {
            int secondsPerYear = 60 * 60 * 24 * 365;
            double birth = secondsPerYear / 7.0;
            double death = secondsPerYear / 13.0;
            double transfer = secondsPerYear / 45.0;
            now += birth - death + transfer;
            System.out.println("There will be " + (int)now + " people in the " + yearCnt + " year.");
        }
    }
}
