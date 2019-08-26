package Clients;

public class LegalPerson extends Client {

  private final static double PERCENT = 0.01;

  public LegalPerson(double balance) {
    super(balance);
  }

  @Override
  public void withdraw(double amount) {
    amount += amount * PERCENT;
    super.withdraw(amount);
  }
}
