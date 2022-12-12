public class Main {
    public static void main(String[] args) {
        CreditCalc service = new CreditCalc();

        double monthPayment1 = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Срок кредита - 1 год. Ежемесячный платеж - " + Math.round(monthPayment1) + " р.");

        double monthPayment2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Срок кредита - 2 года. Ежемесячный платеж - " + Math.round(monthPayment2) + " р.");

        double monthPayment3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Срок кредита - 3 года. Ежемесячный платеж - " + Math.round(monthPayment3) + " р.");
    }
}