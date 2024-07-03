package redmopag.leetcode.solutions;

import java.util.Arrays;

/**
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money
 * the i-th customer has in the j-th bank. Return the wealth that the richest customer has.
 * <p>
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts){
        int maxWelath = 0;

        for(int[] account : accounts){
            int currentWealth = 0;

            for(int bank : account){
                currentWealth += bank;
            }

            maxWelath = Math.max(maxWelath, currentWealth);
        }
        return maxWelath;
    }

    public static void main(String[] args) {
        int[][] input = {{1,2,3},{3,2,1}};
        Arrays.stream(input).forEach(el -> System.out.println(Arrays.toString(el)));

        System.out.println("Output: " + maximumWealth(input));
    }
}
