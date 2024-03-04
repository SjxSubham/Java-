class nomatch extends Exception
{
}
class Throweg{
void check(String s1)throws nomatch{
char ch;
ch = s1.charAt(0);
if(ch== 'M'){

System.out.println("valid Id");
}
else{
throw new nomatch();
}
}
}
