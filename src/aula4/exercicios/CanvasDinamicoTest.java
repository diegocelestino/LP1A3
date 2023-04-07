package aula4.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import aula3.exemplos.Quadrado;
import aula3.exemplos.Retangulo;

public class CanvasDinamicoTest {

    @BeforeEach
    public void setUp() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(3);
        Retangulo retangulo1 = new Retangulo(4, 6);
        Retangulo retangulo2 = new Retangulo(2, 8);
    }

    @Test
    public void criaUmCanvasDinamicoSemQuadrados(){
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        int quantidadeDeQuadradosEsperada = 0;

        assertEquals(quantidadeDeQuadradosEsperada, canvasDinamico.getQuantidadeDeQuadrados());
    }

    @Test
    public void criaUmCanvasDinamicoSemRetangulos(){
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        int quantidadeDeRetangulosEsperada = 0;

        assertEquals(quantidadeDeRetangulosEsperada, canvasDinamico.getQuantidadeDeRetangulos());
    }

    @Test
    public void adicionarUmQuadrado() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(3);


        canvasDinamico.adicionarQuadrado(quadrado1);
        canvasDinamico.adicionarQuadrado(quadrado2);

        assertEquals(2, canvasDinamico.getQuantidadeDeQuadrados());
    }

    @Test
    public void adicionarUmRetangulo() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Retangulo retangulo1 = new Retangulo(4, 6);
        Retangulo retangulo2 = new Retangulo(2, 8);

        canvasDinamico.adicionarRetangulo(retangulo1);
        canvasDinamico.adicionarRetangulo(retangulo2);

        assertEquals(2, canvasDinamico.getQuantidadeDeRetangulos());
    }

    @Test
    public void somaAreaDosQuadradosDeveSerIgualA36() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(3);

        canvasDinamico.adicionarQuadrado(quadrado1);
        canvasDinamico.adicionarQuadrado(quadrado2);

        assertEquals(34, canvasDinamico.getSomaAreaDosQuadrados());
    }

    @Test
    public void somaAreaDosRetangulossDeveSerIgualA40() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Retangulo retangulo1 = new Retangulo(4, 6);
        Retangulo retangulo2 = new Retangulo(2, 8);

        canvasDinamico.adicionarRetangulo(retangulo1);
        canvasDinamico.adicionarRetangulo(retangulo2);

        assertEquals(40, canvasDinamico.getSomaAreaDosRetangulos());
    }

    @Test
    public void somaDosPerimetrosDosQuadradosDeveSer32() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(3);

        canvasDinamico.adicionarQuadrado(quadrado1);
        canvasDinamico.adicionarQuadrado(quadrado2);
        assertEquals(32, canvasDinamico.getSomaPerimetroDosQuadrados());
    }

    @Test
    public void somaDosPerimetrosDosRetangulosDeveSer40() {
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Retangulo retangulo1 = new Retangulo(4, 6);
        Retangulo retangulo2 = new Retangulo(2, 8);

        canvasDinamico.adicionarRetangulo(retangulo1);
        canvasDinamico.adicionarRetangulo(retangulo2);
        assertEquals(40, canvasDinamico.getSomaPerimetroDosRetangulos());
    }



}


