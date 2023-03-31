package entities;

public class OuttsourceEmployee extends Employee {
    private double additionalCharge;

    public OuttsourceEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public OuttsourceEmployee() {
        super();
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //você está acessando a implementação da classe pai usando super voce esta sobrescrevendo o metodo
    @Override
    public double payment(){
        return super.payment()+additionalCharge*1.1;
    }

}
