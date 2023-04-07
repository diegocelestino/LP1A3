package examples.class3;

public class Circulo {
    public static final String MENSAGEM_LADO_INVALIDO = "Lado deve ser maior que zero";
    public static final double PI = 3.141592;
    private double raio;

    public Circulo(double raio) {
        
        setRaio(raio);
    }

    public double calcularArea() {
        return (raio*raio) * PI ;
    }

    public double calcularPerimetro() {
        return 2 * PI * raio;
    }

    public void setRaio(double raio) {
        if (raio <= 0.0) {
            throw new IllegalArgumentException(MENSAGEM_LADO_INVALIDO);
        }

        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
}

