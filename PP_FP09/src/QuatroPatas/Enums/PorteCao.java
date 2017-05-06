package QuatroPatas.Enums;

/**
 *
 * @author anaal
 */
public enum PorteCao {

    Pequeno, Medio, Grande;

    public static String PorteCaoToString(PorteCao p) {
        switch (p) {
            case Pequeno:
                return "Porte Pequeno";

            case Medio:
                return "Porte Medio";

            case Grande:
                return "Porte Grande";

            default:
                return "Porte Medio";
        }
    }
}
