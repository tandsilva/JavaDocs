package entities;
//na declaracao foi associada a heranca extend acount
public class BusinessAcount extends Acount {

    private Double loanlimit;//limitye de imprestimo hahahah
    public BusinessAcount(){
//Super vazio para que a logica seja repetida no construtor da sub classe
        super();
  }


    public BusinessAcount(Integer number, String holder, double balance, Double loanlimit) {
        super(number, holder, balance);
        this.loanlimit = loanlimit;
    }

    public Double getLoanlimit() {
        return loanlimit;
    }

    public void setLoanlimit(Double loanlimit) {
        this.loanlimit = loanlimit;
    }
    //nao pode emprestar um valor acima do limite de emprestimo
    public void loan(double amount){
        if(amount <= loanlimit){
            balance +=amount -10.0;
        }
    }
    //modo diferente de usar o super
    @Override
    public void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
