/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco.sql;

import java.util.Objects;

/**
 *
 * @author Paulo Gouveia
 */
public class Endereco {
    private int codigoEndereco;
    private int chaveEstrangeiraUsu;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String numero;
    private String CEP;

    public int getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(int codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public int getChaveEstrangeiraUsu() {
        return chaveEstrangeiraUsu;
    }

    public void setChaveEstrangeiraUsu(int chaveEstrangeiraUsu) {
        this.chaveEstrangeiraUsu = chaveEstrangeiraUsu;
    }

   

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.codigoEndereco;
        hash = 47 * hash + this.chaveEstrangeiraUsu;
        
        hash = 47 * hash + Objects.hashCode(this.logradouro);
        hash = 47 * hash + Objects.hashCode(this.complemento);
        hash = 47 * hash + Objects.hashCode(this.bairro);
        hash = 47 * hash + Objects.hashCode(this.numero);
        hash = 47 * hash + Objects.hashCode(this.CEP);
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
        final Endereco other = (Endereco) obj;
        if (this.codigoEndereco != other.codigoEndereco) {
            return false;
        }
        if (this.chaveEstrangeiraUsu != other.chaveEstrangeiraUsu) {
            return false;
        }
        
        
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.CEP, other.CEP)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "codigoEndereco= " + codigoEndereco + ", chaveEstrangeiraUsu= " + chaveEstrangeiraUsu + ", logradouro= " + logradouro + ", complemento= " + complemento + ", bairro= " + bairro + ", numero= " + numero + ", CEP= " + CEP + "\n\n"+'}';
    }

        
}
