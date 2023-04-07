package examples.class4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.net.NoRouteToHostException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import examples.class3.Quadrado;

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

    @Test
    public void deveLancarExceptionSeLadoIgualAZero() {
        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Quadrado(0);
            });
    }

    @Test
    public void deveLancarExceptionSeLadoIgualAZeroComAMensagemCorreta() {
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Quadrado(0);});

            assertEquals("Lado deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void deveLancarExceptionSeLadoForNegativo() {
        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Quadrado(-10.0);
            });
    }

    @Test
    public void deveLancarExceptionSeLadoForNegativoComAMensagemCorreta() {
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Quadrado(-10.0);});

            assertEquals("Lado deve ser maior que zero", exception.getMessage());
    }


    @ParameterizedTest
    @ValueSource(doubles = {1.0, 1.5, 3, 100.0})
    public void testaVariosValoresParaOLado(double lado){
            Quadrado quadrado = new Quadrado(lado);

            assertEquals(lado, quadrado.getLado());
    }

}
