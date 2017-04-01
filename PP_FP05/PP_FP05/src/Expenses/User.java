package Expenses;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

    private static final int ID_SIZE = 3;
    /**
     * Identificação do utilizador, constituído por três caracteres
     */
    protected char[] id;
    /**
     * Nome do utilizador ({@link User})
     */
    protected String name;
    /**
     * Email do utilizador ({@link User})
     */
    protected String email;
    /**
     * Data de nascimento (dia/mês/ano) do utilizador ({@link User})
     */
    protected  GregorianCalendar  birthDate;
    /**
     * Despesas ({@link Expenses}) do utilizador ({@link User})
     */
    protected Expense[] expenses;
    /**
     * Valor da constribuição do utilizador ({@link User})
     */
    protected int valor_contribuicao;
    /**
     * Data do pagamento da contribuição do utilizador ({@link User})
     */
    protected  GregorianCalendar  data_contribuicao;
    /**
     * Tipo de utilizador (Premium ou Free)
     */
    protected String tipoUser;

    /**
     * Número de dias restantes do estado do utilizador
     */
    protected int numeroDiasEstatuto;
    /**
     * Método construtor para a criação de uma instâcnia de {@link User}, tendo
     * por base todos os atributos de {@link User}
     *
     * @param tempId Identificação do utilizador constituída por 3 caracteres
     * @param tempName Nome do utilizador ({@link name})
     * @param tempEmail Email do utilizador ({@link email})
     * @param tempBirthDate Data de nascimento ({@link Date}) do utilizador
     * ({@link User})
     * @param tempExpenses Colecção de despesas ({@link Expenses}) do utilizador
     * ({@link User})
     * @param tempValorContribuicao Valor da contribuição do utilizador
     * ({@link User})
     * @param tempDataContribuicao Data da contribuição do utilizador ({@link User})
     * ({@link User})
     */
    User(char[] tempId, String tempName, String tempEmail,  GregorianCalendar  tempBirthDate, Expense[] tempExpenses, int tempValorContribuicao,
             GregorianCalendar  tempDataContribuicao, String tempTipoUser) {
        if(tempId.length > 3){
            System.out.println("A identificação do utilizador tem que ter 3 caracteres.");
        } else {
             id = tempId;
        }
       
        if(tempName.length() < 0){
            System.out.println("O nome tem que ser preenchido.");
        } else {
             name = tempName;
        }
        
         if(tempEmail.length() < 0){
            System.out.println("O email tem que ser preenchido.");
        } else {
            email = tempEmail;
        }
       
          if (tempBirthDate.get(Calendar.DAY_OF_WEEK) <= 0 || tempBirthDate.get(Calendar.DAY_OF_WEEK) > 31 || tempBirthDate.get(Calendar.MONTH)<= 0 ||  tempBirthDate.get(Calendar.MONTH) > 12 ||  tempBirthDate.get(Calendar.YEAR) > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
             birthDate = tempBirthDate;
        }
        
          if(tempExpenses.length <= 0) {
              System.out.println("O utilizador tem que ter pelo menos uma despesa.");
          } else {
                 expenses = tempExpenses;      
          }

        if (tempValorContribuicao >= 1) {
            valor_contribuicao = tempValorContribuicao;
            data_contribuicao = tempDataContribuicao;
            tipoUser = "Premium";
            numeroDiasEstatuto = valor_contribuicao * 5;
            System.out.println("Numero de dias com estatuto Premium > " + numeroDiasEstatuto);
        } else {
            valor_contribuicao = tempValorContribuicao;
            data_contribuicao = tempDataContribuicao;
            tipoUser = "Free";           
        }
    }
}