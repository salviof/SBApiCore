/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.entidadeEscuta;

import com.super_bits.modulosSB.SBCore.modulos.objetos.entidade.basico.ComoEntidadeSimples;
import javax.persistence.EntityManager;

/**
 *
 * @author salvio
 */
public interface ComoListenerGestaoDeEntidade {

    public void acaoAntesDeAtualizar(ComoEntidadeSimples pEntidade, EntityManager pEm);

    public void acaoAntesDePersistir(ComoEntidadeSimples pEntidade, EntityManager pEm);

    public void acaoAposAtualizar(ComoEntidadeSimples pEntidade, EntityManager pEm);

    public void acaoAposPersistir(ComoEntidadeSimples pEntidade, EntityManager pEm);

    public void acaoAposRemover(ComoEntidadeSimples pEntidade, EntityManager pEm);

    public void acaoAntesRemover(ComoEntidadeSimples pEntidade, EntityManager pEm);
}
