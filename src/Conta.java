public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("Total de contas é :"+Conta.total);
    	if(agencia<=0) {
    		System.out.println("nao pode valor menor que zero");
    		return;
    	}
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Estou criando uma conta"+this.numero);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else
            return false;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
    	if(numero<=0) {
    		System.out.println("Não pode valor menor ou igual a zero");
    		return;
    	}
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
    	if(agencia<=0) {
    		System.out.println("Nao pode valor menor igual a zero");
    		return;
    	}
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    public Cliente getTitular() {
		return titular;
	}	
    public static int getTotal() {
    	return Conta.total;
    }
}
