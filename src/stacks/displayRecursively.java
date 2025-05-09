package stacks;

import java.util.Stack;

public class displayRecursively {

    public static void displayRevRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+ " ");
        displayRevRec(st);
        st.push(top);
    }


    public static void displayRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+ " ");
        st.push(top);
    }




    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        displayRevRec(st);
        System.out.println();
        displayRec(st);



    }
}
