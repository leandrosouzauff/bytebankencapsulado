
public class TestaValores {
public static void main(String[] args) {
	Conta conta = new Conta(200,100);
	System.out.println(conta.getAgencia()	);
	System.out.println(conta.getNumero());
	
	Conta conta2 = new Conta(300,500);
	Conta conta3 = new Conta(900,1000);
	System.out.println(Conta.getTotal());
}
}
