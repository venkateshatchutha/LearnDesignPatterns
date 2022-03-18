package Creational.Singletondp;


import Creational.builderdp.builder;

public class cleint {
    public static void main(String[] args) {
        //signleton signleton = Creational.Singletondp.signleton.getInstance();
        //Creational.Singletondp.signleton signleton1= signleton.instance;
        System.out.println(signleton.getShowheight());
        System.out.println(signleton.getShowheight());
        //signleton signleton2 = Creational.Singletondp.signleton.getInstance();
        //System.out.println(signleton2);
//        Thread th=new Thread();
//        Thread th2=new Thread();
//        th.
        System.out.println(singletonbillpug.getInstance());
        System.out.println(singletonbillpug.getInstance());
        Creational.builderdp.builder b=new builder();
        String a= b.name2;


    }
}
