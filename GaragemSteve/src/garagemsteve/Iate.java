package garagemsteve;

/**
 *
 * @author 7817177
 */
public class Iate implements Veiculo{
    private String nome;
    private String capitao;

    public Iate(String nome) {
        this.nome = nome;
    }
    
   public void setCapitao (String nome) {
       this.capitao = nome;
   }
   
   public String getNome () {
       return this.nome;
   }

    @Override
    public String obterDescricaoVeiculo() {
        return "Nome " + this.getNome() + "\tCapitao" + this.capitao;
    }
}
