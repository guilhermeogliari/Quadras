package Control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

import Database.DBConnection;
import Model.Usuario;

public class UsuarioController extends AbstractFacade<Usuario> {

    private Connection conn;
    public Usuario usuario;
    public ArrayList<Usuario> usuarios = new ArrayList();

    int id = 0;
    String nome = "";
    long cpf = 0;
    int idade = 0;
    int pontos = 0;
    String senha = "";

    
    public Usuario autenticar(Usuario usuario) throws SQLException {

        conn = DBConnection.Conectar();

        String sql = "SELECT * FROM usuario WHERE nome=(?) and senha=(?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, usuario.getNome());
        st.setString(2, usuario.getSenha());
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            nome = rs.getString(2);
            cpf = rs.getLong(3);
            idade = rs.getInt(4);
            pontos = rs.getInt(5);
            senha = rs.getString(6);
            usuario = new Usuario(id, nome, cpf, idade, pontos, senha);
            return usuario;
        }
        return null;
    }
    
    
    @Override
    public void criar(Usuario usuario) throws SQLException {
        conn = DBConnection.Conectar();

        String sql = "INSERT INTO usuario(id,nome,cpf,idade,pontos)VALUES(s_usuario.NEXTVAL,(?),(?),(?),0)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, usuario.getNome());
        st.setLong(2, usuario.getCpf());
        st.setInt(3, usuario.getIdade());
        st.executeQuery();

    }

    @Override
    public void alterar(Usuario usuario) throws SQLException {
        conn = DBConnection.Conectar();

        String sql = "UPDATE usuario SET nome=(?),cpf=(?),idade=(?) WHERE id=(?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, usuario.getNome());
        st.setLong(2, usuario.getCpf());
        st.setInt(3, usuario.getIdade());
        st.setInt(4, usuario.getId());
        st.executeQuery();

    }

    @Override
    public void excluir(Usuario usuario) throws SQLException {
        conn = DBConnection.Conectar();

        String sql = "DELETE FROM usuario WHERE id=(?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, usuario.getId());
        st.executeQuery();

    }

    @Override
    public Usuario localizar(Usuario usuario) throws SQLException {

        conn = DBConnection.Conectar();

        String sql = "SELECT * FROM usuario WHERE id=(?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, usuario.getId());
        ResultSet rs = st.executeQuery();
        if (rs.next()) {
            nome = rs.getString(2);
            cpf = rs.getLong(3);
            idade = rs.getInt(4);
            pontos = rs.getInt(5);
            senha = rs.getString(6);
            usuario = new Usuario(id, nome, cpf, idade, pontos, senha);
            return usuario;
        }
        return null;
    }

    
    
    
    
    @Override
    public ArrayList<Usuario> consultar() throws SQLException {

        conn = DBConnection.Conectar();

        String sql = "SELECT * FROM USUARIO";
        PreparedStatement st = conn.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            id = rs.getInt(1);
            nome = rs.getString(2);
            cpf = rs.getLong(3);
            idade = rs.getInt(4);
            pontos = rs.getInt(5);
            senha = rs.getString(6);
            usuario = new Usuario(id, nome, cpf, idade, pontos, senha);
            usuarios.add(usuario);
        }
        return usuarios;
    }

}
