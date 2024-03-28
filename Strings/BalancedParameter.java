import java.util.Stack;

public class BalancedParameter {
    public static void main(String[] args) {
        String str= "()(()"; /*stack, iterate, str.chartAt(i) , if x=[,{,( then push continue , */
        if(isbalanced(str)){
            System.out.println("It is a balanced string!");
        } else {
            System.out.print("It is not a balanced string!");
        }
        }
        static boolean isbalanced(String str){
            Stack<Character> s=new Stack<Character>();
            
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);

                if(ch=='{' ||ch=='('||ch=='[' ){
                    s.push(ch);
                    continue;
                }
                if(s.isEmpty()) return false;
                char check;
                switch (ch) {
                    case ')':
                        check = s.pop();
                        if(check=='{'||check=='[') return false;
                        break;
                    case '}':
                        check = s.pop();
                        if(check=='('||check=='[') return false;
                        break;
                    case ']':
                        check = s.pop();
                        if(check=='{'||check=='(') return false;
                        break;
                
                    
                }

            }
            return s.isEmpty();
        }
    
}
