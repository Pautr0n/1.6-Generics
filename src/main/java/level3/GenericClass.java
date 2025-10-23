package level3;

public class GenericClass {

    public static <T extends Phone> void genericPhone(T t) {

        t.call();

    }

    public static <T extends SmartPhone> void genericSmartPhone(T t) {

        t.call();
        t.takePicture();

    }

}
