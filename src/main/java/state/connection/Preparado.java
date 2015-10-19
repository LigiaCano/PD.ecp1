package state.connection;

public class Preparado extends EstadoConexion {

	@Override
	public void abrir(Conexion connection) {
		connection.setState(this);
	}

	@Override
	public void cerrar(Conexion connection) {
		connection.setState(new Cerrado());
	}

	@Override
	public void parar(Conexion connection) {
		connection.setState(new Parado());
	}

	@Override
	public void iniciar(Conexion connection) {
		connection.setState(this);
	}

	@Override
	public void enviar(Conexion connection, String mensaje) {
		connection.getLink().enviar(mensaje);
		connection.setState(new Esperando());
	}

	@Override
	public void recibir(Conexion connection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}
}
