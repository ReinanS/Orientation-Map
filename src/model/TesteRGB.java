package model;

public class TesteRGB {
    public static void main(String[] args) {
        
        ColorRGB color1 = new ColorRGB(37, 150, 190); 
        color1.TesteClarear("#3BA1C5", 0.1);

        ColorRGB color2 = new ColorRGB(37, 150, 190); 
        color2.TesteEscurecer("#2187AB", 0.1);

        // RGB color3 = new RGB(37, 150, 190); 
        // color3.TesteConverteEmCinza("#797979");

        // Imagem img = new Imagem(3, 5);
        // RGB color4 = new RGB (40, 253, 251);

        // System.out.println("Antes + ");
        // img.exibirImagem(); 

        // // Metodos sobrecarregados
        // img.modificarPixelDaImagem(0, 2, color4);

        // // img.modificarPixelDaImagem(0, 2, 42, 155, 234);

        // System.out.println("Depois + ");
        // img.exibirImagem(); 
    }
}
