class Solution {

    public int lastRemaining(int n) {
        return fun(n, true);
    }

    private int fun(int n, boolean l2r) {
        if (n == 1) return 1;

        if (l2r || n % 2 == 1) {
            return 2 * fun(n / 2, !l2r);
        }
        else {
            return 2 * fun(n / 2, !l2r) - 1;
        }
    }
}