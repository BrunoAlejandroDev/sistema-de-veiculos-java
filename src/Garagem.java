import java.util.ArrayList;
import java.util.List;

public class Garagem {

    private List<Veiculo> veiculos;

    public Garagem()
    {
        veiculos = new ArrayList<>();
    }

    // Metodos
    public void cadastrarVeiculo(Veiculo veiculo)
    {
        veiculos.add(veiculo);
    }

    public void removerVeiculo(int indice)
    {
        mostrarListaDeVeiculos();
        if (indice >= 0 && indice < veiculos.size())
        {
            veiculos.remove(indice);
            System.out.println("Veículo excluído com sucesso.");
        }
        else
        {
            System.out.println("Índice inválido.");
        }
    }

    public boolean mostrarListaDeVeiculos()
    {
        if (veiculos.isEmpty())
        {
            return false;
        }
        else
        {
            for (int i = 0; i < veiculos.size(); i++)
            {
                Veiculo veiculo = veiculos.get(i);
                System.out.print("VEÍCULO " + i);
                System.out.println(veiculo.toString());
                System.out.println();
            }
            return true;
        }
    }

    // uso dos metodos da interface via downcasting
    public void ligarMotorVeiculo(int indice)
    {
        if (indice >= 0 && indice < veiculos.size())
        {
            Veiculo veiculo = veiculos.get(indice);
            if (veiculo instanceof Motorizado)
            {
                ((Motorizado) veiculo).ligarMotor(); // downcasting para acessar o metodo da interface via Veiculo
            }
            else
            {
                System.out.println("O veículo não é motorizado.");
            }
        }
        else {
            System.out.println("Indice inválido.");
        }
    }

    public void desligarMotorVeiculo(int indice)
    {
        if (indice >= 0 && indice < veiculos.size())
        {
            Veiculo veiculo = veiculos.get(indice);

            if (veiculo instanceof Motorizado)
            {
                ((Motorizado) veiculo).desligarMotor();
            }
            else
            {
                System.out.println("O veículo não é motorizado.");
            }
        }
        else
        {
            System.out.println("Índice inválido.");
        }
    }

    // acessar os métodos abstratos da classe veículo
    public void acelerarVeiculo(int indice)
    {
        if (indice >= 0 && indice < veiculos.size())
        {
            Veiculo veiculo = veiculos.get(indice);
            veiculo.acelerar();
        }
    }

    public void frearVeiculo(int indice)
    {
        if (indice >= 0 && indice < veiculos.size())
        {
            Veiculo veiculo = veiculos.get(indice);
            veiculo.frear();
        }
    }
}