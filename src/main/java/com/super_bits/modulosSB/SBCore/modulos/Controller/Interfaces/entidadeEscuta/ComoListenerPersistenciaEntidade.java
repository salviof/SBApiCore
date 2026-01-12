/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.entidadeEscuta;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import javax.persistence.EntityManager;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 *
 * @author salvio
 */
public interface ComoListenerPersistenciaEntidade {

    @PreUpdate
    void acaoAntesDeAtualizar(ComoEntidadeSimples pEntidade);

    @PrePersist
    void acaoAntesDePersistir(ComoEntidadeSimples pEntidade);

    @PostUpdate
    void acaoAposAtualizar(ComoEntidadeSimples pEntidade);

    @PostPersist
    void acaoAposPersistir(ComoEntidadeSimples pEntidade);

    @PostRemove
    void acaoAposRemover(ComoEntidadeSimples pEntidade);

    @PreRemove
    public void acaoAntesRemover(ComoEntidadeSimples pEntidade);

}
