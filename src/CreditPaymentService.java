public class CreditPaymentService {
    public int calculate(double amount, double month, double interest) {
        double interestMonth = interest / 12 / 100; //месячная процентная ставка
        double x = Math.pow(1 + interestMonth, month); //где х часть формулы
        double y = (interestMonth * x) / (x - 1); //где у - коэфициент аннуитета
        double monthPayment = y * amount;
        return (int) monthPayment;

    }
}
