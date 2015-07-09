/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Carlos Barromeu
 */
public class Usuario {
    
    
    private int    id_usu;
    private String nome_usu;
    private String senha_usu;
    private int    id_per;

    @Override
    public String toString() {
        return "Usuario{" + "id_usu=" + id_usu + ", nome_usu=" + nome_usu + ", senha_usu=" + senha_usu + ", id_per=" + id_per + '}';
    }
    
    public Usuario() {
    }

    public Usuario(int id_usu, String nome_usu, String senha_usu, int id_per) {
        this.id_usu = id_usu;
        this.nome_usu = nome_usu;
        this.senha_usu = senha_usu;
        this.id_per = id_per;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id_usu;
        hash = 79 * hash + Objects.hashCode(this.nome_usu);
        hash = 79 * hash + Objects.hashCode(this.senha_usu);
        hash = 79 * hash + this.id_per;
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
        final Usuario other = (Usuario) obj;
        if (this.id_usu != other.id_usu) {
            return false;
        }
        if (!Objects.equals(this.nome_usu, other.nome_usu)) {
            return false;
        }
        if (!Objects.equals(this.senha_usu, other.senha_usu)) {
            return false;
        }
        if (this.id_per != other.id_per) {
            return false;
        }
        return true;
    }

    /**
     * @return the id_usu
     */
    public int getId_usu() {
        return id_usu;
    }

    /**
     * @param id_usu the id_usu to set
     */
    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    /**
     * @return the nome_usu
     */
    public String getNome_usu() {
        return nome_usu;
    }

    /**
     * @param nome_usu the nome_usu to set
     */
    public void setNome_usu(String nome_usu) {
        this.nome_usu = nome_usu;
    }

    /**
     * @return the senha_usu
     */
    public String getSenha_usu() {
        return senha_usu;
    }

    /**
     * @param senha_usu the senha_usu to set
     */
    public void setSenha_usu(String senha_usu) {
        this.senha_usu = senha_usu;
    }

    /**
     * @return the id_per
     */
    public int getId_per() {
        return id_per;
    }

    /**
     * @param id_per the id_per to set
     */
    public void setId_per(int id_per) {
        this.id_per = id_per;
    }
    
}
