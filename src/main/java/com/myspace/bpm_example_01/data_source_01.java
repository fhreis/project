package com.myspace.bpm_example_01;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("source one")
public class data_source_01 implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer codigo;
	@org.kie.api.definition.type.Label(value = "nome")
	private java.lang.String nome;
	@org.kie.api.definition.type.Label(value = "email")
	private java.lang.String email;
	@org.kie.api.definition.type.Label(value = "cpf")
	private java.lang.String cpf;

	public data_source_01() {
	}

	public java.lang.Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(java.lang.Integer codigo) {
		this.codigo = codigo;
	}

	public java.lang.String getNome() {
		return this.nome;
	}

	public void setNome(java.lang.String nome) {
		this.nome = nome;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getCpf() {
		return this.cpf;
	}

	public void setCpf(java.lang.String cpf) {
		this.cpf = cpf;
	}

	public data_source_01(java.lang.Integer codigo, java.lang.String nome,
			java.lang.String email, java.lang.String cpf) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

}