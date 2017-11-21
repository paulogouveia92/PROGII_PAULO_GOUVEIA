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
public class DaoEndereco {

    Conexao con = new Conexao();
    Connection conexao = con.criarConexao();

    public int inserirEndereco(Endereco endereco) {
        String sqlInserir = "insert into "
                + "tb_endereco (logradouro, complemento, bairro, numero, CEP) "
                + "values (?,?,?,?,?)";

        try {

            PreparedStatement preparacaoInsert = conexao.prepareStatement(sqlInserir);
            preparacaoInsert.setString(1, endereco.getLogradouro());
            preparacaoInsert.setString(2, endereco.getComplemento());
            preparacaoInsert.setString(3, endereco.getBairro());
            preparacaoInsert.setString(4, endereco.getNumero());
            preparacaoInsert.setString(5, endereco.getCEP());
            return preparacaoInsert.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

    }

    List<Endereco> listarEndereco() {
        String sqlListar = "select* "
                + "from tb_endereco";

        List<Endereco> listaDeEndereco = new ArrayList<Endereco>();
        try {
            PreparedStatement preparacaoSelect = conexao.prepareStatement(sqlListar);
            ResultSet resultadoEndereco = preparacaoSelect.executeQuery();

            while (resultadoEndereco.next()) {
                Endereco endereco = new Endereco();
                endereco.setLogradouro(resultadoEndereco.getString("logradouro"));
                endereco.setComplemento(resultadoEndereco.getString("complemento"));
                endereco.setBairro(resultadoEndereco.getString("bairro"));
                endereco.setNumero(resultadoEndereco.getString("numero"));
                endereco.setCEP(resultadoEndereco.getString("CEP"));
                endereco.setCodigoEndereco(resultadoEndereco.getInt("codigo_endereco"));

                endereco.setChaveEstrangeiraUsu(resultadoEndereco.getInt("id_usuario"));
                listaDeEndereco.add(endereco);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return listaDeEndereco;
    }

    public void atualizarEndereco(Endereco endereco) {
        String sqlAtualizar = "update tb_endereco"
                + " set logradouro = ?, complemento = ?, bairro = ?, numero = ?, CEP = ? "
                + "where codigo_endereco = ?";
        try {
            PreparedStatement preparacaoUpdate = conexao.prepareStatement(sqlAtualizar);
            preparacaoUpdate.setString(1, endereco.getLogradouro());
            preparacaoUpdate.setString(2, endereco.getComplemento());
            preparacaoUpdate.setString(3, endereco.getBairro());
            preparacaoUpdate.setString(4, endereco.getNumero());
            preparacaoUpdate.setString(5, endereco.getCEP());
            preparacaoUpdate.setInt(6, endereco.getCodigoEndereco());
            preparacaoUpdate.execute();

        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void excluirEndereco(Endereco endereco) {
        String sqlExcluir = "delete from tb_endereco "
                + "where codigo_endereco = ?";
        try {
            PreparedStatement preparacaoDelete = conexao.prepareStatement(sqlExcluir);
            preparacaoDelete.setInt(1, endereco.getCodigoEndereco());
            preparacaoDelete.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
