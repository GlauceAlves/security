package sys.security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import sys.security.modelenum.TipoPerfilEnum;

@Entity
public class PerfilUsuario {
	private @Id @GeneratedValue Long id;
	private String descricaoPerfil;
	private TipoPerfilEnum tipoUsuario;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}
	public void setDescricaoPerfil(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
	}
	public TipoPerfilEnum getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoPerfilEnum tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public PerfilUsuario() {
		super();
	}
	public PerfilUsuario(Long id, String descricaoPerfil, TipoPerfilEnum tipoUsuario) {
		super();
		this.id = id;
		this.descricaoPerfil = descricaoPerfil;
		this.tipoUsuario = tipoUsuario;
	}
	
	
}
