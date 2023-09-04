package entidades;

public final class Juridica extends Contribuinte {

	private String cnpj;
			
	public Juridica(String nome, double renda, String cnpj) {
		super(nome, renda);
		this.cnpj = cnpj;
	}


	public String getCnpj() {
		return cnpj;
	}

	public double cauculaRenda() {
		return this.renda * 0.10;
	}


	@Override
	public String toString() {
		return "Juridica [cnpj=" + cnpj + ", nome=" + nome + ", renda=" + renda + "Imposto de renda=" + String.format("%.2f",cauculaRenda()) +"]\n";
	}
	
	
}