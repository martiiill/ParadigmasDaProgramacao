
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
 * Class that represents the book structure
 * </p>
 */

public class Book {

    private static final int sizeAuthors = 2, sizeCriticals = 3;
    protected static char[] originalTitle;
    protected static char[] editor;
    protected static Authors[] authors = new Authors[sizeAuthors];
    protected static int year;
    protected static int pages;
    protected static int[] cotacao = new int[sizeCriticals];
}
