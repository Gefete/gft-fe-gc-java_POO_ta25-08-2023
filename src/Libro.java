
public class Libro {
	private String autor;
    private String titulo;
    private String ubicacion;

    // Recibe el Autor a la clase que lo llama
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // envia el Autor a la clase que lo llama
    public String getAutor() {
        return autor;
    }

    // Recibe el Titulo a la clase que lo llama
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // envia el Titulo a la clase que lo llama
    public String getTitulo() {
        return titulo;
    }

    // Recibe el Ubicacion a la clase que lo llama
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // envia el Ubicacion a la clase que lo llama
    public String getUbicacion() {
        return ubicacion;
    }
}
