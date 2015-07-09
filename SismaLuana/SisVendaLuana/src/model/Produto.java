package model;

import java.util.Objects;

/**
 *
 * @author Carlos Barromeu
 */
public class Produto {
    
    private int    id_pro;
    private String nome_pro;
    private String tipo;
    private String composicao;
    private String cor;
    private float  pecoCompra;
    private float  precoVenda;
    private String medida;
    private String quantidade;
    private int    id_for;
    private String dataCad_pro;

    @Override
    public String toString() {
        return "Produto{" + "id_pro=" + id_pro + ", nome_pro=" + nome_pro + ", tipo=" + tipo + ", composicao=" + composicao + ", cor=" + cor + ", pecoCompra=" + pecoCompra + ", precoVenda=" + precoVenda + ", medida=" + medida + ", quantidade=" + quantidade + ", id_for=" + id_for + ", dataCad_pro=" + dataCad_pro + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id_pro;
        hash = 67 * hash + Objects.hashCode(this.nome_pro);
        hash = 67 * hash + Objects.hashCode(this.tipo);
        hash = 67 * hash + Objects.hashCode(this.composicao);
        hash = 67 * hash + Objects.hashCode(this.cor);
        hash = 67 * hash + Float.floatToIntBits(this.pecoCompra);
        hash = 67 * hash + Float.floatToIntBits(this.precoVenda);
        hash = 67 * hash + Objects.hashCode(this.medida);
        hash = 67 * hash + Objects.hashCode(this.quantidade);
        hash = 67 * hash + this.id_for;
        hash = 67 * hash + Objects.hashCode(this.dataCad_pro);
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
        final Produto other = (Produto) obj;
        if (this.id_pro != other.id_pro) {
            return false;
        }
        if (!Objects.equals(this.nome_pro, other.nome_pro)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.composicao, other.composicao)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (Float.floatToIntBits(this.pecoCompra) != Float.floatToIntBits(other.pecoCompra)) {
            return false;
        }
        if (Float.floatToIntBits(this.precoVenda) != Float.floatToIntBits(other.precoVenda)) {
            return false;
        }
        if (!Objects.equals(this.medida, other.medida)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        if (this.id_for != other.id_for) {
            return false;
        }
        if (!Objects.equals(this.dataCad_pro, other.dataCad_pro)) {
            return false;
        }
        return true;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }

    public String getNome_pro() {
        return nome_pro;
    }

    public void setNome_pro(String nome_pro) {
        this.nome_pro = nome_pro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPecoCompra() {
        return pecoCompra;
    }

    public void setPecoCompra(float pecoCompra) {
        this.pecoCompra = pecoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public int getId_for() {
        return id_for;
    }

    public void setId_for(int id_for) {
        this.id_for = id_for;
    }

    public String getDataCad_pro() {
        return dataCad_pro;
    }

    public void setDataCad_pro(String dataCad_pro) {
        this.dataCad_pro = dataCad_pro;
    }

    public Produto(int id_pro, String nome_pro, String tipo, String composicao, String cor, float pecoCompra, float precoVenda, String medida, String quantidade, int id_for, String dataCad_pro) {
        this.id_pro = id_pro;
        this.nome_pro = nome_pro;
        this.tipo = tipo;
        this.composicao = composicao;
        this.cor = cor;
        this.pecoCompra = pecoCompra;
        this.precoVenda = precoVenda;
        this.medida = medida;
        this.quantidade = quantidade;
        this.id_for = id_for;
        this.dataCad_pro = dataCad_pro;
    }

    public Produto() {
    }
    
}
