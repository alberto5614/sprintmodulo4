package sprintcuatro;


	public class VisitaenTerreno {


		private int Idterreno;
		private String Dia;
		private String Hora;
		private String Lugar;
		private String Comentarios;

		


			/**
			 * Constructor vacio
			 */
		public VisitaenTerreno() {	
			
			}
		
		/**
		 * 
		 * @param Idterreno
		 * @param Dia
		 * @param Hora
		 * @param Lugar
		 * @param Comentarios
		 */
		public VisitaenTerreno(int Idterreno, String Dia, String Hora, String Lugar,String Comentarios) {
			this.Idterreno = Idterreno;
			this.Dia = Dia;
			this.Hora = Hora;
			this.Lugar = Lugar;
			this.Comentarios = Comentarios;
		}

		public int getIdterreno() {
			return Idterreno;
		}

		public void setIdterreno(int idterreno) {
			Idterreno = idterreno;
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

		public String getComentarios() {
			return Comentarios;
		}

		public void setComentarios(String comentarios) {
			Comentarios = comentarios;
		}
		
		
			
		
}
