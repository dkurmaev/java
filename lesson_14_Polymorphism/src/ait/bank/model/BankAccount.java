package ait.bank.model;
// Создаем класс БанкАккаунт
public class BankAccount {
    // Создаем типы переменных
    private long account;
    private String owner;
    private String bank;
    private int branch;
    private double balance;

    //Вызов конструктора alt + einf
    public BankAccount(long account, String owner, String bank, int branch, double balance) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;

    }

    //Вызов перезагруженного конструктора без баланса
    public BankAccount(long account, String owner, String bank, int branch) {
        this.account = account;
        this.owner = owner;
        this.bank = bank;
        this.branch = branch;
        balance = 0;
    }

    //Вызов перезагруженного конструктора без овнера
    public BankAccount(long account, String bank, int branch, double balance) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonymous";
    }

    //Вызов перезагруженного конструктора без баланса и овнера
    public BankAccount(long account, String bank, int branch) {
        this.account = account;
        this.bank = bank;
        this.branch = branch;
        owner = "Anonymous";
        balance = 0;
    }
// Вызов gettera
    public long getAccount() {
        return account;
    }

    public String getOwner() {
        return owner;
    }

    public String getBank() {
        return bank;
    }

    public int getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }
//вызов setter
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void deposit(double sum) {
        balance = balance + sum;
    }

    public boolean withdraw(double sum) {
        if (balance >= sum) {
            balance = balance - sum;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("acc: " + account + ", owner: " + owner + ", bank: " + bank + ", balance: " + balance);
    }

    public void display(String greeting) {
        System.out.println("acc: " + account + ", " + greeting + " " + owner + ", bank: " + bank + ", balance: " + balance);
    }
}
