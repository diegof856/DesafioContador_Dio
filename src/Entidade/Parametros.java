package Entidade;

public class Parametros {
	// objeto para colocar os parametros
	private Integer primerioParametro;
	private Integer segundoParametro;

	public Parametros(Integer primerioParametro, Integer segundoParametro) {

		this.primerioParametro = primerioParametro;
		this.segundoParametro = segundoParametro;
	}

	public Integer getPrimerioParametro() {
		return primerioParametro;
	}

	public Integer getSegundoParametro() {
		return segundoParametro;
	}

}
