package garagemsteve;

/**
 *
 * @author 7817177
 */
public class Galpao {
    private Veiculo []veiculos = new Veiculo[999];
    private int numVeiculos = 0;

    public Galpao() {}

    public boolean adicionarVeiculo (Veiculo veiculo) {
        if (numVeiculos <= 6){
            this.veiculos[numVeiculos] = veiculo;
            numVeiculos++;
            return true;
        }
        return false;
    }
    
    public String ImprimirRelacaoVeiculos () {
        
        if (this.veiculos[0] == null)
            return "\nNenhum veiculo cadastrado!\n";
        
        String resultado = " ";
        for (int i = 0; i < numVeiculos; i++) {
            if (this.veiculos[i] != null)
            resultado += this.veiculos[i].obterDescricaoVeiculo() + "\n";
        }
        
        return resultado;
    }
    
    
}
