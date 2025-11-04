public class TabularOutput {
    public static void main(String[] args) {
        System.out.println("N\tN*10\t100*N\t1000*N");

        for (int N = 1; N <= 5; N++) {
            System.out.printf("%d\t%d\t%d\t%d%n", N, N * 10, N * 100, N * 1000);
        }
    }
}
