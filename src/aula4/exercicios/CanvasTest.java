package aula4.exercicios;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aula3.exemplos.Canvas;
import aula3.exemplos.Quadrado;
import aula3.exemplos.Retangulo;

public class CanvasTest {

    @Test
    public void criaUmCanvasVazio() {
        Canvas canvas = new Canvas(0, 0);
        int quantidadeDeQuadradosERetangulosEsperada = 0;

        assertEquals(quantidadeDeQuadradosERetangulosEsperada, 
        canvas.getQuantidadeDeQuadrados() + canvas.getQuantidadeDeRetangulos());

    }

    @Test
    public void adicionaUmQuadradoNoCanvasVazio() {

        Canvas canvas = new Canvas(1, 1);
        Quadrado quadrado = new Quadrado(5);
        int quantidadeDeQuadradosEsperada = 1;

        canvas.adicionarQuadrado(quadrado);

        assertEquals(quantidadeDeQuadradosEsperada, canvas.getQuantidadeDeQuadrados());
    }

    @Test
    public void adicionaUmRetanguloNoCanvasVazio() {

        Canvas canvas = new Canvas(1, 1);
        Retangulo retangulo = new Retangulo(5, 4);
        int quantidadeDeRetangulosEsperada = 1;

        canvas.adicionarRetangulo(retangulo);

        assertEquals(quantidadeDeRetangulosEsperada, canvas.getQuantidadeDeRetangulos());
    }
    
    @Test
    public void aSomaDasAreasDosQuadradosDoCanvasDeveSerIgualA32() {

        Canvas canvas = new Canvas(2, 0);
        Quadrado quadrado1 = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(4);

        canvas.adicionarQuadrado(quadrado1);
        canvas.adicionarQuadrado(quadrado2);
        double areaDosQuadradosEsperada = 32.0;
        

        assertEquals(areaDosQuadradosEsperada, canvas.getSomaAreaDosQuadrados());
    }

    @Test
    public void aSomaDasAreasDosRetangulosDoCanvasDeveSerIgualA60(){

        Canvas canvas = new Canvas(0, 2);
        Retangulo retangulo1 = new Retangulo(10, 3);
        Retangulo retangulo2 = new Retangulo(3, 10);

        canvas.adicionarRetangulo(retangulo1);
        canvas.adicionarRetangulo(retangulo2);
        double areaDosRetangulosEsperada = 60.0;

        assertEquals(areaDosRetangulosEsperada, canvas.getSomaAreaDosRetangulos());
    }

    @Test
    public void adicionarQuadradoNoArrayCheioDeveLancarExcecao() {
        
        Canvas canvas = new Canvas(3, 0);
        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(10);
        Quadrado quadrado3 = new Quadrado(15);

        canvas.adicionarQuadrado(quadrado1);
        canvas.adicionarQuadrado(quadrado2);
        canvas.adicionarQuadrado(quadrado3);

        assertThrows(RuntimeException.class, () -> {
            canvas.adicionarQuadrado(new Quadrado(20));
        });
    }

    @Test
    public void adicionarRetanguloNoArrayCheioDeveLancarExcecao() {
  
        Canvas canvas = new Canvas(0, 3);
        Retangulo retangulo1 = new Retangulo(5, 10);
        Retangulo retangulo2 = new Retangulo(10, 20);
        Retangulo retangulo3 = new Retangulo(15, 30);
  

        canvas.adicionarRetangulo(retangulo1);
        canvas.adicionarRetangulo(retangulo2);
        canvas.adicionarRetangulo(retangulo3);

        assertThrows(RuntimeException.class, () -> {
            canvas.adicionarRetangulo(new Retangulo(20, 40));
        });
    }

}
