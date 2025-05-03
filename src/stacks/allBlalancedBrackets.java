//package stacks;
//import java.util.*;
//
//    class allBalancedBrackets {
//
//    public static Boolean isBalanced(String str) {
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (ch == '(' || ch == '{' || ch == '[') {
//                st.push(ch);
//            } else if (ch == ')' || ch == '}' || ch == ']') {
//                if (st.isEmpty()) return false;
//
//                char top = st.pop();
//                if ((ch == ')' && top != '(') ||
//                        (ch == '}' && top != '{') ||
//                        (ch == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
//        return st.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(isBalanced(str));
//    }
//}

package stacks;
import java.util.*;

    class allBalancedBrackets {

    public static Boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                if (st.isEmpty()) return false;
                char top = st.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[') ||
                        (ch == '>' && top != '<')) {
                    return false;
                }
            } else {
                // Ignore any non-bracket characters
                continue;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}

