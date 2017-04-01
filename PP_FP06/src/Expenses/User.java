package Expenses;

import Expenses.Enums.GenderType;

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
    private static final int MAX_EXPENSE = 30;
    /**
     * Identificação do utilizador, constituído por três caracteres
     */
    private char[] id;
    /**
     * Nome do utilizador ({@link User})
     */
    private String name;
    /**
     * Email do utilizador ({@link User})
     */
    private String email;
    /**
     * Data de nascimento (dia/mês/ano) do utilizador ({@link User})
     */
    private Date birthDate;
    /**
     * Despesas ({@link Expenses}) do utilizador ({@link User})
     */
    private Expense[] expenses;
    /**
     * Valor da constribuição do utilizador ({@link User})
     */
    private int valor_contribuicao;
    /**
     * Data do pagamento da contribuição do utilizador ({@link User})
     */
    private Date data_contribuicao;
    /**
     * Tipo de utilizador (Premium ou Free)
     */
    private String tipoUser;

    /**
     * Número de dias restantes do estado do utilizador
     */
    private int numeroDiasEstatuto;

    /**
     * Genero do user
     */
    private GenderType gender;

    private int numberExpenses;

    public User(char[] id, String name, String email, Date birthDate, int valorContribuicao, Date dataContribuicao, GenderType gender) {
        expenses = new Expense[MAX_EXPENSE];
        numberExpenses = 0;

        if (id.length > 3) {
            System.out.println("A identificação do utilizador tem que ter 3 caracteres.");
        } else {
            this.id = id;
        }

        if (name.length() < 0) {
            System.out.println("O nome tem que ser preenchido.");
        } else {
            this.name = name;
        }

        if (email.length() < 0) {
            System.out.println("O email tem que ser preenchido.");
        } else {
            this.email = email;
        }

        if (birthDate.getDay() <= 0 || birthDate.getDay() > 31 || birthDate.getMonth() <= 0 || birthDate.getMonth() > 12 || birthDate.getYear() > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            this.birthDate = birthDate;
        }

        if (valorContribuicao >= 1) {
            this.valor_contribuicao = valorContribuicao;
            if (dataContribuicao.getDay() <= 0 || dataContribuicao.getDay() > 31 || dataContribuicao.getMonth() <= 0 || dataContribuicao.getMonth() > 12 || dataContribuicao.getYear() > 2017) {
                System.out.println("A data tem que ter valores válidos.");
            } else {
                this.data_contribuicao = dataContribuicao;
            }
            this.tipoUser = "Premium";
            this.numeroDiasEstatuto = valor_contribuicao * 5;
        } else {
            this.valor_contribuicao = valorContribuicao;
            if (dataContribuicao.getDay() <= 0 || dataContribuicao.getDay() > 31 || dataContribuicao.getMonth() <= 0 || dataContribuicao.getMonth() > 12 || dataContribuicao.getYear() > 2017) {
                System.out.println("A data tem que ter valores válidos.");
            } else {
                this.data_contribuicao = dataContribuicao;
            }
            this.tipoUser = "Free";
        }
        this.gender = gender;
    }

    public char[] getId() {
        return id;
    }

    public void setId(char[] id) {
        if (id.length > 3) {
            System.out.println("A identificação do utilizador tem que ter 3 caracteres.");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 0) {
            System.out.println("O nome tem que ser preenchido.");
        } else {
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.length() < 0) {
            System.out.println("O email tem que ser preenchido.");
        } else {
            this.email = email;
        }
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate.getDay() <= 0 || birthDate.getDay() > 31 || birthDate.getMonth() <= 0 || birthDate.getMonth() > 12 || birthDate.getYear() > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            this.birthDate = birthDate;
        }
    }

    public Expense[] getExpenses() {
        return expenses;
    }

    public void setExpenses(Expense[] expenses) {
        int i;
        this.expenses = new Expense[MAX_EXPENSE];
        for (i = 0; i < MAX_EXPENSE && i < expenses.length; i++) {
           this.expenses[i] = expenses[i];
        }
        numberExpenses = i;
    }

    public int getValor_contribuicao() {
        return valor_contribuicao;
    }

    public void setValor_contribuicao(int valor_contribuicao) {
        if (valor_contribuicao < 0) {
            System.out.println("O valor da contribuicao tem que ser positivo.");
        } else {
            this.valor_contribuicao = valor_contribuicao;
        }
    }

    public Date getData_contribuicao() {
        return data_contribuicao;
    }

    public void setData_contribuicao(Date dataContribuicao) {
        if (dataContribuicao.getDay() <= 0 || dataContribuicao.getDay() > 31 || dataContribuicao.getMonth() <= 0 || dataContribuicao.getMonth() > 12 || dataContribuicao.getYear() > 2017) {
            System.out.println("A data tem que ter valores válidos.");
        } else {
            this.data_contribuicao = dataContribuicao;
        }
    }

    public String getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    public int getNumeroDiasEstatuto() {
        return numeroDiasEstatuto;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public int getNumberExpenses() {
        return numberExpenses;
    }

    public boolean removeExpense(int idExpense) {
        for (int i = 0; i < numberExpenses; i++) {
            if (expenses[i].getNumber() == idExpense) {
                while (i < numberExpenses - 1) {                   
                    expenses[i] = expenses[i + 1];
                    i++;
                }
                numberExpenses--;
                return true;
            }
        }
        return false;
    }

    public boolean removeExpenseMonth(int month) {
        for (int i = 0; i < numberExpenses; i++) {
            if (expenses[i].getData().getMonth() == month) {
                while (i < numberExpenses - 1) {
                    expenses[i] = expenses[i + 1];
                    i++;
                }
                numberExpenses--;
                return true;
            }
        }
        return false;
    }

    public void editDescriptionExpense(int idExpense, String description) {
        for (int i = 0; i < numberExpenses; i++) {
            if (this.getExpenses()[i].getNumber() == idExpense) {
                this.getExpenses()[idExpense].setDescription(description);
            }          
        }
    }
}
