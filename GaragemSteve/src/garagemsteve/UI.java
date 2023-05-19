package garagemsteve;
import java.util.Scanner;

/**
 *
 * @author 7817177
 */
public class UI {
    private Galpao galpao;

    public UI(Galpao galpao) {
        this.galpao = galpao;
    }
    
    public String lerValor(String rotulo) {
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    
    public void menu()  {
        char opcao = ' ';
        while (opcao != 's'){
            System.out.println("Ola Sr. Harris. Digite a opcao desejada por favor: ");
            System.out.println("1- Inserir Novo veiculo no galpao ");
            System.out.println("2- Ver todos os veiculos do seu galpao");
            System.out.println("aperte qualquer outra tecla para continuar: ");
            opcao = this.lerValor("\nSelecione uma opcao").toUpperCase().charAt(0);
            switch (opcao) {
                case '1': InserirNovoVeiculo();break;
                case '2': VerVeiculos();break;
                default : opcao = 's'; break;
            }
        }
    }
    
    public void InserirNovoVeiculo(){
        char opcao;
            System.out.println("qual o tipo de veiculo que o sr deseja guardar? ");
            System.out.println("1- Veiculo Terrestre");
            System.out.println("2- Veiculo Aquatico");
            System.out.println("3- Veiculo Aereo");
            System.out.println("aperte qualquer outra tecla para retornar ao menu principal: ");
            opcao = this.lerValor("\nSelecione uma opcao").toUpperCase().charAt(0);
            switch (opcao) {
                case '1': InserirNovoVeiculoT();break;
                case '2': InserirNovoVeiculoAQ();break;
                case '3': InserirNovoVeiculoAE();break;
                default : break;
            }
    }
    
    public void InserirNovoVeiculoT(){
        char opcao;
            System.out.println("Carro ou caminhao? ");
            System.out.println("1- Carro");
            System.out.println("2- caminhao");
            System.out.println("aperte qualquer outra tecla para retornar ao menu principal: ");
            opcao = this.lerValor("\nSelecione uma opcao").toUpperCase().charAt(0);
            switch (opcao) {
                case '1': InserirCarro();break;
                case '2': InserirCaminhao();break;
                default : break;
            }
    }
    
    public void InserirCarro () {
        String modelo, placa, motorista; 
        double potencia;
        
        modelo = this.lerValor("Modelo");
        placa = this.lerValor("Placa");
        motorista = this.lerValor("Motorista");
        potencia = Double.parseDouble(this.lerValor("Potencia"));
        
        Carro NovoCarro = new Carro (potencia, modelo, placa);
        NovoCarro.setMotorista(motorista);
        
        if (galpao.adicionarVeiculo(NovoCarro)){
            System.out.println("Carro guardado com sucesso!");
        }
        else {
            System.out.println("Galpão Lotado!");
        }
    }
    
    public void InserirCaminhao () {
        String modelo, placa, motorista; 
        double capacidade;
        
        modelo = this.lerValor("Modelo");
        placa = this.lerValor("Placa");
        motorista = this.lerValor("Motorista");
        capacidade = Double.parseDouble(this.lerValor("Potencia"));
        
        Caminhao NovoCaminhao = new Caminhao (capacidade, modelo, placa);
        NovoCaminhao.setMotorista(motorista);
        
        if (galpao.adicionarVeiculo(NovoCaminhao)){
            System.out.println("Caminhao guardado com sucesso!");
        }
        else {
            System.out.println("Galpao Lotado!");
        }
    }
    
    public void InserirNovoVeiculoAQ () {
        String nome, capitao;
        
        nome = this.lerValor("Nome");
        capitao = this.lerValor("Capitao");
        
        Iate NovoIate = new Iate (nome);
        NovoIate.setCapitao(capitao);
        
        if (galpao.adicionarVeiculo(NovoIate)){
            System.out.println("Iate guardado com sucesso!");
        }
        else {
            System.out.println("Galpao Lotado!");
        }
    }
    
    public void InserirNovoVeiculoAE () {
        String modelo, sigla, piloto;
        
        modelo = this.lerValor("Modelo");
        sigla = this.lerValor("Sigla");
        piloto = this.lerValor("Piloto");
        
        Helicoptero NovoHelicoptero = new Helicoptero (modelo, sigla);
        NovoHelicoptero.setPiloto(piloto);
        
        if (galpao.adicionarVeiculo(NovoHelicoptero)){
            System.out.println("Iate guardado com sucesso!");
        }
        else {
            System.out.println("Galpao Lotado!");
        }
    }
    
    public void VerVeiculos() {
        System.out.println(this.galpao.ImprimirRelacaoVeiculos());
    }
}
