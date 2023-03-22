package entities;

public class SavingsAcount extends  Acount{
    private Double interestRate;
    public  SavingsAcount(){
        super();
    }
    //o construtor da super classe sera executado
    public SavingsAcount(Integer number, String holder, double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    //metodo taxa de juros
    public void updateBalance(){
        balance += balance*interestRate;
    }

    //usa o override para indicar que eh um metodo da super classe
    //ou seja em contas poupancas nao sera cobrada uma taxa
    @Override
    public void withdraw(double amount){
        balance -=amount;
    }
}
