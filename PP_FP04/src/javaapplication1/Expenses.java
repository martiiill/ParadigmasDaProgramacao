
/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the expense structure
 * </p>
 */
public class Expenses {
    
    private static final int NUMBER_OF_DAYS = 31; //para o mes de marco
    
    //Para despesas com o automovel
    protected static int number1;
    
    protected static double[] carValues = new double[NUMBER_OF_DAYS]; //em euros
    protected static char[] descriptionCar = new char[]{'C','A','R'};
    
    protected static int number2;
    protected static double[] foodValues = new double[NUMBER_OF_DAYS]; //em euros
    protected static char[] descriptionFood = new char[]{'F','O','O','D'};    
}
