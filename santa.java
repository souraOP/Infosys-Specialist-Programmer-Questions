/*

Problem Statement : 

Wael wants to play Santa this year, so he prepared gifts for all the children of the neighborhood. 
He decided to pack the gifts in boxes and give each child a box. Let’s define the Value of 
the box as the number of distinct types of gifts inside this box.
Wael has N gifts, such that the type of each gift i is A[i]. Wael wants to pack exactly K boxes, 
and he has to put in each box a sub-array of consecutive gifts
Wael wants to maximize the total value of all boxes with gifts. 
Your task is to help him determine this maximum possible total value

Notes

    Each gift should be put in exactly one box, and each box should contain a sub-array of 
    consecutive gifts.
    A box cannot be left empty

Input Format

    The first line contains an integer, N, denoting the number of elements in A
    The next line contains an integer, K, denoting the number of boxes.
    Each line i of the N subsequent lines (where 0≤i<N) contains an integer describing Ai

Constraints

    1 <= N <= 35000
    1 <= K <= Min (N,50)
    1 <= A[i] <= N



Sample Input	Sample Output	Explanation
1
1
1	                1	            Wael will put the only gift in a box so the total value will be 1.


4
1
1
2
2
1	                2	            Wael has only one box he has to put all gifts in it, so that there are two types of gifts in the box, so the value is equal to 2


7
2
1
3
3
1
4
4
4	                5	            It is optimal to put the first two gifts in the first box, and all the rest in the second There are two distinct types in the first box, and three in the second box then, so the total value is 5.


 */

import java.util.*;
public class santa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(n, k));
        sc.close();
    }

    public static int solve(int n, int k) {

    }
}
