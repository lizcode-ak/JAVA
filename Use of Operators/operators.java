public class _operators {
    public static void main(String []args){
        //Artithmatic
        int a = 32;
        int b = 2;
        System.out.println("Addition: " + (a+b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Substraction: " + (a-b));
        System.out.println("Division: " + (a/b));
        System.out.println("Modulus: " + (a%b));

        //Unary
        System.out.println("Pre Increment of a: " + (++a));
        System.out.println("Post Increment of a: " + (a++));
        System.out.println("Pre Decrement of b: " + (--b));
        System.out.println("Post Decrement of b: " + (b--));
        
        System.out.println("Present value of a: " + a);
        System.out.println("Present value of b: " + b);
    }
    
}
