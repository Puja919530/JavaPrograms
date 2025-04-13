package ex_20_Generics;

class GenericClass<T>{
    private T data;

    public GenericClass(T data){
        this.data=data;
    }
    public T getData(){
        return this.data;
    }

}

public class Lab_067_GenericClass {
    public static void main(String[] args) {
        GenericClass<Integer> intObjRef = new GenericClass(5);
        GenericClass<String> strObjRef = new GenericClass<>("Puja");
        // T -> it is placeholder only -> it can be any data type.
    }
}
