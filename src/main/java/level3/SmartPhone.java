package level3;

public class SmartPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Calling....");
    }

    public void takePicture() {
        System.out.println("A picture has been taken.");
    }


}
