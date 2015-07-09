package model;

import java.util.Objects;

/**
 *
 * @author Carlos Barromeu
 */
public class Cliente {
    
    private int    id_cli;
    private String nome_cli;
    private String endereco_cli;
    private String numero_cli;
    private String comp_cli;
    private String bairro_cli;
    private String cidade_cli;
    private String uf_cli;
    private String cep_cli;
    private String rg_cli;
    private String cpf_cli;
    private String cnpj_cli;
    private String fone_cli;
    private String celular_cli;
    private String email_cli;
    private String dataCad_cli;

    @Override
    public String toString() {
        return "Cliente{" + "id_cli=" + id_cli + ", nome_cli=" + nome_cli + ", endereco_cli=" + endereco_cli + ", numero_cli=" + numero_cli + ", comp_cli=" + comp_cli + ", bairro_cli=" + bairro_cli + ", cidade_cli=" + cidade_cli + ", uf_cli=" + uf_cli + ", cep_cli=" + cep_cli + ", rg_cli=" + rg_cli + ", cpf_cli=" + cpf_cli + ", cnpj_cli=" + cnpj_cli + ", fone_cli=" + fone_cli + ", celular_cli=" + celular_cli + ", email_cli=" + email_cli + ", dataCad_cli=" + dataCad_cli + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id_cli;
        hash = 89 * hash + Objects.hashCode(this.nome_cli);
        hash = 89 * hash + Objects.hashCode(this.endereco_cli);
        hash = 89 * hash + Objects.hashCode(this.numero_cli);
        hash = 89 * hash + Objects.hashCode(this.comp_cli);
        hash = 89 * hash + Objects.hashCode(this.bairro_cli);
        hash = 89 * hash + Objects.hashCode(this.cidade_cli);
        hash = 89 * hash + Objects.hashCode(this.uf_cli);
        hash = 89 * hash + Objects.hashCode(this.cep_cli);
        hash = 89 * hash + Objects.hashCode(this.rg_cli);
        hash = 89 * hash + Objects.hashCode(this.cpf_cli);
        hash = 89 * hash + Objects.hashCode(this.cnpj_cli);
        hash = 89 * hash + Objects.hashCode(this.fone_cli);
        hash = 89 * hash + Objects.hashCode(this.celular_cli);
        hash = 89 * hash + Objects.hashCode(this.email_cli);
        hash = 89 * hash + Objects.hashCode(this.dataCad_cli);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.id_cli != other.id_cli) {
            return false;
        }
        if (!Objects.equals(this.nome_cli, other.nome_cli)) {
            return false;
        }
        if (!Objects.equals(this.endereco_cli, other.endereco_cli)) {
            return false;
        }
        if (!Objects.equals(this.numero_cli, other.numero_cli)) {
            return false;
        }
        if (!Objects.equals(this.comp_cli, other.comp_cli)) {
            return false;
        }
        if (!Objects.equals(this.bairro_cli, other.bairro_cli)) {
            return false;
        }
        if (!Objects.equals(this.cidade_cli, other.cidade_cli)) {
            return false;
        }
        if (!Objects.equals(this.uf_cli, other.uf_cli)) {
            return false;
        }
        if (!Objects.equals(this.cep_cli, other.cep_cli)) {
            return false;
        }
        if (!Objects.equals(this.rg_cli, other.rg_cli)) {
            return false;
        }
        if (!Objects.equals(this.cpf_cli, other.cpf_cli)) {
            return false;
        }
        if (!Objects.equals(this.cnpj_cli, other.cnpj_cli)) {
            return false;
        }
        if (!Objects.equals(this.fone_cli, other.fone_cli)) {
            return false;
        }
        if (!Objects.equals(this.celular_cli, other.celular_cli)) {
            return false;
        }
        if (!Objects.equals(this.email_cli, other.email_cli)) {
            return false;
        }
        if (!Objects.equals(this.dataCad_cli, other.dataCad_cli)) {
            return false;
        }
        return true;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public String getEndereco_cli() {
        return endereco_cli;
    }

    public void setEndereco_cli(String endereco_cli) {
        this.endereco_cli = endereco_cli;
    }

    public String getNumero_cli() {
        return numero_cli;
    }

    public void setNumero_cli(String numero_cli) {
        this.numero_cli = numero_cli;
    }

    public String getComp_cli() {
        return comp_cli;
    }

    public void setComp_cli(String comp_cli) {
        this.comp_cli = comp_cli;
    }

    public String getBairro_cli() {
        return bairro_cli;
    }

    public void setBairro_cli(String bairro_cli) {
        this.bairro_cli = bairro_cli;
    }

    public String getCidade_cli() {
        return cidade_cli;
    }

    public void setCidade_cli(String cidade_cli) {
        this.cidade_cli = cidade_cli;
    }

    public String getUf_cli() {
        return uf_cli;
    }

    public void setUf_cli(String uf_cli) {
        this.uf_cli = uf_cli;
    }

    public String getCep_cli() {
        return cep_cli;
    }

    public void setCep_cli(String cep_cli) {
        this.cep_cli = cep_cli;
    }

    public String getRg_cli() {
        return rg_cli;
    }

    public void setRg_cli(String rg_cli) {
        this.rg_cli = rg_cli;
    }

    public String getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(String cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public String getCnpj_cli() {
        return cnpj_cli;
    }

    public void setCnpj_cli(String cnpj_cli) {
        this.cnpj_cli = cnpj_cli;
    }

    public String getFone_cli() {
        return fone_cli;
    }

    public void setFone_cli(String fone_cli) {
        this.fone_cli = fone_cli;
    }

    public String getCelular_cli() {
        return celular_cli;
    }

    public void setCelular_cli(String celular_cli) {
        this.celular_cli = celular_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public String getDataCad_cli() {
        return dataCad_cli;
    }

    public void setDataCad_cli(String dataCad_cli) {
        this.dataCad_cli = dataCad_cli;
    }

    public Cliente() {
    }

    public String getNum_cli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
