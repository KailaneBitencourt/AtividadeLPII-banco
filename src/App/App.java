package App;
import banco.*;
import operacao.*;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco("Kailane", "João", "Keila");
        banco.creditar("Kailane", 5.000);
        banco.debitar("João", 2.500);
        banco.transferir("Kailane", "Keila", 1.000);

        System.out.println("Saldo Kailane: " + banco.getSaldo("Kailane"));
        System.out.println("Saldo João: " + banco.getSaldo("João"));
        System.out.println("Saldo Keila: " + banco.getSaldo("Keila"));



    }
}
