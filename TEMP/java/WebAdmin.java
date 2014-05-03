public class WebAdmin {
	private String nome;
	private String password;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String aPassword) {
		this.password = aPassword;
	}

	public boolean autentifica() {
		throw new UnsupportedOperationException();
	}
}