package latihan1modul3;

import java.util.Stack;

public class Latihan1modul3 {

    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next element: " + st.peek());
        
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

       

        System.out.println(st.pop());
        System.out.println(st.empty());
}
}

