package BitManipulation;

public class ReverseInteger {
    public static void main(String[] args) {
        int x = -1534236469;
        boolean flag = x < 0;
        x = Math.abs(x);
        int y = 0;
        while (x > 0) {
            y = y * 10;
            y += x % 10;
            x = x / 10;
        }
        int ans = flag ? -1 * y : y;
        if (ans < 0) ans = 0;
        System.out.println(ans);
    }
}
