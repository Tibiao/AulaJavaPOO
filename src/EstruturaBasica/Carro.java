package EstruturaBasica;

//Exercicio
class carro {

    String cor;
    String modelo;
    double capacidadeTanque;

    // Metodo construtor
    carro() {

    }

    carro(String cor, String modelo, double capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void getCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double setCapacidadeTanque() {
        return capacidadeTanque;
    }

    // Metodo do total para encher o tanque

    double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}