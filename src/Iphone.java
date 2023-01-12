public class Iphone implements Smartphones, IOS{
    @Override
    public void sms() {
        System.out.println("Iphone sms");
    }

    @Override
    public void internet() {
        System.out.println("Iphone internet");
    }

    @Override
    public void call() {
        System.out.println("Iphone call");
    }
}
