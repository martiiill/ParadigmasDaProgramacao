package Store;

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
public class User {

    /**
     * Nome do utilizador
     */
    protected String name;

    /**
     * Idade do utilizador
     */
    protected int age;

    /**
     * Email do utilizador
     */
    protected String email;

    /**
     * Método construtor que permite criar uma instância de user
     *
     * @param tempName nome
     * @param tempAge idade
     * @param tempEmail email
     */
    User(String tempName, int tempAge, String tempEmail) {
        if (tempName.isEmpty() == true) {
            System.out.println("Um utilizador tem quer ter um nome.");
        } else {
            name = tempName;
        }

        if (tempAge < 18 || tempAge > 70) {
            System.out.println("Um utilizador tem que ter idade entre 18 e 70 anos.");
        } else {
            age = tempAge;
        }

        if (tempEmail.isEmpty() == true) {
            System.out.println("Um utilizador tem que ter um mail.");
        } else {
            email = tempEmail;
        }
    }
}
