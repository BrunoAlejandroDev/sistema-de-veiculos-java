public class Carro extends Veiculo implements Motorizado {

    // Atributos
    private boolean statusMotor;
    private String tipoCarro;
    private String tipoDirecao;

    public Carro(String marca, String modelo, int ano, String cor,
                 String tipoCarro, String tipoDirecao)
    {
        super(marca, modelo, ano, cor);
        this.tipoCarro = tipoCarro;
        this.tipoDirecao = tipoDirecao;
        this.statusMotor = false;
    }

    // Implementacao dos metodos da classe abstrata
    @Override
    public void acelerar()
    {
        if (statusMotor)
        {
            System.out.println("O " + getMarca() + " " + getModelo() + " está acelerando. VRUMMMMMM");
        }
        else
        {
            System.out.println("O motor do/a " + getMarca() + " " + getModelo() + " está desligado.");
        }
    }

    @Override
    public void frear()
    {
        if (statusMotor) {
            System.out.println("O " + getMarca() + " " + getModelo() + " está freando.");
        }
        else
        {
            System.out.println("O motor do/a " + getMarca() + " " + getModelo() + " está desligado.");
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
            System.out.println("O motor do " + getMarca() + " " + getModelo() + " já está ligado.");
        }
        else
        {
            statusMotor = true;
            System.out.println("Motor do " + getMarca() + " " + getModelo() + "ligado com sucesso.");
        }
    }

    public void desligarMotor()
    {
        if (statusMotor)
        {
            statusMotor = false;
            System.out.println("Motor do " + getMarca() + " " + getModelo() + "desligado com sucesso.");
        }
        else
        {
            System.out.println("O motor do " + getMarca() + " " + getModelo() + " já está desligado.");
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