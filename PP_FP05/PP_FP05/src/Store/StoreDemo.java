package Store;
import Cd.Author;
import Cd.Cd;
import Cd.Track;

/**
 * <h3>
 * ESTGF - Escola Superior de Tecnologia e Gestão de Felgueiras<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the user structure
 * </p>
 */
public class StoreDemo {

    public static void main(String[] args) {
        float totalPrice = 0.0f;
        Author[] a = {
            new Author("The Lummineers", 24, "Porto", 123456798, 123678905, "Vendedor"),
            new Author("Martin Shultz", 30, "Lisboa", 123456798, 123012345, "Vendedor")
        };
        Track[] t = {
            new Track(1, "Ho Hey!", 90, a),
            new Track(2, "Stubborn Love", 105, a)
        };

        Track[] t2 = {
            new Track(1, "Ho!", 99, a),
            new Track(2, "Love", 100, a)
        };

        Cd[] cds = {
            new Cd("Cd1", 2016, "Editor X", t, 19),
            new Cd("Cd2", 2017, "Editor Y", t2, 10),
            new Cd("Cd3", 2014, "Editor Z", t2, 9),
            new Cd("Cd4", 2011, "Editor Q", t2, 14)
        };

        Sale sale = new Sale(1, 18, 3, 2017, cds);

        System.out.println("Sale Id: " + sale.saleId);
        System.out.println("Sale date: " + sale.day + "-" + sale.month + "-" + sale.year);
        System.out.println(" > List of cds");

        for (int i = 0; i < cds.length; i++) {
            System.out.println("Nome do Cd: " + cds[i].name);
            System.out.println("Ano de lançamento: " + cds[i].year);
            System.out.println("Editora: " + cds[i].editor);
            System.out.println("Preco: " + cds[i].price + " €");
            totalPrice += cds[i].price;
        }
        System.out.println("Total price: " + totalPrice + " €");
    }
}
