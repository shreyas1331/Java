package Stack2;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParen {
    public static boolean isBalanced(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                st.push(x);
            }else{
                if(st.isEmpty()) return false;
                else if(x==')' && st.peek()!='(') return false;
                else if(x=='}' && st.peek()!='{') return false;
                else if(x==']' && st.peek()!='[') return false;
                else st.pop();
            }
        }
        return st.isEmpty()==true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextLine()){
            String s1=sc.nextLine();
            if(isBalanced(s1)){
                System.out.println("it is balanced");
            }else{
                System.out.println("unbalanced ");
            }
        }
    }
}
