package sys.security.notfound;

public class EmpresaConfiguracaoNotFoundException  extends RuntimeException{

	public EmpresaConfiguracaoNotFoundException(Long id) {
		super("Empresa não encontrada. " + id);
	}
	

}
