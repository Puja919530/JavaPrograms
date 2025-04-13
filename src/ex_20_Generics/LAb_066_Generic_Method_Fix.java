package ex_20_Generics;

public class LAb_066_Generic_Method_Fix {
    public static void main(String[] args) {
        temp_sum(23,5);
        temp_sum(22.2,43.3);
        temp_sum("Puja", "Bute");
    }
    static <G> G temp_sum(G a, G b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
