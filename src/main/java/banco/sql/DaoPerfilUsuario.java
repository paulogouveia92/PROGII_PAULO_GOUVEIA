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
public class DaoPerfilUsuario {

    Conexao con = new Conexao();
    Connection conexao = con.criarConexao();

    public int salvarPerfil(PerfilUsuario perfil) {

        String sqlInserir = "insert into"
                + " tb_perfil (nome_perfil,descricao)"
                + " values(?,?)";
        try {

            PreparedStatement preparacaoInsert = conexao.prepareStatement(sqlInserir);
            preparacaoInsert.setString(1, perfil.getNomePerfil());
            preparacaoInsert.setString(2, perfil.getDescricaoPerfil());
            return preparacaoInsert.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DaoPerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return -1;

    }

    public List<PerfilUsuario> listarPerfil() {
        String sqlListar = "select* "
                + "from tb_perfil";
        List<PerfilUsuario> listaDePerfil = new ArrayList<PerfilUsuario>();
        try {

            PreparedStatement preparacaoSelect = conexao.prepareStatement(sqlListar);
            ResultSet resultadoLista = preparacaoSelect.executeQuery();

            while (resultadoLista.next()) {
                PerfilUsuario perfil = new PerfilUsuario();
                perfil.setCodigoPerfil(resultadoLista.getInt("codigo_perfil"));
                perfil.setNomePerfil(resultadoLista.getString("nome_perfil"));
                perfil.setDescricaoPerfil(resultadoLista.getString("descricao"));
                perfil.setChaveEstrangeiraUsu(resultadoLista.getInt("id_usuario"));
                listaDePerfil.add(perfil);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoPerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);

            return null;

        }
        return listaDePerfil;
    }

    public void atualizarPerfil(PerfilUsuario perfil) {
        String sqlUpdate = "update tb_perfil "
                + "set nome_perfil = ?, descricao = ? "
                + "where codigo_perfil = ? ";
        try {

            PreparedStatement preparacaoUpdate = conexao.prepareStatement(sqlUpdate);
            preparacaoUpdate.setString(1, perfil.getNomePerfil());
            preparacaoUpdate.setString(2,perfil.getDescricaoPerfil());
            preparacaoUpdate.setInt(3, perfil.getCodigoPerfil());
            preparacaoUpdate.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoPerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirPerfil(PerfilUsuario perfil){
       String sqlDelete = "delete from tb_perfil"
                    + " where codigo_perfil = ?";
 
        try {
          PreparedStatement preparacaoDelete = conexao.prepareStatement(sqlDelete);
          preparacaoDelete.setInt(1,perfil.getCodigoPerfil());
          preparacaoDelete.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoPerfilUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
