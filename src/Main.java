import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Garagem garagem = new Garagem();
        Scanner input = new Scanner(System.in);
        int opcao;

        do
        {
            // Exibe o menu
            System.out.println("Menu:");
            System.out.println("1. Cadastrar um novo veículo");
            System.out.println("2. Excluir um veículo");
            System.out.println("3. Mostrar todos os veículos");
            System.out.println("4. Ligar o motor de um veículo");
            System.out.println("5. Desligar o motor de um veículo");
            //System.out.println("1. Mostrar detalhes de um veículo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao)
            {
                // adicionar veiculo
                case 1:
                    System.out.print("Digite a marca do veiculo: ");
                    String marca = input.nextLine();
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = input.nextLine();
                    System.out.print("Digite o ano do veículo: ");
                    int ano = input.nextInt();
                    System.out.print("Digite a cor do veículo: ");
                    String cor = input.next();

                    // atributos especificos da classe Carro
                    System.out.print("Digite o tipo do veículo: ");
                    String tipoVeiculo = input.next();
                    System.out.print("Digite o tipo de direção: ");
                    String tipoDirecao = input.next();
                    input.nextLine();

                    // instanciando um novo Carro e adicionando na garagem
                    garagem.cadastrarVeiculo(new Carro(marca, modelo, ano, cor, tipoVeiculo, tipoDirecao));
                    break;

                // excluir veículo
                case 2:
                    System.out.println("====== Lista de carros cadastrados ====== ");
                    boolean listaCarros = garagem.mostrarListaDeVeiculos();

                    if (!listaCarros)
                    {
                        System.out.println("Não há carros na garagem.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.print("Digite o índice do veículo que deseja excluir: ");
                        int indiceExcluir = input.nextInt();
                        input.nextLine();
                        garagem.removerVeiculo(indiceExcluir);
                    }
                    break;

                // listar veiculos
                case 3:
                    System.out.println("====== Lista de carros cadastrados ====== ");
                    boolean listarCarros = garagem.mostrarListaDeVeiculos();
                    if (!listarCarros)
                    {
                        System.out.println("Não há carros na garagem.");
                        System.out.println();
                    }
                    break;

                // ligar o motor de um veiculo
                case 4:
                    System.out.println("====== Lista de carros cadastrados ====== ");
                    boolean listarVeiculos = garagem.mostrarListaDeVeiculos();
                    if (!listarVeiculos)
                    {
                        System.out.println("Não há carros na garagem.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.print("Digite o índice do veículo que deseja ter o motor ligado: ");
                        int indiceMotorLigado = input.nextInt();
                        input.nextLine();
                        garagem.ligarMotorVeiculo(indiceMotorLigado);
                    }
                    break;

                case 5:
                    System.out.println("====== Lista de carros cadastrados ====== ");
                    listarVeiculos = garagem.mostrarListaDeVeiculos();
                    if (!listarVeiculos)
                    {
                        System.out.println("Não há carros na garagem.");
                        System.out.println();
                    }
                    else
                    {
                        System.out.print("Digite o índice do veículo que deseja ter o motor desligado: ");
                        int indiceMotorDesligado = input.nextInt();
                        input.nextLine();
                        garagem.desligarMotorVeiculo(indiceMotorDesligado);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    input.close();
                    break;
            }
        }
        while (opcao != 0);
        input.close();
    }
}