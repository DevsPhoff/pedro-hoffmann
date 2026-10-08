
public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private double preco;

    public Veiculo(String marca, String modelo, String placa, int ano, double preco) {
        setMarca(marca);
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPreco(preco);

        public class ExemploArrayList {

            public static void main(String[] args) {

                Veiculo v1 = new Veiculo("Volkswagen", "Polo", "ABC1234", 2026, 90000);

                Veiculo v2 = new Veiculo("Fiat", "Cronos", "OKL-4K56", 2009, 72000);

            }
        }

        Veiculo v1 = new Veiculo("Volkswagen", "Polo", "ABC1234", 2026, 90000);
        Veiculo v2 = new Veiculo("Fiat", "Cronnos", "OKL-4K56", 2009, 72000);


    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", preco="
                + preco + "]";
    }

}