
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		//a conta está inconsistente pois nasce o objeto com 0
		//conta.setAgencia(-50);
		//conta.setAgencia(-330);
		
		
		//System.out.println(conta.getNumero());
		Conta conta2 = new Conta(1337, 16549);
		Conta conta3 = new Conta(1337, 14660);
		
		System.out.println(Conta.getTotal());
	}

}
