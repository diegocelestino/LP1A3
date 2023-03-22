package exercises.class4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exercises.class3.Quadrado;

public class QuadradoTest {
    

    @Test
    public void criaUmQuadradoComLado10() {

        double lado = 10.0;

        Quadrado quadrado = new Quadrado(lado);

        assertEquals(lado, quadrado.getLado());

    }

    @Test
    public void oQuadradoComLado10DeveTerArea100() {

        double areaEsperada = 100.0;
        Quadrado quadrado = new Quadrado(10.0);

        double area = quadrado.calcularArea();

        assertEquals(areaEsperada, area);
    }

    @Test
    public void oQuadradoComLado10DeveTerPerimetro40() {

        double perimetroEsperado = 40.0;
        Quadrado quadrado = new Quadrado(10.0);

        double perimetro = quadrado.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetro);
    }

    @Test
    public void deveMudarOValorDoLado() {

        Quadrado quadrado = new Quadrado(10.0);

        quadrado.setLado(5.0);

        assertEquals(5.0, quadrado.getLado());
    }

}
