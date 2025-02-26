package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.EmpresaConfiguracao;
import sys.security.model.PerfilUsuario;
import sys.security.notfound.EmpresaConfiguracaoNotFoundException;
import sys.security.notfound.PerfilUsuarioNotFoundException;
import sys.security.repository.PerfilUsuarioRepository;

@RestController
public class PerfilUsuarioController {
	private final PerfilUsuarioRepository repository;

	public PerfilUsuarioController(PerfilUsuarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	@GetMapping("/perfilusuario")	
	List<PerfilUsuario> all(){
		return repository.findAll();
	}
	
	@PutMapping("/perfilusuario")
	PerfilUsuario newPerfilUusuario(@RequestBody PerfilUsuario newPerfilUusuario) {
		return repository.save(newPerfilUusuario);
	}
	
	  @GetMapping("/perfilusuario/{id}")
	  PerfilUsuario one(@PathVariable Long id) {
	    
	    return repository.findById(id)
	      .orElseThrow(() -> new PerfilUsuarioNotFoundException(id));
	  }	

	@PutMapping("/perfilusuario/{id}")
	PerfilUsuario replacePerfilUsuario(@RequestBody PerfilUsuario newPerfilUsuario, @PathVariable Long id) {
	    return repository.findById(id)
	      .map(PerfilUsuario -> {
	    	  PerfilUsuario.setDescricaoPerfil(newPerfilUsuario.getDescricaoPerfil());
	    	  PerfilUsuario.setTipoUsuario(newPerfilUsuario.getTipoUsuario());
	        return repository.save(PerfilUsuario);
	      })
	      .orElseGet(() -> {
	        return repository.save(newPerfilUsuario);
	      });
	  }

	@DeleteMapping("/perfilusuario/{id}")
	void deleteEmpresa(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	
}

 