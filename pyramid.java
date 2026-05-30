import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String rev="";
for(int i=n.length()-1;i>=0;i--)
{
rev=rev+n.charAt(i);
}
if(n.equals(rev))
{
System.out.println("Equal");
}
else
{
System.out.println("Not equal");
}
}
}

