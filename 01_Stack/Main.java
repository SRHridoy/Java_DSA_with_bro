import java.util.Stack;


public class Main{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        
        stack.push("C");
        stack.push("C++");
        stack.push("Java");
        stack.push("Kotlin");

        System.out.println(stack.empty());
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        

        //java.util.EmptyStackException     
                // stack.pop();
                // System.out.println(stack);
        
        //Jodi ekdom top element e jai ebong eta pop kori thokhn eta oi object return kore tai eta jodi amader korkar hoi taile amra eta assign kore rakhbo...

        //String myFavLang = stack.pop();
        //System.out.println(myFavLang);

        //Kintu evabe korleo pop hoye stack khali hoye jai tai amra top dekhte peek() use kori...:

        System.out.println(stack.peek());


        //Kono kisu search korte hole :
        System.out.println(stack.search("Java"));//na thakle -1 return korbe...
        stack.push("C++");
        stack.push("Java");
        stack.push("Kotlin");
        System.out.println(stack.search("C"));//paile position return korbe...but ekhane top to bottom hisab kora lagbe ke age k pore...

        for(int i = 0; i < 10; i++){
            stack.push("Objective C");
        }

        
    }
}