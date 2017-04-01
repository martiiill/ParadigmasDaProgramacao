
package pp_fp04.book;
/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the book demo structure
 * </p>
 */
public class BookDemo {

    static Book book1;

    public static void main(String[] args) {
        book1.originalTitle = new char[]{'O', ' ', 'P', 'a', 's', 't', 'o', 'r', ' ', 'e', ' ', 's', 'u', 'a', 's', ' ', 'o', 'v', 'e', 'l', 'h', 'i', 'n', 'h', 'a', 's', '.'};
        book1.editor = new char[]{'E', 'd', 'i', 't', 'o', 'r', ' ', 'B', 'r', 'a', 's', 'i', 'l'};

        book1.authors[0].acronimo = new char[]{'A', 'A', 'M'};
        book1.authors[0].name = new char[]{'A', 'n', 'a', ' ', 'M', 'a', 'r', 't', 'i', 'n', 's'};
        book1.authors[0].nacionality = new char[]{'R', 'u', 's', 's', 'a'};

        book1.year = 2000;
        book1.pages = 550;

        book1.cotacao[0] = 5;
        book1.cotacao[1] = 7;
        book1.cotacao[2] = 8;

        System.out.println("----------- Book ---------------");
        System.out.print("Original Title: ");
        System.out.println(book1.originalTitle);
        System.out.print("Editor: ");
        System.out.println(book1.editor);

        System.out.println(":: Authors");
        System.out.println("Author 1:");
        System.out.print("Acronimo: ");
        System.out.println(book1.authors[0].acronimo);
        System.out.print("Name: ");
        System.out.println(book1.authors[0].name);
        System.out.print("Nacionality: ");
        System.out.println(book1.authors[0].nacionality);
              
        book1.authors[1].acronimo = new char[]{'F', 'M', 'D'};
        book1.authors[1].name = new char[]{'F', 'r', 'a', 'n', 'c', 'i', 's', 'c', 'o', ' ', 'M', 'a', 'c', 'h', 'a', 'd', 'o'};
        book1.authors[1].nacionality = new char[]{'S', 'p', 'a', 'n', 'i', 's', 'h'};     

        System.out.println("Author 2:");
        System.out.print("Acronimo: ");
        System.out.println(book1.authors[1].acronimo);
        System.out.print("Name: ");
        System.out.println(book1.authors[1].name);
        System.out.print("Nacionality: ");
        System.out.println(book1.authors[1].nacionality);

        System.out.print("Year:");
        System.out.println(book1.year);
        System.out.print("Pages: ");
        System.out.println(book1.pages);
        System.out.print("Cotacao 1: ");
        System.out.println(book1.cotacao[0]);
        System.out.print("Cotacao 2: ");
        System.out.println(book1.cotacao[1]);
        System.out.print("Cotacao 3: ");
        System.out.println(book1.cotacao[2]);
    }
}
