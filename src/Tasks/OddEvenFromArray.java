package Tasks;

public class OddEvenFromArray {
    public static void main(String[] args) {

//        int[] arr = new int[10];
        int arr[] = {7,4,2,8,3,10,11};

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println("Even number- " +arr[i]);
            }
            else{
                System.out.println("Odd number- " + arr[i]);
            }
        }
    }
}
