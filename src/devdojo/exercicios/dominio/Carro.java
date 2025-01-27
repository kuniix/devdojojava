package devdojo.exercicios.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public void imprimeCarro() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (this.ano <= 1899){
            System.out.println("Ano incorreto");
        }else {
            this.ano = ano;
        }
    }
}
