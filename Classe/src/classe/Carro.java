
package classe;

public class Carro {
    
    public String modelo;
    public String cor;
    public String ano;
    
    boolean ligado=false;
    
    public void ligar()
    {
        
        System.out.println("Ligando");
        ligado = !ligado;
        
    }
    
    public void acelerar()
    {
        
        if (ligado)
            System.out.println("Acelerando");
        else
            System.out.println("Precisa ligar o carro!");
        
    }
    
}
