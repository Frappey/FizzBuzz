public class Reduce {
    public static void main(String[] args) {
        System.out.println(Reduce());
    }
    private static int Reduce() {
        int n = 100;
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            }
            else {
                n -= 1;
            }
            steps++;
        }
        return steps;
    }
}
