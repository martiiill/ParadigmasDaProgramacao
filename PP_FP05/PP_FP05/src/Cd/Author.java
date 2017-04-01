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
 * Class that represents the cd structure
 * </p>
 */
public class Author {

    /**
     * Nome do autor
     */
    protected String name;

    /**
     * Idade do autor
     */
    protected int age;

    /**
     * Morada do autor
     */
    protected String address;

    /**
     * Nif do autor
     */
    protected int NIF;

    /**
     * Nib do autor
     */
    protected int NIB;

    /**
     * Tipo de autor
     */
    protected String type;

    public Author(String tempName, int tempAge, String tempAddress, int tempNIF, int tempNIB, String tempType) {
        if (tempName.isEmpty() == true) {
            System.out.println("Tem que introduzir um nome");
        } else {
            name = tempName;
        }

        if (tempAge < 18 || tempAge > 70) {
            System.out.println("Tem que ter mais que 18 anos e menos de 70.");
        } else {
            age = tempAge;
        }
        
        if (tempAddress.isEmpty() == true) {
            System.out.println("Tem que introduzir uma morada");
        } else {
            address = tempAddress;
        }

        if (tempNIF < 9 || tempNIF > 9) {
            System.out.println("O numero de identificação fiscal tem que ter 9 digitos.");
        } else {
            NIF = tempNIF;
        }

        if (tempNIB < 21 || tempNIB > 21) {
            System.out.println("O numero de identicacao bancaria tem que ter 21 digitos.");
        } else {
            NIB = tempNIB;
        }

        if (!"Vendedor".equals(tempType) || !"Nao vendedor".equals(tempType)) { // substitui o igual!
            System.out.println("Esse tipo de autor nao existe.");
        } else {
            type = tempType;
        }
    }
}
