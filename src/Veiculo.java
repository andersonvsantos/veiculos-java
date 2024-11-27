/**
 * @author Estudante
 */

public class Veiculo {

    private String nome;

    private Boolean possuiMotor;

    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Boolean getPossuiMotor() {
        return possuiMotor;
    }

    public void setPossuiMotor(Boolean possuiMotor) {
        this.possuiMotor = possuiMotor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String ligarMotor() {
        return "Vrumm";
    }

    /**
     * @see mostrarNome
     * imprime direto no console o nome do veiculo.
     */

    public void mostrarNome() {
        System.out.println(this.nome);
    }

    /**
     * @see mostrarAno
     * imprime direto no console o ano do veiculo.
     */

    public void mostrarAno() {
        System.out.println(this.ano);
    }
}
