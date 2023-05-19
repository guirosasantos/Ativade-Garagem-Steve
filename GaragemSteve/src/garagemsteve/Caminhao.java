package garagemsteve;

/**
 *
 * @author 7817177
 */
public class Caminhao extends VeiculoTerrestre{

    private double capacidadeCarga;
    
    public Caminhao(double capacidade, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidade;
    }
    
    public double getCapacidade () {
        return this.capacidadeCarga;
    }

    @Override
    public String getDescricao() {
        return "Capacidade " + this.getCapacidade() + "\tModelo " + this.modelo + "\tMotorista " + this.motorista + "\tPlaca " + this.placa;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return this.getDescricao();
    }
     
}
