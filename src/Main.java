import Clients.Businessman;
import Clients.Client;
import Clients.LegalPerson;
import Clients.PrivatePerson;

public class Main {

  public static void main(String[] args) {

    Client client = new PrivatePerson(1000);
    client.putMoney(-100);
    client.putMoney(100);
    client.withdraw(500);
    client.withdraw(-500);
    client.withdraw(10000);
    client.printBalance();

    System.out.println("-------------------------------------------------------------------------");

    Client legalClient = new LegalPerson(1000);
    legalClient.putMoney(-100);
    legalClient.putMoney(100);
    legalClient.withdraw(500);
    legalClient.withdraw(-500);
    legalClient.withdraw(10000);
    legalClient.printBalance();

    System.out.println("-------------------------------------------------------------------------");

    Client businesClient = new Businessman(1000);
    businesClient.putMoney(-100);
    businesClient.putMoney(100);
    businesClient.putMoney(1000);
    businesClient.putMoney(100);
    businesClient.withdraw(500);
    businesClient.withdraw(-500);
    businesClient.withdraw(10000);
    businesClient.printBalance();
  }
}