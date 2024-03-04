class thread_eg{
public static void main(String a[]){
Thread ob = new Thread();
ob.currentThread();
System.out.println(ob);
ob.setName("ayan");
ob.setPriority(10);
System.out.println(ob);
}
}