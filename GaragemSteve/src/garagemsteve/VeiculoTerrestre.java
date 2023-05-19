package garagemsteve;

/**
 *
 * @author 7817177
 */
public abstract class VeiculoTerrestre  implements Veiculo{
    protected String modelo;
    protected String placa;
    protected String motorista;

    public VeiculoTerrestre(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public void setMotorista (String nome) {
        this.motorista = nome;
    }
    
    public String getplaca (){
        return this.placa;
    }
    
    public abstract String getDescricao ();
}
