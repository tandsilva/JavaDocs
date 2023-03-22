package entities;

public class Acount {
    private Integer number;
    private String holder;

     protected double balance;
    //Em Java, quando uma classe tem construtor vazio, os atributos dela recebem uma inicialização padrão, a depender dos tipos destes atributos.
    public Acount() {
    }
//o construtor da super classe
    public Acount(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount){
        balance -=amount+5.0;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}
