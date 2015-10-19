package state.connection;

public abstract class EstadoConexion {

	public abstract void parar(Conexion connection);

	public abstract void iniciar(Conexion connection);

	public abstract void abrir(Conexion connection);

	public abstract void recibir(Conexion connection, int respuesta);

	public abstract void cerrar(Conexion connection);

	public abstract void enviar(Conexion connection, String mensaje);

	public abstract Estado getEstado();
}
