package ProvaFormativa;

public class Principal {
	public static void main(String[] args) {
		
		Fisica fisica = new Fisica ("Rafael", "123.456.789-12","123.456-78");
		System.out.println("Nome: " + fisica.getNome());
		System.out.println("Cpf: " + fisica.getCpf());
		System.out.println("Rg: "+ fisica.getRg());
		
	}

}