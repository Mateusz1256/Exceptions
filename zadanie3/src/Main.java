public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 1000, "1234567890");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Błąd przelewu: " + e.getMessage());
        } finally {
            System.out.println("Aktualny stan konta: " + account.getBalance());
        }
    }
}