public abstract class Veiculo {

    // Atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    // Construtor
    public Veiculo(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Metodos abstratos
    public abstract void acelerar();
    public abstract void frear();

    @Override
    public String toString() {
        return "Veiculo: " +
                "\nMarca = '" + marca +
                "\nmodelo = '" + modelo +
                "\nAno = " + ano +
                "\nCor = '" + cor;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }
}
