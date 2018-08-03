package com.juliano.carbonara.entities.persistence;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Cidade extends GenericEntitiey {

    @Transient
    public static final String PROPERTY_STATUS = "status";

    @Column(name = "Status", length = 1, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private char status = 'A';

    @Transient
    public static final String PROPERTY_NOME = "nome";

    @Column(name = "Nome", length = 70, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String nome;

    @Transient
    public static final String PROPERTY_ESTADO = "estado";

    @ManyToOne(optional = false, targetEntity = Estado.class, fetch = FetchType.LAZY)
    @JoinColumns(value = {
        @JoinColumn(name = "EstadoID", nullable = false, unique = false, insertable = true, updatable = true, referencedColumnName = "ID")})
    private Estado estado;

    @Transient
    public static final String PROPERTY_CODIGOIBGE = "codigoIBGE";

    @Column(name = "CodigoIBGE", length = 7, scale = 0, precision = 0, nullable = true, unique = false, insertable = true, updatable = true)
    private String codigoIBGE;

    @Transient
    public static final String PROPERTY_BAIRROS = "bairros";

//    @OneToMany(mappedBy = "cidade", targetEntity = Bairro.class, fetch = FetchType.LAZY)
//    private Set<Bairro> bairros;

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }

//    public Set<Bairro> getBairros() {
//        return bairros;
//    }
//
//    public void setBairros(Set<Bairro> bairros) {
//        this.bairros = bairros;
//    }
}
