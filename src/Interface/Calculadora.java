package Interface;

class Calculadora implements OperacaoMatematica {

    @Override
    public void somar(double numero1, double numero2) {
        System.out.println("Soma: " + numero1 + numero2);
    }

    @Override
    public void subtrair(double numero1, double numero2) {
        System.out.println("Subtracao: " + (numero1 - numero2));
    }

    @Override
    public void multiplicar(double numero1, double numero2) {
        System.out.println("multiplicacao: " + numero1 * numero2);
    }

    // @Override
    public void dividir(double numero1, double numero2) {
        System.out.println("multiplicacao: " + numero1 / numero2);
    }

}
