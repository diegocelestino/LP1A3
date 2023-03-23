package examples.class3;


public class Canvas {
    private Quadrado[] quadrados;
    private Retangulo[] retangulos;
    private int quantidadeDeQuadrados;
    private int quantidadeDeRetangulos;

    public Canvas(int capacidadeQuadrados, int capacidadeRetangulos) {
        quadrados = new Quadrado[capacidadeQuadrados];
        retangulos = new Retangulo[capacidadeRetangulos];    
        quantidadeDeQuadrados = 0;
        quantidadeDeQuadrados = 0;
    }

    public void adicionarQuadrado(Quadrado quadrado){
        if(quantidadeDeQuadrados == quadrados.length){
            throw new RuntimeException("Array de quadrados está cheio");
        }

        quadrados[quantidadeDeQuadrados] = quadrado;
        quantidadeDeQuadrados++;
    }

    public void adicionarRetangulo(Retangulo retangulo){
        if(quantidadeDeRetangulos == retangulos.length){
            throw new RuntimeException("Array de retangulos está cheio");
        }
        
        retangulos[quantidadeDeRetangulos] = retangulo;
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
