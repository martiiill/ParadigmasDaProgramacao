
package QuatroPatas.Enums;

/**
 *
 * @author anaal
 */
public enum TipoGato {

    Interior, Exterior;

    public static String TipoGatoToString(TipoGato g) {
        switch (g) {
            case Interior:
                return "Gato de Interior";

            case Exterior:
                return "Gato de Exterior";

            default:
                return "Gato de Interior";
        }
    }
}
