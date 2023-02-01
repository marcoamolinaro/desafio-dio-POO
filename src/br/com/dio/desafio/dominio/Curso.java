package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
	

	private Integer cargaHoraria;

	public Curso() {}

	public Curso(String titulo, String descricao, Integer cargaHoraria) {
		setTitulo(titulo);
		setDescricao(descricao);
		this.cargaHoraria = cargaHoraria;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", "
				+ "cargaHoraria=" + this.getCargaHoraria() + ", Total XP=" + this.calcularXp() +"]";
	}

	@Override
	protected Double calcularXp() {
		return getXpPadrao() * this.getCargaHoraria();
	}
}
