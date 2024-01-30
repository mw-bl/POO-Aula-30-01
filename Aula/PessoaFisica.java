public class PessoaFisica extends Pessoa{
    private String cpf;

    public String toString() {

        return "NOME" + this.getNome() + "\nCPF" + this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
}
