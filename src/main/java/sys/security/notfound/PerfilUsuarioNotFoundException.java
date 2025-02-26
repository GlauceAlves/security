package sys.security.notfound;

public class PerfilUsuarioNotFoundException extends Exception {

	public PerfilUsuarioNotFoundException(Long id) {
		super("Perfil do usuário não encontrado." + id );
	}
	
	

}
