package Escola.Enums;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public enum AreaAdmin {

    RecursosHumanos, Secretaria;

    public static String AreaAdminToString(AreaAdmin aa) {
        switch (aa) {
            case RecursosHumanos:
                return "Recursos Humanos";

            case Secretaria:
                return "Secretaria";

            default:
                return "Recursos Humanos";
        }
    }
}
