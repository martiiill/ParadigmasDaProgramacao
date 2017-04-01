/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses;

import Expenses.Enums.CurrencyType;
import Expenses.Enums.ExpenseType;
import Expenses.Enums.GenderType;
import java.util.Arrays;

/**
 *
 * @author anaal
 */
public class ExpenseDemo {

    public static void main(String[] args) {
        char[] id1 = new char[]{'A', 'A', 'M'};
        Date Data_ANA = new Date(20, 8, 1995);
        Date Data_EX = new Date(20, 3, 2016);
        Date Data_EX1 = new Date(25, 4, 2016);
        Date Data_EX2 = new Date(22, 2, 2016);

        Expense[] e1 = {
            new Expense(0, ExpenseType.AUTOMOVEL, 20, Data_EX, CurrencyType.EUROS, "Expense number 0"),
            new Expense(1, ExpenseType.ALIMENTAR, 30f, Data_EX1, CurrencyType.EUROS, "Expense number 1"),
            new Expense(2, ExpenseType.OUTRO, 3333f, Data_EX2, CurrencyType.EUROS, "Expense number 2")
        };
        
        User u1 = new User(id1, "Ana", "anaalicemartins@gmail.com", Data_ANA, 4, Data_EX, GenderType.FEMININO);

        u1.setExpenses(e1);

        //u1.removeExpense(1);       
        //u1.removeExpenseMonth(2);
          
        System.out.println("User: " + Arrays.toString(u1.getId()));
        System.out.println("Name: " + u1.getName());
        System.out.println(GenderType.GenderTypeToString(u1.getGender()));
        System.out.println("Email: " + u1.getEmail());
        System.out.println("Birth Date: " + u1.getBirthDate().getDay() + "-" + u1.getBirthDate().getMonth() + "-" + u1.getBirthDate().getYear());

        if ("Premium".equals(u1.getTipoUser())) {
            System.out.println("User type: " + u1.getTipoUser());
            System.out.println("Days left:" + u1.getNumeroDiasEstatuto());
            System.out.println("Value paid: " + u1.getValor_contribuicao() + " euros.");
            System.out.println("Date: " + u1.getData_contribuicao().getDay() + "-" + u1.getData_contribuicao().getMonth() + "-" + u1.getData_contribuicao().getYear());
        } else {
            System.out.println("User type: " + u1.getTipoUser());
        }
        
        for (int i = 0; i < u1.getNumberExpenses(); i++) {
            System.out.println("Expense number: " + u1.getExpenses()[i].getNumber());      
            System.out.println("Description: " + u1.getExpenses()[i].getDescription());
            System.out.println("Date: " + u1.getExpenses()[i].getData().getDay() + "-" + u1.getExpenses()[i].getData().getMonth() + "-" + u1.getExpenses()[i].getData().getYear());
            System.out.println("Value: " + u1.getExpenses()[i].getValue() + " " + CurrencyType.CurrencyTypeToString(u1.getExpenses()[i].getCurrency()));
        }
        
        u1.editDescriptionExpense(0, "Expense number 0000000000000011111111111111111111111111100000000000");
        System.out.println("After edit description expense number " + u1.getExpenses()[0].getNumber() + ": " + u1.getExpenses()[0].getDescription());
    }
}
