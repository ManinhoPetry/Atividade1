package aplicacao;
import java.util.List;
import entidades.Contribuinte;
import entidades.Juridica;
import entidades.Fisica;
import java.util.ArrayList;

public class programa {

	public static void main(String[] args) {

		List<Contribuinte> pessoas = new ArrayList<Contribuinte>();
		pessoas.add(new Juridica("Emanuel", 4069.99, "12345678901234"));
		pessoas.add(new Juridica("jair", 16569.99, "15755678901234"));
		pessoas.add(new Fisica ("santolin", 16069.99, "45678901234"));
		pessoas.add(new Fisica("jacare", 8069.99, "15678901234"));
		pessoas.add(new Juridica("atlas", 469.99, "12345675801234"));
		pessoas.add(new Juridica("minuel", 94069.99, "12367778901234"));
		
		
		System.out.println(pessoas);
		
		
	}
}
