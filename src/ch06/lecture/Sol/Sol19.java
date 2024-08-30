package ch06.lecture.Sol;

public class Sol19 {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : " + account.getBalance());
    }
}

class Account{
    private int balance;
    private static final int MIN_BALANCE = 0;
    private static final int MAX_BALANCE = 1000000;

    public void setBalance(int balance){
        if(MIN_BALANCE <= balance && balance <= MAX_BALANCE){
            this.balance = balance;
        }else{
            this.balance += 0;
        }
    }

    public int getBalance(){
        return balance;
    }
}
