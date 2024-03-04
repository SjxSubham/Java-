class Equal {
    public static void main(String args[]){
    String str1 = new String("This is really not immutable !!");
    String str2 = new String("this is resutl is not immutable");

    boolean retval;


    // retval = str.equals(str1);
    // System.out.println("returned value = "+retval);
    retval = str1.equals(str2);
    System.out.println("Returned value = "+retval);
    }
}
