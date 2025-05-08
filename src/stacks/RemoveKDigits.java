package stacks;


import java.util.Stack;


class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if (k == n) return "0";

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        for (char digit : stack) {
            result.append(digit);
        }

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        RemoveKDigits solution = new RemoveKDigits();
        System.out.println(solution.removeKdigits("1432219", 3)); // 1219
        System.out.println(solution.removeKdigits("10200", 1));   // 200
        System.out.println(solution.removeKdigits("10", 2));      // 0
    }
}
