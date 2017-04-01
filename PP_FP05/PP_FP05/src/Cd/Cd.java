package Cd;

/**
 * Tive que mudar a acessibilidade para public para ser visivel em StoreDemo.
 */
/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the cd structure
 * </p>
 */
public class Cd {

    /**
     * Nome do cd ({@link Cd})
     */
    public String name;

    /**
     * Ano do cd ({@link Cd})
     */
    public int year;

    /**
     * Editor do cd ({@link Cd})
     */
    public String editor;

    /**
     * Conjunto de musicas({@link Track}) de um cd ({@link Cd})
     */
    public Track[] tracks;

    /**
     * Preco do cd ({@link Cd})
     */
    public float price;

    /**
     * Método construtor para a criação de uma instância de @Cd, tendo por base
     * quase todos os atributos de cd ({@link Cd})
     *
     * @param tempName Nome do cd ({@link Cd})
     * @param tempYear Ano do cd ({@link Cd})
     * @param tempEditor Editor do cd ({@link Cd})
     * @param tempTracks Colecao de musicas ({@link Track}) no cd null null     ({@link Cd})
     * ({@link Track})
     */
    public Cd(String tempName, int tempYear, String tempEditor, Track[] tempTracks) {
        if (tempName.isEmpty() == true) {
            System.out.println("Um cd tem que ter um nome");
        } else {
            name = tempName;
        }

        if (tempYear > 2017) {
            System.out.println("Um cd nao pode ser de um ano que ainda nao chegou.");
        } else {
            year = tempYear;
        }

        if (tempEditor.isEmpty() == true) {
            System.out.println("Um cd tem que ter um editora.");
        } else {
            editor = tempEditor;
        }

        if (tempTracks.length <= 0) {
            System.out.println("Um cd tem que ter pelo menos uma musica.");
        } else {
            tracks = tempTracks;
        }
    }

    /**
     * Método construtor para a criação de uma instância de @Cd, tendo por base
     * todos os atributos de cd ({@link Cd})
     *
     * @param tempName Nome do cd ({@link Cd})
     * @param tempYear Ano do cd ({@link Cd})
     * @param tempEditor Editor do cd ({@link Cd})
     * @param tempTracks Colecao de musicas ({@link Track}) no cd null null     ({@link Cd})
     * ({@link Track})
     * @param tempPrice preco do cd ({@link Cd})
     */
    public Cd(String tempName, int tempYear, String tempEditor, Track[] tempTracks, float tempPrice) {
        if (tempName.isEmpty() == true) {
            System.out.println("Um cd tem que ter um nome");
        } else {
            name = tempName;
        }

        if (tempYear > 2017) {
            System.out.println("Um cd nao pode ser de um ano que ainda nao chegou.");
        } else {
            year = tempYear;
        }

        if (tempEditor.isEmpty() == true) {
            System.out.println("Um cd tem que ter um editora.");
        } else {
            editor = tempEditor;
        }

        if (tempTracks.length <= 0) {
            System.out.println("Um cd tem que ter pelo menos uma musica.");
        } else {
            tracks = tempTracks;
        }

        if (tempPrice <= 0) {
            System.out.println("O preco de um cd tem que ser positivo.");
        } else {
            price = tempPrice;
        }
    }
}
