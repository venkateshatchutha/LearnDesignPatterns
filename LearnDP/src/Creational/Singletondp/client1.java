package Creational.Singletondp;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client1 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        int[] arr=new int[5];
        //singleton1 s=new singleton1();
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        //executorService.
        singleton1 s1=singleton1.getbillpuginstace();
        singleton1 s2=singleton1.getbillpuginstace();
        System.out.println(s1);
        System.out.println(s2);
    }

}
