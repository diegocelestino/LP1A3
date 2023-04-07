package aula4.exercicios;

import aula3.exemplos.Quadrado;
import aula3.exemplos.Retangulo;

public class CanvasMain {
    public static void main(String[] args) {
        
        CanvasDinamico canvasDinamico = new CanvasDinamico();
        Quadrado quadrado = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(5);
        Retangulo retangulo = new Retangulo(2, 4);

        canvasDinamico.adicionarQuadrado(quadrado);
        canvasDinamico.adicionarQuadrado(quadrado2);
        canvasDinamico.adicionarRetangulo(retangulo);

        System.out.println(canvasDinamico.getQuantidadeDeQuadrados() + " " + canvasDinamico.getQuantidadeDeRetangulos());
    }
    
}
