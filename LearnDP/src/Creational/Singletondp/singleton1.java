package Creational.Singletondp;

public class singleton1 {
    private singleton1(){}
    private static Object mutex = new Object();
    public static singleton1 instance=null;

    private static class getnewinstace { // how can i access the private class
        public static final singleton1 object= new singleton1();
    }

    public static singleton1 getbillpuginstace(){
       return getnewinstace.object;
    }

    public static  singleton1 getinstance(){
        if (instance==null){
            //t1, t2
            synchronized(mutex) {
                if(instance==null) {
                    instance = new singleton1();
                }
            }
        }
        System.out.println(instance);
        return instance;
    }
}
