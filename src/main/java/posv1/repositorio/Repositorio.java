package posv1.repositorio;

public interface Repositorio<T> {
    void guardar(T entidad) throws Exception;

    void actualizar(T entidad) throws Exception;

    void eliminar(int id) throws Exception;

    T buscarPorId(int id) throws Exception;
}
