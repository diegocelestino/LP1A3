package aula4.exercicios;

import java.util.Arrays;

import aula3.exemplos.Quadrado;
import aula3.exemplos.Retangulo;

public class CanvasDinamico {
    private Quadrado[] quadrados;
    private Retangulo[] retangulos;
    private int quantidadeDeQuadrados;
    private int quantidadeDeRetangulos;

    public CanvasDinamico() {
        quadrados = new Quadrado[0];
        retangulos = new Retangulo[0];    
        quantidadeDeQuadrados = 0;
        quantidadeDeRetangulos = 0;
    }

    public void adicionarQuadrado(Quadrado quadrado){
        int tamanhoDinamico = quantidadeDeQuadrados + 1;
        Quadrado[] quadradosDinamico = Arrays.copyOf(quadrados, tamanhoDinamico);
        quadradosDinamico[quantidadeDeQuadrados] = quadrado;
        quadrados = quadradosDinamico;
        quantidadeDeQuadrados++;
    }

    public void adicionarRetangulo(Retangulo retangulo){
        int tamanhoDinamico = quantidadeDeRetangulos + 1;
        Retangulo[] retanguloDinamico = Arrays.copyOf(retangulos, tamanhoDinamico);
        retanguloDinamico[quantidadeDeRetangulos] = retangulo;
        retangulos = retanguloDinamico;
        quantidadeDeRetangulos++;
    }

    public int getQuantidadeDeQuadrados(){
        return quantidadeDeQuadrados;
    }

    public int getQuantidadeDeRetangulos(){
        return quantidadeDeRetangulos;
    }
    
    public double getSomaAreaDosQuadrados(){
        double soma = 0;
        for (int i = 0; i < quantidadeDeQuadrados; i++) {
            soma += quadrados[i].calcularArea();
        }

        return soma;
    }

    public double getSomaAreaDosRetangulos(){
        double soma = 0;
        for (int i = 0; i < quantidadeDeRetangulos; i++) {
            soma += retangulos[i].calcularArea();
        }
        
        return soma;
    }

    public double getSomaPerimetroDosQuadrados(){
        double soma = 0;
        for (int i = 0; i < quantidadeDeQuadrados; i++) {
            soma += quadrados[i].calcularPerimetro();
        }

        return soma;
    }

    public double getSomaPerimetroDosRetangulos(){
        double soma = 0;
        for (int i = 0; i < quantidadeDeRetangulos; i++) {
            soma += retangulos[i].calcularPerimetro();
        }
        
        return soma;
    }
}
