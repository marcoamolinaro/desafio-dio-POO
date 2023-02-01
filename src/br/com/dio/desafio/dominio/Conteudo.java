package br.com.dio.desafio.dominio;

public abstract class Conteudo {
	
	protected static final Double XP_PADRAO = 10.0;
	private String titulo;
	private String descricao;
	
	protected abstract Double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static Double getXpPadrao() {
		return XP_PADRAO;
	}
}
