package model;

import java.util.Objects;

/**
 *
 * @author Carloa Barromeu
 */
public class Fornecedor {
    private int id_for;
    private String nome_for;
    private String endereco_for;
    private String numero_for;
    private String comp_for;
    private String bairro_for;
    private String cidade_for;
    private String uf_for;
    private String cep_for;
    private String rg_for;
    private String cpf_for;
    private String cnpj_for;
    private String fone_for;
    private String celular_for;
    private String email_for;
    private String dataCad_for;

    @Override
    public String toString() {
        return "Fornecedor{" + "id_for=" + id_for + ", nome_for=" + nome_for + ", endereco_for=" + endereco_for + ", numero_for=" + numero_for + ", comp_for=" + comp_for + ", bairro_for=" + bairro_for + ", cidade_for=" + cidade_for + ", uf_for=" + uf_for + ", cep_for=" + cep_for + ", rg_for=" + rg_for + ", cpf_for=" + cpf_for + ", cnpj_for=" + cnpj_for + ", fone_for=" + fone_for + ", celular_for=" + celular_for + ", email_for=" + email_for + ", dataCad_for=" + dataCad_for + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id_for;
        hash = 37 * hash + Objects.hashCode(this.nome_for);
        hash = 37 * hash + Objects.hashCode(this.endereco_for);
        hash = 37 * hash + Objects.hashCode(this.numero_for);
        hash = 37 * hash + Objects.hashCode(this.comp_for);
        hash = 37 * hash + Objects.hashCode(this.bairro_for);
        hash = 37 * hash + Objects.hashCode(this.cidade_for);
        hash = 37 * hash + Objects.hashCode(this.uf_for);
        hash = 37 * hash + Objects.hashCode(this.cep_for);
        hash = 37 * hash + Objects.hashCode(this.rg_for);
        hash = 37 * hash + Objects.hashCode(this.cpf_for);
        hash = 37 * hash + Objects.hashCode(this.cnpj_for);
        hash = 37 * hash + Objects.hashCode(this.fone_for);
        hash = 37 * hash + Objects.hashCode(this.celular_for);
        hash = 37 * hash + Objects.hashCode(this.email_for);
        hash = 37 * hash + Objects.hashCode(this.dataCad_for);
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
        final Fornecedor other = (Fornecedor) obj;
        if (this.id_for != other.id_for) {
            return false;
        }
        if (!Objects.equals(this.nome_for, other.nome_for)) {
            return false;
        }
        if (!Objects.equals(this.endereco_for, other.endereco_for)) {
            return false;
        }
        if (!Objects.equals(this.numero_for, other.numero_for)) {
            return false;
        }
        if (!Objects.equals(this.comp_for, other.comp_for)) {
            return false;
        }
        if (!Objects.equals(this.bairro_for, other.bairro_for)) {
            return false;
        }
        if (!Objects.equals(this.cidade_for, other.cidade_for)) {
            return false;
        }
        if (!Objects.equals(this.uf_for, other.uf_for)) {
            return false;
        }
        if (!Objects.equals(this.cep_for, other.cep_for)) {
            return false;
        }
        if (!Objects.equals(this.rg_for, other.rg_for)) {
            return false;
        }
        if (!Objects.equals(this.cpf_for, other.cpf_for)) {
            return false;
        }
        if (!Objects.equals(this.cnpj_for, other.cnpj_for)) {
            return false;
        }
        if (!Objects.equals(this.fone_for, other.fone_for)) {
            return false;
        }
        if (!Objects.equals(this.celular_for, other.celular_for)) {
            return false;
        }
        if (!Objects.equals(this.email_for, other.email_for)) {
            return false;
        }
        if (!Objects.equals(this.dataCad_for, other.dataCad_for)) {
            return false;
        }
        return true;
    }

    public Fornecedor(int id_for, String nome_for, String endereco_for, String numero_for, String comp_for, String bairro_for, String cidade_for, String uf_for, String cep_for, String rg_for, String cpf_for, String cnpj_for, String fone_for, String celular_for, String email_for, String dataCad_for) {
        this.id_for = id_for;
        this.nome_for = nome_for;
        this.endereco_for = endereco_for;
        this.numero_for = numero_for;
        this.comp_for = comp_for;
        this.bairro_for = bairro_for;
        this.cidade_for = cidade_for;
        this.uf_for = uf_for;
        this.cep_for = cep_for;
        this.rg_for = rg_for;
        this.cpf_for = cpf_for;
        this.cnpj_for = cnpj_for;
        this.fone_for = fone_for;
        this.celular_for = celular_for;
        this.email_for = email_for;
        this.dataCad_for = dataCad_for;
    }

    public Fornecedor() {
    }

    public int getId_for() {
        return id_for;
    }

    public void setId_for(int id_for) {
        this.id_for = id_for;
    }

    public String getNome_for() {
        return nome_for;
    }

    public void setNome_for(String nome_for) {
        this.nome_for = nome_for;
    }

    public String getEndereco_for() {
        return endereco_for;
    }

    public void setEndereco_for(String endereco_for) {
        this.endereco_for = endereco_for;
    }

    public String getNumero_for() {
        return numero_for;
    }

    public void setNumero_for(String numero_for) {
        this.numero_for = numero_for;
    }

    public String getComp_for() {
        return comp_for;
    }

    public void setComp_for(String comp_for) {
        this.comp_for = comp_for;
    }

    public String getBairro_for() {
        return bairro_for;
    }

    public void setBairro_for(String bairro_for) {
        this.bairro_for = bairro_for;
    }

    public String getCidade_for() {
        return cidade_for;
    }

    public void setCidade_for(String cidade_for) {
        this.cidade_for = cidade_for;
    }

    public String getUf_for() {
        return uf_for;
    }

    public void setUf_for(String uf_for) {
        this.uf_for = uf_for;
    }

    public String getCep_for() {
        return cep_for;
    }

    public void setCep_for(String cep_for) {
        this.cep_for = cep_for;
    }

    public String getRg_for() {
        return rg_for;
    }

    public void setRg_for(String rg_for) {
        this.rg_for = rg_for;
    }

    public String getCpf_for() {
        return cpf_for;
    }

    public void setCpf_for(String cpf_for) {
        this.cpf_for = cpf_for;
    }

    public String getCnpj_for() {
        return cnpj_for;
    }

    public void setCnpj_for(String cnpj_for) {
        this.cnpj_for = cnpj_for;
    }

    public String getFone_for() {
        return fone_for;
    }

    public void setFone_for(String fone_for) {
        this.fone_for = fone_for;
    }

    public String getCelular_for() {
        return celular_for;
    }

    public void setCelular_for(String celular_for) {
        this.celular_for = celular_for;
    }

    public String getEmail_for() {
        return email_for;
    }

    public void setEmail_for(String email_for) {
        this.email_for = email_for;
    }

    public String getDataCad_for() {
        return dataCad_for;
    }

    public void setDataCad_for(String dataCad_for) {
        this.dataCad_for = dataCad_for;
    }
}
