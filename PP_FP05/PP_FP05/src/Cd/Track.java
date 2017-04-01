package Cd;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the track structure
 * </p>
 */
public class Track {

    private static final int MAX_AUTHORES = 5;
    /**
     * Numero da faixa
     */
    protected int number;
    /**
     * Nome da faixa
     */
    protected String title;
    /**
     * Duracao da faixa, em segundos
     */
    protected int duration;
    /**
     * Autor da faixa
     */
    protected Author[] authores = new Author[MAX_AUTHORES];

    /**
     * Método construtor para a criação de uma instância de @Track, tendo por
     * base quase todos os atributos de musica ({@link Track})
     *
     * @param tempNumber Número da musica ({@link Track})
     * @param tempName Nome da musica ({@link Track})
     * @param tempTime Duracao, em segundos, da musica({@link Track})
     * @param tempAuthor Autor da musica ({@link Track})
     * ({@link Track})
     */
    public Track(int tempNumber, String tempName, int tempTime, Author[] tempAuthor) {
        if (tempNumber <= 0) {
            System.out.println("O numero tem que ser maior que zero.");
        } else {
            number = tempNumber;
        }

        if (tempName.isEmpty() == true) {
            System.out.println("Tem que introduzir um nome.");
        } else {
            title = tempName;
        }

        if (duration <= 0) {
            System.out.println("A duracao tem que ser positiva");
        } else {
            duration = tempTime;
        }

        if (tempAuthor.length <= 0) {
            System.out.println("Uma musica tem que ter pelo menos um autor.");
        } else {
            authores = tempAuthor;
        }
    }
}
