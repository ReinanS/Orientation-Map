package inf008.utils.Conversor;

import inf008.model.Cor.Cor;
import inf008.model.Cor.CorCMYK;
import inf008.model.Cor.CorRGB;
import inf008.model.Mapa.Mapa;
import inf008.model.Mapa.MapaRGB;

public class ConversorCMYKtoRGB implements ConversorCor{

    @Override
    public Mapa getNovoMapa(int altura, int largura) {
        return new MapaRGB(altura, largura);
    }

    @Override
    public Cor converter(Cor cor) {
        CorCMYK corCMYK = (CorCMYK) cor;

        return new CorRGB(convertFragment(corCMYK.getCyan(), corCMYK), 
                          convertFragment(corCMYK.getMagente(), corCMYK), 
                          convertFragment(corCMYK.getYellow(), corCMYK));
    }

    private int convertFragment(int arg1, CorCMYK cmyk) {
        return (255 * (1 - arg1 / 100)) * (1 - cmyk.getkeyBlack() / 100);
    }

}