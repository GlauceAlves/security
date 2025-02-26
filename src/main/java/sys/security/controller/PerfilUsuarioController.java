package sys.security.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sys.security.model.PerfilUsuario;
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
	PerfilUsuario onePerfilUsuario(@PathVariable Long id) {
		return repository.findById(id)
				.orElseThrow(()-> new PerfilUsuarioNotFoundException(id));
	}
	
}

 