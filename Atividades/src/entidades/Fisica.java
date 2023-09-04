package entidades;

public final class Fisica extends Contribuinte {
	
	private String cpf;

	public Fisica(String nome, double renda, String cpf) {
		super(nome, renda);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public double cauculaRenda() {
		double porcentagem;
		double renda = this.renda;
		
		if(renda > 1903.99 && renda < 2826.65){
			porcentagem = renda * 0.075;			
		}else if(renda > 2826.66 && renda < 3751.05) {
			porcentagem = renda * 0.15;
		}else if(renda > 375106 && renda < 4664.68) {
			porcentagem = renda * 0.225;
		}else if(renda > 4664.68) {
			porcentagem = renda * 0.275;
		}else {
			porcentagem = 0;
		}
		return porcentagem;
	}

	@Override
	public String toString() {
		return "Fisica [cpf=" + cpf + ", nome=" + nome + ", renda=" + renda + " Imposto de renda=" + String.format("%.2f",cauculaRenda()) + "]\n";
	}
	
	
}
