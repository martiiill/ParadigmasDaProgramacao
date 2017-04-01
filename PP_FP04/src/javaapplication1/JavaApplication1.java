
/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong> Description: </strong><br>
 * Class that represents the user demo structure
 * </p>
 */
import pp_fp04.exchange.CurrencyRates;

public class JavaApplication1 {

    static User user1;
    static User user2;
    private static int totalFoodValues = 0, totalCarValues = 0,
            totalExpenses = 0, totalFoodValuesDolar = 0, totalCarValuesDolar = 0,
            totalExpensesDolar = 0, totalFoodValuesIene = 0, totalCarValuesIene = 0,
            totalExpensesIene = 0, totalFoodValuesLibra = 0, totalCarValuesLibra = 0,
            totalExpensesLibra = 0;
    private static final int months = 62;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //User user1 = null; //so existe no main. Nao tem membros
        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';

        user1.name = new char[]{'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[]{'b', 'm', 'o', '@', 'e', 's', 't', 'g', '.', 'i', 'p', 'p', '.', 'p', 't'};

        user1.expenses.number1 = 1;
        user1.expenses.carValues[20] = 500;
        user1.expenses.carValues[22] = 700;
        user1.expenses.number2 = 2;
        user1.expenses.foodValues[28] = 100;
        user1.expenses.foodValues[29] = 650;

        for (int i = 0; i < user1.expenses.carValues.length; i++) {
            totalCarValues += user1.expenses.carValues[i];
        }

        for (int i = 0; i < user1.expenses.foodValues.length; i++) {
            totalFoodValues += user1.expenses.foodValues[i];
        }

        totalExpenses = totalCarValues + totalFoodValues;
        totalFoodValuesDolar = (int) (totalFoodValues * CurrencyRates.euroToDolar);
        totalCarValuesDolar = (int) (totalCarValues * CurrencyRates.euroToDolar);
        totalExpensesDolar = (int) (totalExpenses * CurrencyRates.euroToDolar);

        totalFoodValuesIene = (int) (totalFoodValues * CurrencyRates.euroToIene);
        totalCarValuesIene = (int) (totalCarValues * CurrencyRates.euroToIene);
        totalExpensesIene = (int) (totalExpenses * CurrencyRates.euroToIene);

        totalFoodValuesLibra = (int) (totalFoodValues * CurrencyRates.euroToGBP);
        totalCarValuesLibra = (int) (totalCarValues * CurrencyRates.euroToGBP);
        totalExpensesLibra = (int) (totalExpenses * CurrencyRates.euroToGBP);

        System.out.println("---------- User 1 --------------");
        System.out.print("ID : ");
        System.out.println(user1.id);
        System.out.print("Name : ");
        System.out.println(user1.name);
        System.out.print("Email : ");
        System.out.println(user1.email);
        System.out.println("~ Expenses");
        System.out.print(" -> Number 1: ");
        System.out.println(user1.expenses.number1);
        System.out.print(" -> Car Values: ");
        System.out.println(user1.expenses.carValues[20]);
        System.out.print(" -> Description Car: ");
        System.out.println(user1.expenses.descriptionCar);
        System.out.print(" -> Number 2: ");
        System.out.println(user1.expenses.number2);
        System.out.print(" -> Food Values: ");
        System.out.println(user1.expenses.foodValues[28]);
        System.out.print(" -> Description Food: ");
        System.out.println(user1.expenses.descriptionFood);
        System.out.print(" -> Total Expenses Car Values: ");
        System.out.println(totalCarValues + " euros");
        System.out.print(" -> Total Expenses Food Values: ");
        System.out.println(totalFoodValues + " euros");
        System.out.print(" -> Total Expenses: ");
        System.out.println(totalExpenses + " euros");
        System.out.print(" -> Average Expenses: ");
        System.out.println(totalExpenses / months + " euros");
        System.out.print(" -> Total Expenses Car Values (dolares): ");
        System.out.println(totalCarValuesDolar + " dolares");
        System.out.print(" -> Total Expenses Food Values (dolares): ");
        System.out.println(totalFoodValuesDolar + " dolares");
        System.out.print(" -> Total Expenses (dolares): ");
        System.out.println(totalExpensesDolar + " dolares");
        System.out.print(" -> Average Expenses (dolares): ");
        System.out.println((totalExpenses / months) * CurrencyRates.euroToDolar + " dolares");
        System.out.print(" -> Total Expenses Car Values (ienes): ");
        System.out.println(totalCarValuesIene + " ienes");
        System.out.print(" -> Total Expenses Food Values (ienes): ");
        System.out.println(totalFoodValuesIene + " ienes");
        System.out.print(" -> Total Expenses (dolares): ");
        System.out.println(totalExpensesIene + " ienes");
        System.out.print(" -> Average Expenses (ienes): ");
        System.out.println((totalExpenses / months) * CurrencyRates.euroToIene + " ienes");
        System.out.print(" -> Total Expenses Car Values (libras): ");
        System.out.println(totalCarValuesLibra + " libras");
        System.out.print(" -> Total Expenses Food Values (libras): ");
        System.out.println(totalFoodValuesLibra + " libras");
        System.out.print(" -> Total Expenses (libras): ");
        System.out.println(totalExpensesLibra + " libras");
        System.out.print(" -> Average Expenses (libras): ");
        System.out.println((totalExpenses / months) * CurrencyRates.euroToGBP + " libras\n");

        user2.id[0] = 'A';
        user2.id[1] = 'A';
        user2.id[2] = 'M';

        user2.name = new char[]{'A', 'n', 'a', ' ', 'M', 'a', 'r', 't', 'i', 'n', 's'};
        user2.email = new char[]{'a', 'a', 'm', '@', 'e', 's', 't', 'g', '.', 'i', 'p', 'p', '.', 'p', 't'};

        System.out.println("---------- User 2 --------------");
        System.out.print("ID : ");
        System.out.println(user2.id);
        System.out.print("Name : ");
        System.out.println(user2.name);
        System.out.print("Email : ");
        System.out.println(user2.email);
    }
}
