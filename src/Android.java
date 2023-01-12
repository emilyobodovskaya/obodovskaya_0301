public class Android implements Smartphones, Linux{
    @Override
    public void sms() {
        System.out.println("Android sms");
    }

    @Override
    public void internet() {
        System.out.println("Android internet");
    }

    @Override
    public void call() {
        System.out.println("Android call");
    }
}
