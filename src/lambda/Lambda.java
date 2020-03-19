package lambda;

public class Lambda {
    public static void main(String[] args) {
        IA ia=(a,b)->{
            return a+b;
        };
        System.out.println(ia.test(10,20));
    }


}
