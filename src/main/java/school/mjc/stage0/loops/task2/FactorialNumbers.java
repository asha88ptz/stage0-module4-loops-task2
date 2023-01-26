package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int faq = 1;
        System.out.println(faq);
        int i = 1;
        while(i <= printToInclusive) {
            faq *= i;
            System.out.println(faq);
            i++;
        }
    }
}
