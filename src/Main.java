public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setNome("Ford Ka");
        veiculo1.setPossuiMotor(true);
        veiculo1.setAno(2018);
        veiculo1.mostrarNome();
        veiculo1.mostrarAno();

        /**
         * Aqui é feito uma concatenação do nome do veiculo1 com uma string.
         */

        System.out.println(veiculo1.getNome() + " fez " + veiculo1.ligarMotor());
    }
}