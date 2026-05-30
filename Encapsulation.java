class Student {
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(7);
        System.out.println(s.getId());
    }
}
class Bank
{
    private int balance = 9999;
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public int getBalance(){
        return balance;
    }
    public static void main(String args[])
    {
        Bank amt = new Bank();
        amt.deposit(2000);
        amt.withdraw(1000);
        System.out.println("Balance: " + a.getBalance());
    }
}
