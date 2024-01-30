public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public String toString() {

        return "NOME" + this.getNome() + "\nCNPJ" + this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }
}
