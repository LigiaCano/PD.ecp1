package state.connection;

public class Conexion {
	private EstadoConexion estado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		estado = new Cerrado();
	}

	public Link getLink() {
		return link;
	}

	protected void setState(EstadoConexion estado) {
		this.estado = estado;
	}

	public Estado getEstado() {
		return this.estado.getEstado();
	}

	public void abrir() {
		estado.abrir(this);
	}

	public void cerrar() {
		estado.cerrar(this);
	}

	public void parar() {
		estado.parar(this);
	}

	public void iniciar() {
		estado.iniciar(this);
	}

	public void enviar(String msg) {
		estado.enviar(this, msg);
	}

	public void recibir(int respuesta) {
		estado.recibir(this, respuesta);
	}

}
