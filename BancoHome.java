package Banco;


public class BancoHome {

	public static void main(String[] args) {

		ContaBanco c1 = new ContaBanco();
		c1.setNome("Kayky Bruno");
		c1.setNumConta(1234);
		c1.abrirConta("CC");
		
		
		ContaBanco c2 = new ContaBanco ();
		c2.setNome("Kamyle Andrea");
		c2.setNumConta(4567);
		c2.abrirConta("CP");	

		
		c1.Depositar(150);
		c2.Depositar(250);
		
		c1.pagarMensal();
		c2.pagarMensal();
		
		c1.Sacar(190);
		c2.Sacar(380);
		
		c1.fecharConta();
		c2.fecharConta();
		
		c1.statusAtual();
		c2.statusAtual();

	}
}
