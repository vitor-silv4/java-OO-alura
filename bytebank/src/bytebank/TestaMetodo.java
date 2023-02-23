package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta();
		contaPaulo.saldo = 100;
		contaPaulo.deposita(50);
		//System.out.println(contaPaulo.saldo);
		
		//boolean conseguiu = contaPaulo.saca(20);
		//System.out.println(contaPaulo.saldo);
		//System.out.println(conseguiu);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(3000, contaPaulo)) {
			System.out.println("transferencia feita com sucesso!");
		} else {
			System.out.println("Faltou dinheiro");
		}
		
		contaPaulo.titular = "Paulo Silveira";
		System.out.println(contaPaulo.titular);
		
	}

}
