package com.jobster.model;

public class UsuarioLogin {
	
	private String nome;
	private String email;
	private String senha;
	private String link;
	private String linkFoto;
	private String token;
	
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLinkFoto() {
		return linkFoto;
	}
	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
