public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m * n];

        int r = 0, c = 0;
        boolean dir = true;

        for (int i = 0; i < m * n; i++) {
            res[i] = mat[r][c];

            if (dir) {
                if (c == n - 1) {
                    r++;
                    dir = false;
                } else if (r == 0) {
                    c++;
                    dir = false;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = true;
                } else if (c == 0) {
                    r++;
                    dir = true;
                } else {
                    r++;
                    c--;
                }
            }

        }
        return res;
    }
}

/**
 * TC: O(m*n)
 * SC: O(1)
 */
