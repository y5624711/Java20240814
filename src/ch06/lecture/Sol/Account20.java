package ch06.lecture.Sol;

public class Account20 {
    private String accountNum = "";
    private String name = "";
    private int money;

    public Account20(String accountNum, String name, int money){
        this.accountNum = accountNum;
        this.name = name;
        this.money = money;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
