/*
Problem Statement:

Your birthday is coming soon and one of your friends, Alex, is thinking about a gift for you. 
He knows that you really like integer arrays with interesting properties.

He selected two numbers, N and K and decided to write down on paper all integer arrays of length K 
(in form a[1], a[2], …, a[K]), where every number a[i] is in range from 1 to N, and, moreover, 
a[i+1] is divisible by a[i] (where 1 < i <= K), and give you this paper as a birthday present.

Alex is very patient, so he managed to do this. Now you’re wondering, how many different 
arrays are written down on this paper?

Since the answer can be really large, print it modulo 10000.

Input:

    The first line contains an integer, n, denoting the maximum possible value in the arrays.
    The next line contains an integer, k, denoting the length of the arrays.



Input	Output	Output Description
2          2        - The required length is 1, so there are only two possible arrays: [1] and [2].
1	


2          3        - All possible arrays are [1, 1], [1, 2], [2, 2].
2                   - [2, 1] is invalid because 1 is not divisible by 2.

3          5        - All possible arrays are [1, 1], [1, 2], [1, 3], [2, 2], [3, 3].
2

 */

import java.util.Scanner;

public class birthdayGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        final int MOD = 10000;

        // DP array
        int[][] dp = new int[K + 1][N + 1];

        // Base case: for sequences of length 1
        for (int j = 1; j <= N; j++) {
            dp[1][j] = 1;
        }

        // Fill the DP array
        for (int i = 2; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                for (int p = j; p <= N; p += j) {
                    dp[i][p] = (dp[i][p] + dp[i - 1][j]) % MOD;
                }
            }
        }

        // Sum up all the valid sequences of length K
        int result = 0;
        for (int j = 1; j <= N; j++) {
            result = (result + dp[K][j]) % MOD;
        }

        // Output the result
        System.out.println(result);
        sc.close();
    }

}
