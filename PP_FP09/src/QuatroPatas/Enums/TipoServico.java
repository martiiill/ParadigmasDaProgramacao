package QuatroPatas.Enums;

/**
 *
 * @author anaal
 */
public enum TipoServico {

    Passeios, Alojamento, Transporte, Banho_e_Tosquia, Sessao_Fotografica;

    public static String TipoServicoToString(TipoServico tp) {
        switch (tp) {

            case Passeios:
                return "Passeios";

            case Alojamento:
                return "Alojamento";

            case Transporte:
                return "Transporte";

            case Banho_e_Tosquia:
                return "Banho e Tosquia";

            case Sessao_Fotografica:
                return "Sessao Fotografica";

            default:
                return "Banho e Tosquia";
        }
    }
}