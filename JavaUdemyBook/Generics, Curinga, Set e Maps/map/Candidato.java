package map;

public class Candidato {
	
	private String nome;
	
	private Integer numVotos;

	public Candidato(String nome, Integer numVotos) {
		this.nome = nome;
		this.numVotos = numVotos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumVotos() {
		return numVotos;
	}

	public void setNumVotos(Integer numVotos) {
		this.numVotos = numVotos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Candidato other = (Candidato) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", numVotos=" + numVotos + "]";
	}
	
	
	

}
