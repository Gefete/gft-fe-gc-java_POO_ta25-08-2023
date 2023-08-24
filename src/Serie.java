
public class Serie {
	
	private final int DEF_TEMPORADAS = 3;
    private final boolean DEF_ENTREGADO = false;
    
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//Constructor por defecto
	public Serie() {
		this.titulo = "";
		this.numTemporadas = DEF_TEMPORADAS;
		this.entregado = DEF_ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	//Constructor solo con titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = DEF_TEMPORADAS;
		this.entregado = DEF_ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	//Constructor con todo excepto entregado
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = DEF_ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	//getters
	public String getTitulo() {
		return titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}
	
	
	
	
	
	
    
}
