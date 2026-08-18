public static Object public static Object solveMagicSquare(int[][] a) {
    int r = 0, c = 0;

    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (a[i][j] == 0) {
                r = i;
                c = j;
            }

    int target = -1;

    for (int i = 0; i < 3; i++) {
        if (a[i][0] != 0 && a[i][1] != 0 && a[i][2] != 0) {
            target = a[i][0] + a[i][1] + a[i][2];
            break;
        }
    }

    if (target == -1)
        for (int j = 0; j < 3; j++)
            if (a[0][j] != 0 && a[1][j] != 0 && a[2][j] != 0) {
                target = a[0][j] + a[1][j] + a[2][j];
                break;
            }

    if (target == -1) return "impossible";

    int x = target - a[r][(c + 1) % 3] - a[r][(c + 2) % 3];
    if (x <= 0) return "impossible";

    a[r][c] = x;

    for (int i = 0; i < 3; i++)
        if (a[i][0] + a[i][1] + a[i][2] != target ||
            a[0][i] + a[1][i] + a[2][i] != target)
            return "impossible";

    if (a[0][0] + a[1][1] + a[2][2] != target ||
        a[0][2] + a[1][1] + a[2][0] != target)
        return "impossible";

    return x;
}(int[][] a) {
    int r = 0, c = 0;

    for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (a[i][j] == 0) {
                r = i;
                c = j;
            }

    int target = -1;

    for (int i = 0; i < 3; i++) {
        if (a[i][0] != 0 && a[i][1] != 0 && a[i][2] != 0) {
            target = a[i][0] + a[i][1] + a[i][2];
            break;
        }
    }

    if (target == -1)
        for (int j = 0; j < 3; j++)
            if (a[0][j] != 0 && a[1][j] != 0 && a[2][j] != 0) {
                target = a[0][j] + a[1][j] + a[2][j];
                break;
            }

    if (target == -1) return "impossible";

    int x = target - a[r][(c + 1) % 3] - a[r][(c + 2) % 3];
    if (x <= 0) return "impossible";

    a[r][c] = x;

    for (int i = 0; i < 3; i++)
        if (a[i][0] + a[i][1] + a[i][2] != target ||
            a[0][i] + a[1][i] + a[2][i] != target)
            return "impossible";

    if (a[0][0] + a[1][1] + a[2][2] != target ||
        a[0][2] + a[1][1] + a[2][0] != target)
        return "impossible";

    return x;
}
