package EstruturaBasica;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Audi A3");
        carro1.setCapacidadeTanque(54);

        System.out.println("Cor do carro: " + carro1.getCor());
        System.out.println("Modelo do carro: " + carro1.getModelo());
        System.out.println("Capacidade do tanque do carro: " + carro1.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque do carro: " + carro1.totalValorTanque(5.25));

        Carro carro2 = new Carro("Prata", "Gol", 48);

        System.out.println("Cor do carro: " + carro2.getCor());
        System.out.println("Modelo do carro: " + carro2.getModelo());
        System.out.println("Capacidade do tanque do carro: " + carro2.getCapacidadeTanque());
        System.out.println("Valor para encher o tanque do carro: " + carro2.totalValorTanque(5.25));

    }
}
