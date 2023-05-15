package Herança.Exercicio2;

/**
 * RodarAolicacao
 */
class RodarAolicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // upcast de classes

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // douncast de classes

        Gerente gerente_ = (Gerente) new Funcionario();

    }

}