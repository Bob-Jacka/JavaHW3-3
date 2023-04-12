package Third_Task;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println(service.calculate( 1_000_000, 12)); // лям на год
        System.out.println(service.calculate( 1_000_000, 24)); // лям на 2 года
        System.out.println(service.calculate( 1_000_000, 36)); // лям на 3 года
    }
}
