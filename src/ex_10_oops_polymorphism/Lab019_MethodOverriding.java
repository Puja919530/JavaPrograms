package ex_10_oops_polymorphism;

class CommonToAll{
    public void openBrowser(){
        System.out.println("Open the IE Browser!");
    }
}

class ChromeTC extends CommonToAll{
    @Override
    public void openBrowser() {
        System.out.println("Chrome will open now!");
    }
    int openBrowser(int a){
        return 10;
    }
}
class FireFox extends CommonToAll{
    public void openBrowser(){
        System.out.println("Firefox will open now!");
    }
}

public class Lab019_MethodOverriding {
    public static void main(String[] args) {
        CommonToAll c = new ChromeTC();
        c.openBrowser();
        FireFox f = new FireFox();
        f.openBrowser();
    }
}
