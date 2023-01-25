package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        for (int i = 2; i <= printToInclusive; i++) {
            int meet = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    meet = 1;
                    break;
                }
            }
            if (meet == 0) {
                System.out.println(i);
            }
        }
    }
}
