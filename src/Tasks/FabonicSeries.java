package Tasks;

public class FabonicSeries {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;

        for(int i=1; i<=10;i++){

            int series = n1 + n2;
            n1 = n2;
            n2 = series;
            System.out.print(series + "\t");

        }
    }
}
