
package conta;
import java.util.Scanner;

public class Conta {

    public static void main(String[] args) {
        ContaBancaria ContaNova = new ContaBancaria();
        
        boolean sair=false;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do titular: ");
        ContaNova.titular = scan.next();
        
        do
        {
            
            System.out.println("Escolha a opção: ");
            System.out.println("1 - depositar");
            System.out.println("2 - sacar");
            System.out.println("3 - sair");
            
            int escolha = scan.nextInt();
            float valor;
            
            switch (escolha)
            {
                case 1 -> {
                    System.out.println("Digite o valor a ser depoisitado: ");
                    valor = scan.nextFloat();
                    ContaNova.depositar(valor);
                }
                case 2 -> {
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = scan.nextFloat();
                    ContaNova.Sacar(valor);
                }
                case 3 -> sair=true;
                
            }
            
        }
        while (sair==false);
        
        ContaNova.depositar(1500);
        
    }
    
}
