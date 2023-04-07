package aula4.exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.net.NoRouteToHostException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import aula3.exemplos.Quadrado;
import aula3.exercicios.Circulo;

public class CirculoTest {
    

    @Test
    public void criaUmCirculoComRaio10() {

        double raio = 10.0;

        Circulo circulo = new Circulo(raio);

        assertEquals(raio, circulo.getRaio());

    }

    @Test
    public void oCirculoComRaio3DeveTerArea28v27() {

        double areaEsperada = 28.27;
        Circulo circulo = new Circulo(3.0);

        double area = Math.round(circulo.calcularArea() * 100.0) / 100.0;

        assertEquals(areaEsperada, area);
    }

    @Test
    public void oCirculoComRaio3DeveTerPerimetro18v84() {

        double perimetroEsperado = 18.85;
        Circulo circulo = new Circulo(3.0);

        double perimetro = Math.round(circulo.calcularPerimetro() * 100.0) / 100.0;

        assertEquals(perimetroEsperado, perimetro);
    }

    @Test
    public void deveMudarOValorDoRaio() {

        Circulo circulo = new Circulo(10.0);

        circulo.setRaio(5.0);

        assertEquals(5.0, circulo.getRaio());
    }

    @Test
    public void deveLancarExceptionSeRaioIgualAZero() {
        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Circulo(0);
            });
    }

    @Test
    public void deveLancarExceptionSeRaioIgualAZeroComAMensagemCorreta() {
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Circulo(0);});

            assertEquals("Raio deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void deveLancarExceptionSeRaioForNegativo() {
        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Circulo(-10.0);
            });
    }

    @Test
    public void deveLancarExceptionSeRaioForNegativoComAMensagemCorreta() {
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Circulo(-10.0);});

            assertEquals("Raio deve ser maior que zero", exception.getMessage());
    }


    @ParameterizedTest
    @ValueSource(doubles = {1.0, 1.5, 3, 100.0})
    public void testaVariosValoresParaORaio(double raio){
            Circulo circulo = new Circulo(raio);

            assertEquals(raio, circulo.getRaio());
    }

}
