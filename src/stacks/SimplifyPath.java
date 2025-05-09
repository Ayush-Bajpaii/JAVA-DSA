package stacks;

import java.util.Stack;

    class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for (String component : components) {
            if (component.equals("") || component.equals(".")) {
                continue;
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }
        }

        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        SimplifyPath sp = new SimplifyPath();
        System.out.println(sp.simplifyPath("/home/"));            // /home
        System.out.println(sp.simplifyPath("/../"));              // /
        System.out.println(sp.simplifyPath("/home//foo/"));       // /home/foo
        System.out.println(sp.simplifyPath("/a/./b/../../c/"));   // /c
        System.out.println(sp.simplifyPath("/../../../../../"));  // /
    }
}

