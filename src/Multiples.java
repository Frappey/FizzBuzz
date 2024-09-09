public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiple());
    }

    private static int multiple() {
        int i = 0;
        int tot = 0;
        while (i <= 1000) {
            boolean isM3O5 = (i % 3 == 0 || i % 5 == 0);
            if (isM3O5) {
                tot++;
            }
            i++;
        }
        return tot;
    }
}
