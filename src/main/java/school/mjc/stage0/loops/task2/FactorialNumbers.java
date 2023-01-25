package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int faq = 1;
        System.out.println(faq);
        for (int i = 1; i <= printToInclusive; i++) {
            faq *= i;
            System.out.println(faq);
        }
    }
}
