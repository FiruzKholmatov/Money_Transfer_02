public class Main {
    public static void main(String[] args) {
        int balance = 2_000_000_000;
        int transferDebitAmount = 500_000_000;
        int currentBalance = balance + transferDebitAmount;
        System.out.println(currentBalance);
    }
}
