
public class Main {
    public static void main(String[] args) {
        Credit servise = new Credit ();
        double payment = servise.calculate(1_000_000, 12);
        System.out.println("Ежемесячный платеж: " + payment);
    }
}