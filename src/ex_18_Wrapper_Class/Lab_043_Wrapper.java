package ex_18_Wrapper_Class;

interface SIMCard{
    void enterCard();
}

class OldPhone implements SIMCard{

    void calling(){
        System.out.println("Dialpad");
    }

    @Override
    public void enterCard() {
        System.out.println("card enterd");
    }
}

class Mobile extends OldPhone{
    private Integer phone;
    private String name;
    private Double price;
    static String mobile_carrier = "airtel";



    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    Mobile(){
        System.out.println("DC");
    }

    public Mobile(Integer phone,String name,Double price) {
        this.phone = phone;
        this.name = name;
        this.price = price;
    }

    void display(){
        System.out.println(this.name+this.phone+this
                .price);
    }

    static void switchOnAirplaneMode(){
        System.out.println("Common Airplane Mode");
    }

    void priceChange(Integer price){
        System.out.println("Change price in Integers");
    }
    void priceChange(Double price){
        System.out.println("Change price in decimals");
    }

    @Override
    void calling() {
        System.out.println("touchPad");    }
}

public class Lab_043_Wrapper {
    public static void main(String[] args) {
        Mobile iphone = new Mobile(1, "iphone 16",120000.00);
        Mobile samsung = new Mobile(2, "ultra 24",1350000.00);

        iphone.setPrice(200000.89);
        iphone.display();
        samsung.display();

        System.out.println(Mobile.mobile_carrier);
        Mobile.switchOnAirplaneMode();
    }
}


