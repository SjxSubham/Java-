/* the delete method is used to delee a sq of char from given string */
class C{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb); // Hlo
    }
}