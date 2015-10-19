package state.connection;

public class Esperando extends EstadoConexion {

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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion connection) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(Conexion connection, String mensaje) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion connection, int respuesta) {
		if (respuesta == 0) {
			connection.setState(new Preparado());
		} else {
			connection.setState(new Cerrado());
		}
	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}
}
