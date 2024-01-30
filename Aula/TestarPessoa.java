public class TestarPessoa {
    
    public static void imprimirInformacoes(Pessoa p) {
        System.out.println(p.toString());
    }

    public static void main(String[] args) {
    PessoaFisica pf = new PessoaFisica();
    pf.setNome("Marcos Willian");
    pf.setCpf("09392667337");

    PessoaJuridica pj = new PessoaJuridica();
    pj.setNome("IFCE ltda");
    pj.setCnpj("09392667337");

    imprimirInformacoes(pf);
    imprimirInformacoes(pj);
    }
}
