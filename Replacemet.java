/*use of replace method is useed to replace a perticular sq of char with a given char by consq of char*/ 
class Replacechar{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3,"java");

        System.out.println(sb); // HJavalo    
    }
}