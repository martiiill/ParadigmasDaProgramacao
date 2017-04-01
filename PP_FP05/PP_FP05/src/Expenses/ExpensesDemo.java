
package Expenses;

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
 * Class that represents the expenses demo structure
 * </p>
 */
public class ExpensesDemo {

    public static void main(String[] args) {
        int contadorDespesaAutomovel = 0, contadorDespesasAlimentar = 0, contadorDespesasOutro = 0;
        float valorDespesasJan = 0.0f;
        String despesaMaisDispensiosa;
        /**
         * user 1 e expense 0
         */
        char[] id_user1 = new char[]{'1', '1', '1'};
        GregorianCalendar data_user1 = new GregorianCalendar(20, 8, 1995);
        GregorianCalendar data_contribuicao_user1 = new GregorianCalendar(1, 1, 2016);
        GregorianCalendar data_expense1 = new GregorianCalendar(10, 5, 2017);
        Expense[] expenses1 = new Expense[3];
        expenses1[0] = new Expense(1, "Automovel", 10, data_expense1, "Euro");
        expenses1[1] = new Expense(2, "Alimentar", 15, data_expense1, "Euro");
        expenses1[2] = new Expense(3, "Outro", 20, data_expense1, "Euro");
        User user1 = new User(id_user1, "Ana Martins", "anaalicemartins@hotmail.com", data_user1, expenses1, 30, data_contribuicao_user1, "Free");

        /**
         * user 2 e expense 1
         */
        char[] id_user2 = new char[]{'2', '2', '2'};
        GregorianCalendar data_user2 = new GregorianCalendar(5, 9, 2012);
        GregorianCalendar data_contribuicao_user2 = new GregorianCalendar(2, 1, 2016);
        GregorianCalendar data_expense2 = new GregorianCalendar(29, 11, 2014);
        Expense[] expenses2 = new Expense[2];
        expenses2[0] = new Expense(1, "Tecnologia", 20, data_expense2, "Euro");
        expenses2[1] = new Expense(2, "Armas", 150, data_expense2, "Dolar");
        User user2 = new User(id_user2, "Boss", "dog_boss@outlook.com", data_user2, expenses2, 40, data_contribuicao_user2, "Free");

        System.out.println("--- User 1 ---\n" + "ID->" + user1.id[0] + user1.id[1] + user1.id[2] + "\n" + "Name -> " + user1.name + "\n"
                + "Email -> " + user1.email + "\n" + "Date -> " + user1.birthDate.toString() + "\nUser type -> " + user1.tipoUser);

        System.out.println("---- Expenses ----\n" + "Number -> " + user1.expenses[0].number + "\nType->" + user1.expenses[0].type + "\nValue->" + user1.expenses[0].value
                + "\nDate -> " + user1.expenses[0].data.toString() + "\n\n");
        System.out.println("Number->" + user1.expenses[1].number + "\nType->" + user1.expenses[1].type + "\nValue->" + user1.expenses[1].value
                + "\nDate->" + user1.expenses[1].data.toString() + "\n");

        System.out.println("--- User 2 ---\n" + "ID ->" + user2.id[0] + user2.id[1] + user2.id[2] + "\n" + "Name->" + user2.name + "\n" + "Email -> " + user2.email + "\n"
                + "Date->" + user2.birthDate.toString() + "\nUser type -> " + user1.tipoUser);
        System.out.println("--- Expenses ---\n" + "Number->" + user2.expenses[0].number + "\nType -> " + user2.expenses[0].type + "\nValue -> " + user2.expenses[0].value
                + "\nDate->" + user2.expenses[0].data.toString() + "\n");
        System.out.println("Number -> " + user2.expenses[1].number + "\nType -> " + user2.expenses[1].type + "\nValue -> " + user2.expenses[1].value
                + "\nDate -> " + user2.expenses[1].data.toString() + "\n");

        if ("Automovel".equals(expenses1[0].type) || "Automovel".equals(expenses1[1].type) || "Automovel".equals(expenses1[2].type)) {
            contadorDespesaAutomovel = contadorDespesaAutomovel + 1;
        } else if ("Alimentar".equals(expenses1[0].type) || "Alimentar".equals(expenses1[1].type) || "Alimentar".equals(expenses1[2].type)) {
            contadorDespesasAlimentar = contadorDespesasAlimentar + 1;
        } else {
            contadorDespesasOutro = contadorDespesasOutro + 1;
        }

        if (contadorDespesaAutomovel > contadorDespesasAlimentar && contadorDespesaAutomovel > contadorDespesasOutro) {
            despesaMaisDispensiosa = "Automóvel";
        } else if (contadorDespesasAlimentar > contadorDespesasAlimentar && contadorDespesasAlimentar > contadorDespesasOutro) {
            despesaMaisDispensiosa = "Alimentar";
        } else {
            despesaMaisDispensiosa = "Outro";
        }

        System.out.println(" > Tipo de despesa mais dispendiosa num determinado intervalo de tempo");
        System.out.println("Na expense1, o tipo de despesa mais dispendiosa é " + despesaMaisDispensiosa);

        
        if(data_expense1.get(GregorianCalendar.JANUARY) == GregorianCalendar.JANUARY) {
            valorDespesasJan = expenses1[0].value + expenses1[1].value + expenses1[2].value;
        }
        System.out.println("Despesas mais elevadas da Expense 1 em 2017");
        System.out.println("Janeiro > " + valorDespesasJan);
    }
}
