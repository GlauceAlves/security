package sys.security.notfound;

public class PerfilUsuarioNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public PerfilUsuarioNotFoundException(Long id) {
		super("Perfil do usuário não encontrado." + id );
	}
	
	

}
