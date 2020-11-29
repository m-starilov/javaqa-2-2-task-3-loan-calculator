public class CreditPaymentService {
    public double calculate(int amount, int term, double interestRate){
        double perInterestRate = interestRate / 100 / 12;
        return amount*(perInterestRate + perInterestRate / (Math.pow(1 + perInterestRate, term)-1));
    }
}
