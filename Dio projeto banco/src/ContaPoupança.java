
public class ContaPoupanša extends Conta1 {

	public ContaPoupanša(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanša ===");
		super.imprimirinfoscomuns();
	}
}	