package garagemsteve;

/**
 *
 * @author 7817177
 */
public class Helicoptero implements Veiculo{
    private String modelo;
    private String sigla;
    private String piloto;

    public Helicoptero(String modelo, String sigla) {
        this.modelo = modelo;
        this.sigla = sigla;
    }
    
    public void setPiloto (String nome) {
        this.piloto = nome;
    }
    
    public String getDescricao () {
        return "Modelo " + this.modelo + "\tPiloto " + this.piloto + "\tSigla " + this.sigla;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return this.getDescricao();
    }
}
