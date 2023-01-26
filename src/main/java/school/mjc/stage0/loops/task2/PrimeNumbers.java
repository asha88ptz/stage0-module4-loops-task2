package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            int meet = 0;
            int j = 2;
            while (j * j <= i) {
                if (i % j == 0) {
                    meet = 1;
                    break;
                }
                j++;
            }
            if (meet == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
