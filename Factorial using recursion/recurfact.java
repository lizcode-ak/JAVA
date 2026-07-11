public class Recurfact {
    int fact (int n){
        if (n == 0){
            return(1);
        }
        else{
            return(n * fact(n-1));
        }
    }
    public static void main(String []args){
        Recurfact m = new Recurfact();
        System.out.println("Factorial is: " + m.fact(5));
    }
}


