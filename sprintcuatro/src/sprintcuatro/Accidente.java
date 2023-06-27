package sprintcuatro;

public class Accidente {
/**
 * @param
 * int IdentificadorAccidente;
	*String Dia;
	*String Hora;
	*String Lugar;
	*String Origen;
	*String Consecuencia;
 */
	int IdentificadorAccidente;
	private String Dia;
	private String Hora;
	private String Lugar;
	private String Origen;
	private String Consecuencia;
	
	/**
	 * Constructor vacio
	 */
	
	public Accidente() {
		
	}
	
	/**
	 * 
	 * @param IdentificadorAccidente
	 * @param Dia
	 * @param Hora
	 * @param Lugar
	 * @param Origen
	 * @param Consecuencia
	 */
	public Accidente(int IdentificadorAccidente,String Dia,String Hora,String Lugar,String Origen,String Consecuencia) {
		
		this.IdentificadorAccidente = IdentificadorAccidente;
		this.Dia = Dia;
		this.Hora = Hora;
		this.Lugar = Lugar;
		this.Origen = Origen;
		this.Consecuencia = Consecuencia;
	}

	public int getIdentificadorAccidente() {
		return IdentificadorAccidente;
	}

	public void setIdentificadorAccidente(int identificadorAccidente) {
		IdentificadorAccidente = identificadorAccidente;
	}

	public String getDia() {
		return Dia;
	}

	public void setDia(String dia) {
		Dia = dia;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public String getLugar() {
		return Lugar;
	}

	public void setLugar(String lugar) {
		Lugar = lugar;
	}

	public String getOrigen() {
		return Origen;
	}

	public void setOrigen(String origen) {
		Origen = origen;
	}

	public String getConsecuencia() {
		return Consecuencia;
	}

	public void setConsecuencia(String consecuencia) {
		Consecuencia = consecuencia;
	}
	
	
}
