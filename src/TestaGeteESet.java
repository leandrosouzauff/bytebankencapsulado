public class TestaGeteESet {
    public static void main(String[] args) {
        Conta conta = new Conta(100,200);
        conta.setNumero(1336);
        System.out.println(conta.getNumero());
        Cliente leandro = new Cliente();
        leandro.setNome("Leandro de Souza Santos");
        conta.setTitular(leandro);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Analista de TI");
        // agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Analista de TI");
        System.out.println(titularDaConta);
        System.out.println(leandro);
        System.out.println(conta.getTitular());
    }
}