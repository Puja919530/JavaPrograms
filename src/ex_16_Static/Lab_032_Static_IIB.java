package ex_16_Static;

class P{
    static {
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }
    P(){
        System.out.println("DC");
    }
}

public class Lab_032_Static_IIB {
    public static void main(String[] args) {
        P p1 = new P();
        System.out.println();
        P p2 = new P();
        System.out.println();

        P p3 = new P();
    }
}
