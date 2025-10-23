package level3;

public class Main {

    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();

        GenericClass.genericPhone(sp);
        GenericClass.genericSmartPhone(sp);

        System.out.println("The generic method limited by Phone can't access takePicture() method");
        System.out.println("The takePicture() method is only declared in SmartPhone class.");

    }


}
