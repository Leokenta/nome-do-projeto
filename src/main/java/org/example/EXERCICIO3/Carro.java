package org.example.EXERCICIO3;

public class Carro {
    String nomeDoCarro;
    String marcaDoCarro;

    int ano;

    public Carro(String nomeDoCarro, String marcaDoCarro, int ano) {
        this.nomeDoCarro = nomeDoCarro;
        this.marcaDoCarro = marcaDoCarro;
        this.ano = ano;
    }

    public String getNomeDoCarro() {
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

    public String getMarcaDoCarro() {
        return marcaDoCarro;
    }

    public void setMarcaDoCarro(String marcaDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirInformacoes(){
        System.out.println("O Veiculo "+nomeDoCarro+" é da Marca "+marcaDoCarro+" é do ano de "+ano);
    }

}
