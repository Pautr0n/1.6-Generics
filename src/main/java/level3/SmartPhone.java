package level3;

public class SmartPhone implements Phone {

    @Override
    public void call() {
        IO.println("Calling....");
    }

    public void takePicture(){
        IO.println("A picture has been taken.");
    }


}
