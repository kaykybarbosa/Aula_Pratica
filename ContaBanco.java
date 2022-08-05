package Banco;

public class ContaBanco {
	//Atributos;
	public int numConta;
	private String nome ;
	protected String tipoDeConta;
	private double saldo;
	private boolean status;
	//Métodos Especiais;
	public ContaBanco() {
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nom) {
		this.nome = nom;
	}

	public String getTipoDeConta() {
		return tipoDeConta;
	}

	public void setTipoDeConta(String tipoDeConta) {
		this.tipoDeConta = tipoDeConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	//Métodos Personalizados;
	public void abrirConta(String tipo) {
		this.setTipoDeConta(tipo);
		this.setStatus(true);
		if(tipo == "CC") {
			this.setSaldo(50);
		}
		else if (tipo == "CP"){
			this.setSaldo(150);
		}
		System.out.println("Conta: "+ this.getNome() + " aberta! ");
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Não foi possivel fechar a conta " + this.getNome()  + " porque ainda tem dinheiro. ");
		}
		else if(this.getSaldo() < 0 ) {
			System.out.println("Não foi possivel fechar a conta " + this.getNome() + " porque estar em débito.");
		}
		else {
			System.out.println("Conta: " + this.getNome() + " fechada.");
			setStatus(false);
		}	
	}
	
	public void Depositar(double depositar) {	
		if(this.getStatus() == true) {
			if(depositar > 0) {
				this.setSaldo(this.getSaldo() + depositar);
				System.out.println("Depósito no valor de " + depositar + " realizado na Conta: " +this.getNome() + ".");
			}
		}
		
		else {
			System.out.println("Não foi possivel depositar na Conta: " + this.getNome() + ".");
		}
	}		
	
	public void Sacar(double sacar) {
		if(this.getStatus() == true) {
			if(this.getSaldo() >= sacar) {
				if(sacar > 0){
					this.setSaldo(this.getSaldo() - sacar);
					System.out.println("Saque no valor de " + sacar + " realizado por: " + this.getNome());
				}
			}		
			else {
				System.out.println( this.getNome() + " saldo insufuciente para saque!");
			}
		}	
		else {
			System.out.println("Não foi possivel realizar o saque porque a conta estar fechada.");
		}	
	}
		
	public void pagarMensal() {
		double v = 0;
		if(this.getTipoDeConta() == "CC") {
			v = 10;
		}
		else if(this.getTipoDeConta() == "CP") {
			v = 20;
		}
		if(this.getStatus() == true) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga com sucesso por " + this.getNome() + "."  );
			}
			else {
				System.out.println("Saldo Insuficiente para pagar a mensalidade da conta de " + this.getNome() + ".");
			}
		}
		else {
			System.out.println("impossivel realizar o pagamento da mensalidade pois a conta " + this.getNome() + " estar fechada! ");
		}
	}

	public void statusAtual() {
	System.out.println("=====================================");	
	System.out.println("NumConta: " + this.getNumConta());
	System.out.println("Nome: " + this.getNome());
	System.out.println("Tipo da Conta: " + this.getTipoDeConta());	
	System.out.println("Saldo: " + this.getSaldo());	
	System.out.println("Status: " + this.getStatus());	
		
		
	}
}


