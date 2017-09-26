package com.horus.ankata.core.domain.common;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ComCivilites.
 */
@Entity
@Table(name = "com_civilites")
public class ComCivilites implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "libelle")
    private String libelle;

    public String getCode() {
        return code;
    }

    public ComCivilites code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public ComCivilites libelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComCivilites comCivilites = (ComCivilites) o;
        if (comCivilites.getCode() == null || getCode() == null) {
            return false;
        }
        return Objects.equals(getCode(), comCivilites.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCode());
    }

    @Override
    public String toString() {
        return "ComCivilites{" +
            " code='" + getCode() + "'" +
            ", libelle='" + getLibelle() + "'" +
            "}";
    }
}
