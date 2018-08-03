package com.juliano.carbonara.entities.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Bairro extends GenericEntitiey {

    @Transient
    public static final String PROPERTY_STATUS = "status";

    @Column(name = "Status", length = 1, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private char status = 'A';

    @Transient
    public static final String PROPERTY_NOME = "nome";

    @Column(name = "Nome", length = 70, scale = 0, precision = 0, nullable = false, unique = false, insertable = true, updatable = true)
    private String nome;

    @Transient
    public static final String PROPERTY_CIDADE = "cidade";

//    @ManyToOne(optional = false, targetEntity = Cidade.class, fetch = FetchType.LAZY)
//    @JoinColumns(value = {
//        @JoinColumn(name = "CidadeID", nullable = false, unique = false, insertable = true, updatable = true, referencedColumnName = "ID")})
//    private Cidade cidade;

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
}
