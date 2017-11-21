package banco.sql;

import java.util.Objects;

/**
 *
 * @author Paulo Gouveia
 */
public class Usuario {

    private String nome;
    private String sobrenome;
    private int idUsuario;

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
     @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.sobrenome);
        hash = 61 * hash + this.idUsuario;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sobrenome, other.sobrenome)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nome= " + nome + ", sobrenome= " + sobrenome + ", idUsuario= " + idUsuario + "\n\n"+'}';
    }

}
  

