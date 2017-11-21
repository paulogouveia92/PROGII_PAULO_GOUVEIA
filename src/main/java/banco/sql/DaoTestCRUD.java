/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.sql;

import java.util.List;

/**
 *
 * @author Paulo Gouveia
 */
public class DaoTestCRUD {

    public static void main(String[] args) {
        /* teste das cruds dao usuario
        Usuario usu = new Usuario();
        DaoUsuario daoUsuario = new DaoUsuario();*/
        
        /* teste salvar
        usu.setNome("Pedrp");
        usu.setSobrenome("Henrique");
        daoUsuario.inserirUsuario(usu);*/
       
  /* teste listar
      List<Usuario> lista;
lista = daoUsuario.listarUsuario();
      for(Usuario usuario:lista){
           System.out.println(usuario.toString());
        
    /* teste atualizar 
      Usuario usuarioAtualizado = new Usuario();
     usuarioAtualizado.setNome("Paulo Cezar");
     usuarioAtualizado.setSobrenome("Henrique");
     usuarioAtualizado.setIdUsuario(2);
     daoUsuario.atualizarUsuario(usuarioAtualizado);*/

 /* teste remover
  Usuario usuarioRemovido = new Usuario();
  usuarioRemovido.setIdUsuario(2);
  daoUsuario.excluirUsuario(usuarioRemovido);*/
 
 
 //teste da dao perfil
 /*DaoPerfilUsuario daoPerfil = new DaoPerfilUsuario();
 PerfilUsuario perfilUsu = new PerfilUsuario();
 
 //testando metodo salvar
 
/* perfilUsu.setNomePerfil("AnaFlavia");
 perfilUsu.setDescricaoPerfil("descrição teste salvando Ana");
 daoPerfil.salvarPerfil(perfilUsu);*/

// teste metodo listar
/*List<PerfilUsuario> lista;
lista = daoPerfil.listarPerfil();
for(PerfilUsuario perfil :lista){
    System.out.println(perfil.toString());*/

//testando metodo atualizar
/*perfilUsu.setNomePerfil("PauloSouza");
perfilUsu.setDescricaoPerfil("atualizando descrição");
perfilUsu.setCodigoPerfil(1);
daoPerfil.atualizarPerfil(perfilUsu);*/

//testando metodo salvar endereço
/*perfilUsu.setCodigoPerfil(1);
daoPerfil.ExcluirPerfil(perfilUsu);*/

Endereco endereco = new Endereco();
DaoEndereco daoEndereco = new DaoEndereco();

/*endereco.setLogradouro("logradouro2");
endereco.setComplemento("complemento2");
endereco.setBairro("bairro2");
endereco.setNumero("101");
endereco.setCEP("79175000");
daoEndereco.inserirEndereco(endereco);*/

/*List<Endereco> lista;
lista = daoEndereco.listarEndereco();
for(Endereco endere:lista){
    System.out.println(endere.toString());*/

/*endereco.setLogradouro("logradouro atualizado");
endereco.setComplemento("complemento atualizado");
endereco.setBairro("bairro atualizado");
endereco.setNumero("atual");
endereco.setCEP("atual");
endereco.setCodigoEndereco(3);
daoEndereco.atualizarEndereco(endereco);*/

endereco.setCodigoEndereco(3);
daoEndereco.excluirEndereco(endereco);
    }

    }
//}
