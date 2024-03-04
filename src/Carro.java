public class Carro {
    private String modelo;
    private int velocidade;

    // Construtor
    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }

    // Métodos getter e setter para o modelo do carro
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Métodos getter e setter para a velocidade do carro
    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Método para acelerar o carro
    public void andar(int aceleracao) {
        if (aceleracao > 0) {
            velocidade += aceleracao;
            System.out.println("O carro está andando. Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("A aceleração deve ser maior que zero.");
        }
    }

    // Método para frear o carro
    public void frear(int desaceleracao) {
        if (desaceleracao > 0 && velocidade - desaceleracao >= 0) {
            velocidade -= desaceleracao;
            System.out.println("O carro está freando. Velocidade: " + velocidade + " km/h");
        } else if (desaceleracao > 0) {
            System.out.println("O carro já está parado.");
        } else {
            System.out.println("A desaceleração deve ser maior que zero.");
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso da classe Carro
        Carro meuCarro = new Carro("Sedan");
        System.out.println("Modelo do carro: " + meuCarro.getModelo());

        meuCarro.andar(50);
        meuCarro.frear(20);
        meuCarro.frear(30);
    }
}
