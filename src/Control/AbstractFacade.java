package Control;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.Usuario;

public abstract class AbstractFacade<T> {
	
	public void criar(T t) throws SQLException {}
	
	public void alterar(T t) throws SQLException {}
	
	public void excluir(T t) throws SQLException {}
	
	public T localizar(T t) throws SQLException{
		return t;
	}
	
	public ArrayList<Usuario> consultar() throws SQLException {
		return null;
	}
	
}
