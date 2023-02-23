package bytebank;

public class TesteReferancias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo da primeira conta " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		
		System.out.println("saldo da segunda conta é:  " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
	}

}
