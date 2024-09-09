public class Multiples {
    public static void main(String[] args) {
        System.out.println(Multiple());
    }

    private static int Multiple() {
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
