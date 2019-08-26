package Clients;

public abstract class Client {

  private double balance;

  Client(double balance) {
    this.balance = balance;
  }

  private double getBalance() {
    return balance;
  }

  private void setBalance(double balance) {
    this.balance = balance;
  }

  public void putMoney(double amount) {
    if (checkMoreThanZero(amount)) {
      setBalance(balance + amount);
      System.out.println("Счет успешно пополнен на " + amount + " у.е.");
    } else {
      System.out.println("Сумма не должна быть отрицательной.");
    }
  }

  public void withdraw(double amount) {
    if (checkMoreThanZero(amount)) {
      if (amount > balance) {
        System.out.println("Снятие невозможно, на счету недостаточно средств.");
      } else {
        setBalance(balance - amount);
        System.out.println("Со счета было снято " + amount);
      }
    } else {
      System.out.println("Сумма не должна быть отрицательной.");
    }
  }

  public void printBalance() {
    System.out.println("Баланс равен " + getBalance() + " у.е.");
  }

  private boolean checkMoreThanZero(double amount) {
    return amount >= 0;
  }
}