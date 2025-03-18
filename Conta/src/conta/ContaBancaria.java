
package conta;

public class ContaBancaria {
    
    float saldo=0;
    public String titular;
    
    public void mostrarSaldo()
    {
        
        System.out.println("Seu saldo é de: " + saldo);
        
    }
    
    public void depositar(float valor)
    {
        saldo += valor;
        mostrarSaldo();
    }
    public void Sacar(float valor)
    {
        if (saldo <= 0)
            System.out.println("Saldo zerado!");
        else
        {
            if (valor > saldo)
                 System.out.println("Valor incompativel com o saldo!");
            else
            {
                saldo-= valor;
                mostrarSaldo();
            }
        }
    }
    
    
    
}
