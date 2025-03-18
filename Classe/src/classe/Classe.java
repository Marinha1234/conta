package classe;

public class Classe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro Veiculo = new Carro();
        Veiculo.modelo = "Fiat uno";
        System.out.println(Veiculo.modelo);
        
        Veiculo.cor = "Azul";
        System.out.println(Veiculo.cor);
        
        Veiculo.ano = "1987";
        System.out.println(Veiculo.ano);
        
        Veiculo.acelerar();
        Veiculo.ligar();
        Veiculo.acelerar();
        
    }
    
}
