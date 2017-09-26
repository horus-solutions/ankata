package com.horus.ankata.core.domain.flotte;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A FltCategories.
 */
@Entity
@Table(name = "flt_categories")
public class FltCategories implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "statut")
    private String statut;

    @Column(name = "icone")
    private String icone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public FltCategories code(String code) {
        this.code = code;
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public FltCategories libelle(String libelle) {
        this.libelle = libelle;
        return this;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getStatut() {
        return statut;
    }

    public FltCategories statut(String statut) {
        this.statut = statut;
        return this;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getIcone() {
        return icone;
    }

    public FltCategories icone(String icone) {
        this.icone = icone;
        return this;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FltCategories fltCategories = (FltCategories) o;
        if (fltCategories.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), fltCategories.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "FltCategories{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", libelle='" + getLibelle() + "'" +
            ", statut='" + getStatut() + "'" +
            ", icone='" + getIcone() + "'" +
            "}";
    }
}
