public class PrimeTo100 {
    public static void main(String[] args) {
        for (int x = 2; x<=100; x++) {
            boolean check = true;
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(x);
            }
        }
    }
}
