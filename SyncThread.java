// Synchronised 

class disp {
    void display(String s1) { // common  code
        System.out.println("Mr");
        System.out.println(""+s1);
        System.out.println("Roy");
    }
}
class sync implements Runnable{
    disp ob;
    String s1;
    sync(disp ob1, String s2){
        ob = ob1;
        s1 = s2;
        Thread t = new Thread(this,s1);
        t.start();
    }
    public void run(){
        synchronized(ob){
        ob.display(s1);
        }
    }
}
class Synchronized{
    public static void main(String args[]){
        disp ob = new disp();
        new sync(ob,"Ayan");
        new sync(ob,"Sourav");
        new sync(ob,"Amit");
    }
}
