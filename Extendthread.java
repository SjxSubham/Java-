class AI extends Thread {
    AI(){
    start();
    }
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("AI's i="+i);
        }
    }

}
class Thread2{
    public static void main(String args[]){
        new AI();
        for(int i=0; i<=20; i++){
            System.out.println("main="+i);
        }
    }
}