package state.connection;

public class Parado extends EstadoConexion {

	@Override
	public void abrir(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion connection) {
		connection.setState(this);
	}

	@Override
	public void iniciar(Conexion connection) {
		connection.setState(new Preparado());
	}

	@Override
	public void enviar(Conexion connection, String mensaje) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion connection, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}
}
