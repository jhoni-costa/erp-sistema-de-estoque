package br.com.jhonicosta.erp.dto;

import java.io.Serializable;

import br.com.jhonicosta.erp.domain.Usuario;

public class UsuarioDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String email;
	private String cpf;
//	Mudar para TipoUsuario
	private String tipo;
	private String senha;

	public UsuarioDTO() {
	}

	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
		this.cpf = usuario.getCpf();
		this.tipo = usuario.getTipo();
		this.senha = usuario.getSenha();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
