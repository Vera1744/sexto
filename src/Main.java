
public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        double amount = 1000_000;
        double month = 12;
        double interest = 9.99;
        System.out.println(service.calculate(amount, month, interest));
        System.out.println();


        System.out.println(service.calculate(1000_000, 24, 9.99));
        System.out.println();
        System.out.println(service.calculate(1_000_000, 36, 9.99));
    }
}