public class CreditCalc {
    public double calculate(double credit, double time, double percent) {
        double creditMonth = percent / 12 / 100;
        double a = Math.pow(1 + creditMonth, time);
        double k = creditMonth * (a / (a - 1));
        double payment = credit * k;

        return payment;

    }


}

