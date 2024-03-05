/*the insert method is used to insert  a 
perticular string in a given string at a pertiular position*/

class BP{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1,"java");
        //now original string is changed
        System.out.println(sb);
        //Prints hJAvllo
    }
}
