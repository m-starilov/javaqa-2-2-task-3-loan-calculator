public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment12 = (int) service.calculate(1_000_000, 12, 9.99);
        System.out.println(monthlyPayment12);

        int monthlyPayment24 = (int) service.calculate(1_000_000, 24, 9.99);
        System.out.println(monthlyPayment24);

        int monthlyPayment36 = (int) service.calculate(1_000_000, 36, 9.99);
        System.out.println(monthlyPayment36);
    }
}
