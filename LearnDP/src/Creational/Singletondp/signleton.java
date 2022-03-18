package Creational.Singletondp;

public class signleton {
    private signleton(){

    }
    //private static signleton instance=new signleton(); // Eager initialization this is thread safe but may lead to resource wastage
    public static signleton instance=null ;
    //private static signleton showinstace=instance;
    private static int showheight=11;
    public static int getShowheight(){
        //System.out.println(getShowinstace());// initializing the static variables when ever the class name is called. which is wastage of space
        return showheight;
    }

//    public static signleton getShowinstace() {
//        return showinstace;
//    }

    public static signleton getInstance(){
        if (instance==null){
            synchronized (signleton.class){
                if(instance==null) {
                    instance = new signleton();
                }
            }

        }
        return instance;
    }
}
