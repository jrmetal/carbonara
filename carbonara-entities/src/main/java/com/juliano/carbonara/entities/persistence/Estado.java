package com.juliano.carbonara.entities.persistence;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Estado extends GenericEntitiey {

    @Transient
    public static final String PROPERTY_NOME = "nome";

    @Column(name = "Nome", length = 50, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String nome;

    @Transient
    public static final String PROPERTY_SIGLA = "sigla";

    @Column(name = "Sigla", length = 2, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String sigla;

    @Transient
    public static final String PROPERTY_CODIGOIBGE = "codigoIBGE";

    @Column(name = "CodigoIBGE", length = 2, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String codigoIBGE;

    @Transient
    public static final String PROPERTY_CIDADES = "cidades";

    @OneToMany(mappedBy = "estado", targetEntity = Cidade.class, fetch = FetchType.LAZY)
    private Set<Cidade> cidades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

    public Set<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(Set<Cidade> cidades) {
        this.cidades = cidades;
    }
}
