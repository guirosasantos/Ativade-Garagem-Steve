package garagemsteve;

/**
 *
 * @author 7817177
 */
public class Carro extends VeiculoTerrestre{

    private double potencia;
    
    public Carro(double potencia, String modelo, String placa) {
        super(modelo, placa);
        this.potencia = potencia;
    }
    
    public double getPotencia () {
        return this.potencia;
    }

    @Override
    public String getDescricao() {
        return "Potencia " + this.getPotencia() + "\tPlaca " + this.getplaca() + "\tModelo "+ this.modelo + "\tMotorista " +this.motorista;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return this.getDescricao();
    }
    
}
