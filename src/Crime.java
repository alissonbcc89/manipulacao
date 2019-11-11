import java.time.LocalDate;

public class Crime {
	// usar manipulação para data pois recebe como string
	private LocalDate data;
	private String nome;
	private boolean sexo;
	private String objetoUtilizado;
	private String municipio;
	private int idade;
	private String natureza;
	private int totalVitimas;
	public Crime(LocalDate data, String nome, boolean sexo, String objetoUtilizado, String municipio, int idade,
			String natureza, int totalVitimas) {
		super();
		this.data = data;
		this.nome = nome;
		this.sexo = sexo;
		this.objetoUtilizado = objetoUtilizado;
		this.municipio = municipio;
		this.idade = idade;
		this.natureza = natureza;
		this.totalVitimas = totalVitimas;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	public String getObjetoUtilizado() {
		return objetoUtilizado;
	}
	public void setObjetoUtilizado(String objetoUtilizado) {
		this.objetoUtilizado = objetoUtilizado;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	public int getTotalVitimas() {
		return totalVitimas;
	}
	public void setTotalVitimas(int totalVitimas) {
		this.totalVitimas = totalVitimas;
	}
	@Override
	public String toString() {
		return "Assasinatos [data=" + data + ", nome=" + nome + ", sexo=" + sexo + ", objetoUtilizado="
				+ objetoUtilizado + ", municipio=" + municipio + ", idade=" + idade + ", natureza=" + natureza
				+ ", totalVitimas=" + totalVitimas + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + idade;
		result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
		result = prime * result + ((natureza == null) ? 0 : natureza.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((objetoUtilizado == null) ? 0 : objetoUtilizado.hashCode());
		result = prime * result + (sexo ? 1231 : 1237);
		result = prime * result + totalVitimas;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Crime other = (Crime) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idade != other.idade)
			return false;
		if (municipio == null) {
			if (other.municipio != null)
				return false;
		} else if (!municipio.equals(other.municipio))
			return false;
		if (natureza == null) {
			if (other.natureza != null)
				return false;
		} else if (!natureza.equals(other.natureza))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (objetoUtilizado == null) {
			if (other.objetoUtilizado != null)
				return false;
		} else if (!objetoUtilizado.equals(other.objetoUtilizado))
			return false;
		if (sexo != other.sexo)
			return false;
		if (totalVitimas != other.totalVitimas)
			return false;
		return true;
	}
	
	
	
	
	
	


}
