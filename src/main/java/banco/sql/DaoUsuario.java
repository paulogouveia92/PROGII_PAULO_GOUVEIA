/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paulo Gouveia
 */
public class DaoUsuario {

    Conexao con = new Conexao();
    Connection conexao = con.criarConexao();
   

    public int inserirUsuario(Usuario usuario) {
        String sqlInserir = "INSERT "
                + "INTO "
                + "tb_usuario (nome, sobrenome) "
                + "VALUES(?, ?)";
        try {

            PreparedStatement preparacaoInsert = conexao.prepareStatement(sqlInserir);
            preparacaoInsert.setString(1, usuario.getNome());
            preparacaoInsert.setString(2, usuario.getSobrenome());
            return preparacaoInsert.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();

            return -1;

        }
    }

    public List<Usuario> listarUsuario() {
        
        String sqlListar = "select* "
                + "from tb_usuario";
        List<Usuario> usuarioLista = new ArrayList<Usuario>();
        try {

            PreparedStatement preparacaoSelect = conexao.prepareStatement(sqlListar);
            ResultSet resultadoListar = preparacaoSelect.executeQuery();

            while (resultadoListar.next()) {
                Usuario usu = new Usuario();
                usu.setIdUsuario(resultadoListar.getInt("id_usuario"));
                usu.setNome(resultadoListar.getString("nome"));
                usu.setSobrenome(resultadoListar.getString("sobrenome"));
                usuarioLista.add(usu);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }
        return usuarioLista;

    }
    
    public void atualizarUsuario(Usuario usuario){
     String sqlAtualizar = "update  tb_usuario "
             + "set nome = ?,sobrenome = ?"
             + "where id_usuario = ?";
        try {
            PreparedStatement preparacaoUpdate = conexao.prepareStatement(sqlAtualizar);
            preparacaoUpdate.setString(1, usuario.getNome());
            preparacaoUpdate.setString(2, usuario.getSobrenome());
            preparacaoUpdate.setInt(3, usuario.getIdUsuario());
            preparacaoUpdate.execute();
        } catch (SQLException ex) {
                     Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);

        }
     
    }
    
    public void excluirUsuario(Usuario usuario){
      String sqlExcluir = "delete from tb_usuario"
                    + " where id_usuario = ?";
            
        try {
            
            PreparedStatement preparacaoDelete = conexao.prepareStatement(sqlExcluir);
            preparacaoDelete.setInt(1,usuario.getIdUsuario());
            preparacaoDelete.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}