import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter bill amount: ");
int bill=sc.nextInt();

if(bill==250)
{
System.out.println("No amount to pay");
}
else if(bill>250 && bill<=350)
{
System.out.println("Amount to pay is 100");
}
else
{
int amount=bill*2;
System.out.println("Amount to pay is "+amount);
}
}
}