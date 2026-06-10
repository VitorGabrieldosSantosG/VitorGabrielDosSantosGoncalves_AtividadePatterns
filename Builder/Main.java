package Builder;

public class Main {
    public static void main(String[] args) {
        Computador computadorPadrao = new ComputadorBuilder().setProcessador("Intel Core i5").setMemoriaRAM("8GB").setArmazenamento("256GB SSD").build();

        Computador computadorGamer = new ComputadorBuilder().setProcessador("Intel Core i9").setMemoriaRAM("32GB").setArmazenamento("1TB SSD").setPlacaDeVideo("NVIDIA RTX 4070").build();

        System.out.println("=== Computador Básico ===");
        System.out.println(computadorPadrao);
        System.out.println("=== Computador Gamer ===");
        System.out.println(computadorGamer);
    }    
}
