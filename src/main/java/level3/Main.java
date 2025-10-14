package level3;

public class Main {

    public static void main(String[] args){

        SmartPhone sp = new SmartPhone();

        GenericClass.genericPhone(sp);
        GenericClass.genericSmartPhone(sp);

        IO.println("The generic method limited by Phone can't access takePicture() method");
        IO.println("The takePicture() method is only declared in SmartPhone class.");

    }


}
