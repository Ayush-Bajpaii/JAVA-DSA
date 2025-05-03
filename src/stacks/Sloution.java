package stacks;

import java.util.Stack;

    class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] pse = new int[n]; // Previous smaller element
        int[] nse = new int[n]; // Next smaller element
        Stack<Integer> st = new Stack<>();

        // Calculate next smaller element (nse)
        st.push(n - 1);
        nse[n - 1] = n;
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Clear stack and calculate previous smaller element (pse)
        while (!st.isEmpty()) st.pop();
        st.push(0);
        pse[0] = -1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // Calculate maximum area
        int max = 0;
        for (int i = 0; i < n; i++) {
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: heights = [2, 1, 5, 6, 2, 3]
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println("Test case 1: heights = [2, 1, 5, 6, 2, 3]");
        System.out.println("Largest Rectangle Area: " + solution.largestRectangleArea(heights1));

        // Test case 2: heights = [1]
        int[] heights2 = {1};
        System.out.println("\nTest case 2: heights = [1]");
        System.out.println("Largest Rectangle Area: " + solution.largestRectangleArea(heights2));

        // Test case 3: heights = [2, 4]
        int[] heights3 = {2, 4};
        System.out.println("\nTest case 3: heights = [2, 4]");
        System.out.println("Largest Rectangle Area: " + solution.largestRectangleArea(heights3));

        // Test case 4: heights = [2, 2, 2, 2]
        int[] heights4 = {2, 2, 2, 2};
        System.out.println("\nTest case 4: heights = [2, 2, 2, 2]");
        System.out.println("Largest Rectangle Area: " + solution.largestRectangleArea(heights4));

        int[] heights5 = {18, 18, 6, 16, 18, 18};
        System.out.println("\nTest case 5: heights = [2, 18, 6, 16, 18, 18]");
        System.out.println("Largest Rectangle Area: " + solution.largestRectangleArea(heights5));



        int[] heights6 = {0};
        System.out.println("\nTest case 6: heights = [0]");
        System.out.println("Largest Rectangle Area: " + solution.largestRectangleArea(heights6));

    }
}