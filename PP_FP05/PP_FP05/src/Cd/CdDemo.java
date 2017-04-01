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
 * Class that represents the cd demo structure
 * </p>
 */
public class CdDemo {

    public static void main(String[] args) {
        Author[] a = {
            new Author("The Lummineers", 24, "Porto", 123456798, 123678905, "Vendedor"),
            new Author("Martin Shultz", 30, "Lisboa", 123456798, 123012345, "Vendedor")
        };
        Track[] t = {
            new Track(1, "Ho Hey!", 90, a),
            new Track(2, "Stubborn Love", 105, a)
        };

        Cd cd = new Cd("The Lummineers", 2012, "Dualtone Records", t);

        System.out.println("Nome do Cd: " + cd.name);
        System.out.println("Ano de lançamento: " + cd.year);
        System.out.println("Editora: " + cd.editor);

        for (Track track : t) {
            System.out.println("Numero da musica: " + track.number);
            System.out.println("Nome da musica: " + track.title);
            System.out.println("Duration: " + track.duration + " segundos");
            System.out.println("Authores: ");
            for (int i = 0; i < a.length; i++) {
                System.out.println("Nome do autor: " + track.authores[i].name);
                System.out.println("Idade do autor: " + track.authores[i].age);
                System.out.println("Morada: " + track.authores[i].address);
                System.out.println("Nif: " + track.authores[i].NIF);
                System.out.println("Nib: " + track.authores[i].NIB);
                System.out.println("Tipo de autor: " + track.authores[i].type);
            }
        }
    }
}
