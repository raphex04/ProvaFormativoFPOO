package ProvaFormativa;

public class ObjetoUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario(175, "Rafael", 12345678, "Restrito", "raphex7");

		usuario1.setId(175);
		usuario1.setNome("Rafael");
		usuario1.setPassword(12345678);
		usuario1.setPermissao("Restrito");
		usuario1.setUsuario("raphex7");

		System.out.println("----- USUARIO 1 -----");
		System.out.println(usuario1.getId());
		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
	}
}