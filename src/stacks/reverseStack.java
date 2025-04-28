package stacks;
import java.util.Stack;

public class reverseStack {

    public static void pushAtBottom(Stack<Integer> st, int x){
        if(st.size() ==0 ) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }

    public static void reverse(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }


    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(25);

        System.out.println(st);
        reverse(st);
        System.out.println(st);
//
//        Stack<Integer> gt = new Stack<>();
//        while(st.size()>0){
//            int x = st.peek();
//            gt.push(x);
//            st.pop();
//
//        }
//        Stack<Integer> rt = new Stack<>();
//        while(gt.size()>0){
//            rt.push(gt.pop());
//        }
//        System.out.println(rt);
    }

}
