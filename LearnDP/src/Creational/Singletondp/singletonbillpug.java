package Creational.Singletondp;

public class singletonbillpug {
    private singletonbillpug(){

    }
    private static class billpug{
        public static singletonbillpug singletoninstance=new singletonbillpug();
    }
    public static singletonbillpug getInstance(){
        return billpug.singletoninstance;
    }
}
