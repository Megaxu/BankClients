package Clients;

public class Businessman extends Client {

  private final static double PERCENT_FOR_SMALL_AMOUNT = 0.01;
  private final static double PERCENT_FOR_BIG_AMOUNT = 0.005;

  public Businessman(double balance) {
    super(balance);
  }

  @Override
  public void putMoney(double amount) {
    if (amount >= 1000) {
      amount -= amount * PERCENT_FOR_BIG_AMOUNT;
    } else {
      amount -= amount * PERCENT_FOR_SMALL_AMOUNT;
    }
    super.putMoney(amount);
  }
}
