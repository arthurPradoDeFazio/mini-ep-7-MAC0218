package domain

import domain.criterios.CriterioDeAprovacao

class AnalisadorDeAprovacao {

    // ---------------------------------
    //
    //      Seu código deve vir aqui
    //
    //      Defina atributos e métodos conforme especificado
    //      no arquivo de teste encontrado em
    //      'src/test/kotlin/domain/AnalisadorDeAprovacaoTest'
    //
    // ---------------------------------
    private lateinit var criterio : CriterioDeAprovacao


    fun defineCriterio(criterioIn : CriterioDeAprovacao) {
        criterio = criterioIn
    }

    fun fechaBoletim(boletim : Boletim) : BoletimFechado {
        val mediaFinal : Double = criterio.mediaFinal(boletim)
        val foiAprovado : Boolean = criterio.estaAprovado(boletim)
        return BoletimFechado(boletim.mediaEPs, boletim.mediaMiniEPs, mediaFinal, foiAprovado)
    }

}