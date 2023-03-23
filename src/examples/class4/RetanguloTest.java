package examples.class4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

import java.net.NoRouteToHostException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import examples.class3.Quadrado;
import examples.class3.Retangulo;

public class RetanguloTest {
    

    @Test
    public void criaUmRetanguloComBase10() {

        double base = 10.0;
        double altura = 12.0;

        Retangulo retangulo = new Retangulo(base, altura);

        assertEquals(base, retangulo.getBase());

    }

    @Test
    public void criaUmRetanguloComAltura10() {

        double base = 8.0;
        double altura = 10.0;

        Retangulo retangulo = new Retangulo(base, altura);

        assertEquals(altura, retangulo.getAltura());

    }

    @Test
    public void oRetanguloComBase3EAltura4DeveTerArea12() {

        double areaEsperada = 12.0;
        double base = 3.0;
        double altura = 4.0;
        Retangulo retangulo = new Retangulo(base, altura);

        double area = retangulo.calcularArea();

        assertEquals(areaEsperada, area);
    }

    @Test
    public void oRetanguloComBase3EAltura4DeveTerPerimetro14() {

        double perimetroEsperado = 14.0;
        double base = 3.0;
        double altura = 4.0;
        Retangulo retangulo = new Retangulo(base, altura);

        double perimetro = retangulo.calcularPerimetro();

        assertEquals(perimetroEsperado, perimetro);
    }


    @Test
    public void deveLancarExceptionSeBaseIgualAZero() {
        double base = 0.0;
        double altura = 4.0;

        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Retangulo(base, altura);
            });
    }

    @Test
    public void deveLancarExceptionSeBaseIgualAZeroComAMensagemCorreta() {
        double base = 0.0;
        double altura = 4.0;
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Retangulo(base, altura);});

            assertEquals("Base deve ser maior que zero", exception.getMessage());
    }


    @Test
    public void deveLancarExceptionSeAlturaIgualAZero() {
        double base = 4.0;
        double altura = 0.0;

        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Retangulo(base, altura);
            });
    }

    @Test
    public void deveLancarExceptionSeAlturaIgualAZeroComAMensagemCorreta() {
        double base = 4.0;
        double altura = 0.0;
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Retangulo(base, altura);});

            assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }


    @Test
    public void deveLancarExceptionSeBaseForNegativa() {
        double base = -4.0;
        double altura = 10.0;
        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Retangulo(base, altura);
            });
    }

    @Test
    public void deveLancarExceptionSeBaseForNegativaComAMensagemCorreta() {
        double base = -4.0;
        double altura = 10.0;
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Retangulo(base, altura);});

            assertEquals("Base deve ser maior que zero", exception.getMessage());
    }

    @Test
    public void deveLancarExceptionSeAlturaForNegativa() {
        double base = 4.0;
        double altura = -10.0;
        assertThrowsExactly(IllegalArgumentException.class, ()-> {
            new Retangulo(base, altura);
            });
    }

    @Test
    public void deveLancarExceptionSeAlturaForNegativaComAMensagemCorreta() {
        double base = 4.0;
        double altura = -10.0;
        IllegalArgumentException exception = assertThrowsExactly(
            IllegalArgumentException.class, ()-> {new Retangulo(base, altura);});

            assertEquals("Altura deve ser maior que zero", exception.getMessage());
    }

    
}
