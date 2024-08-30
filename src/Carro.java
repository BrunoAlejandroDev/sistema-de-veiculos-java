public class Carro extends Veiculo implements Motorizado {

    // Atributos
    private boolean statusMotor;
    private boolean statusRadio;
//    private boolean arcondicionado;
//    private boolean vidrosEletricos;
    private String tipoCarro;
    private String tipoDirecao;

    public Carro(String marca, String motor, int ano, String cor,
                 String tipoCarro, String tipoDirecao)
    {
        super(marca, motor, ano, cor);
        this.tipoCarro = tipoCarro;
        this.tipoDirecao = tipoDirecao;
        this.statusMotor = false;
        this.statusRadio = false;
    }

    // Implementacao dos metodos da classe abstrata
    @Override
    public void acelerar()
    {
        if (statusMotor)
        {
            System.out.println("O carro está acelerando.");
        }
        else {
            System.out.println("O motor está desligado.");
        }
    }

    @Override
    public void frear()
    {
        if (statusMotor) {
            System.out.println("O carro está freando");
        } else {
            System.out.println("O motor está desligado.");
        }
    }

    @Override
    public String toString()
    {
        return
                "\nMarca = " + getMarca() +
                "\nModelo = " + getModelo() +
                "\nAno = " + getAno() +
                "\nCor = " + getCor() +
                "\nTipo de carro = " + getTipoCarro() +
                "\nTipo de direção = " + getTipoDirecao() +
                "\nMotor ligado? " + statusMotor;
    }

    // Implementacao dos metodos da interface
    public void ligarMotor()
    {
        if (statusMotor)
        {
            System.out.println("O motor já está ligado.");
        }
        else
        {
            statusMotor = true;
            System.out.println("Motor ligado com sucesso.");
        }
    }

    public void desligarMotor()
    {
        if (statusMotor)
        {
            statusMotor = false;
            System.out.println("Motor desligado com sucesso.");
        }
        else
        {
            System.out.println("O motor já está desligado.");
        }
    }

    // Getters
    public String getTipoCarro() {
        return tipoCarro;
    }

    public String getTipoDirecao() {
        return tipoDirecao;
    }
}