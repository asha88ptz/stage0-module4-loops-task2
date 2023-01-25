package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int n = multiplyByAndToInclusive;
        if (n < 0) n = -n;
        if (n == 0) {
//            System.out.println("");
        } else {
            for (int i = 0; i <= n; i++) {
                System.out.println(multiplyByAndToInclusive * i);
            }
        }
    }
}
