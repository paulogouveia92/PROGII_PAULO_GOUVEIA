
package banco.sql;

import java.util.Objects;

/**
 *
 * @author Paulo Gouveia
 */
public class PerfilUsuario {
    private int codigoPerfil;
    private int chaveEstrangeiraUsu;
    private String nomePerfil;
    private String descricaoPerfil;

    public int getCodigoPerfil() {
        return codigoPerfil;
    }

    public void setCodigoPerfil(int codigoPerfil) {
        this.codigoPerfil = codigoPerfil;
    }

    public int getChaveEstrangeiraUsu() {
        return chaveEstrangeiraUsu;
    }

    public void setChaveEstrangeiraUsu(int chaveEstrangeiraUsu) {
        this.chaveEstrangeiraUsu = chaveEstrangeiraUsu;
    }

    public String getNomePerfil() {
        return nomePerfil;
    }

    public void setNomePerfil(String nomePerfil) {
        this.nomePerfil = nomePerfil;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.codigoPerfil;
        hash = 97 * hash + this.chaveEstrangeiraUsu;
        hash = 97 * hash + Objects.hashCode(this.nomePerfil);
        hash = 97 * hash + Objects.hashCode(this.descricaoPerfil);
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
        final PerfilUsuario other = (PerfilUsuario) obj;
        if (this.codigoPerfil != other.codigoPerfil) {
            return false;
        }
        if (this.chaveEstrangeiraUsu != other.chaveEstrangeiraUsu) {
            return false;
        }
        if (!Objects.equals(this.nomePerfil, other.nomePerfil)) {
            return false;
        }
        if (!Objects.equals(this.descricaoPerfil, other.descricaoPerfil)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PerfilUsuario{" + "codigoPerfil= " + codigoPerfil + ", chaveEstrangeiraUsu= " + chaveEstrangeiraUsu + ", nomePerfil= " + nomePerfil + ", descricaoPerfil= " + descricaoPerfil +"\n\n"+ '}';
    }

    
    
    
}
