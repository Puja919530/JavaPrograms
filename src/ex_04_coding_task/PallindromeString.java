package ex_04_coding_task;

public class PallindromeString {
    public static void main(String[] args) {
        String s = "naman";
        int mid = s.length()/2;
        boolean isPallindrome = true;

        for(int i=0,j=s.length()-1; i<=mid && j>=mid; i++,j--){


                if(s.charAt(i)!= s.charAt(j)){
                    isPallindrome = false;
                    break;
                }

        }
        if(isPallindrome){
            System.out.println(s + " is Pallindrome");
        }
        else {
            System.out.println(s + " not pallindrome");
        }
    }
}
