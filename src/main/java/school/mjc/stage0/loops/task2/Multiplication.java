package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0)
            return;

        int n = multiplyByAndToInclusive;
        if (n < 0)
            n = -n;

        int i = 0;
        while (i <= n) {
            System.out.println(multiplyByAndToInclusive * i);
            i++;
        }
    }
}
