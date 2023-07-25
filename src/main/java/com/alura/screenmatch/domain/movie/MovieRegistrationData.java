package com.alura.screenmatch.domain.movie;

/*Record é um recurso que permite representar uma classe imutável, contendo apenas atributos,
        construtor e métodos de leitura, de uma maneira muito simples e enxuta.
Esse tipo de código se encaixa perfeitamente quando precisamos representar os dados enviados
        em um formulário, já que o foco é apenas nos dados em si que serão recebidos,
        sem nenhum tipo de comportamento adicional.*/

public record MovieRegistrationData(
        String name,
        Integer duration,
        Integer year,
        String gender) {
}
