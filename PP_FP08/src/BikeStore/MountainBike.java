package BikeStore;

import BikeStore.Enums.MountainBikeSuspension;
import ObjectManagement.BikeToolsManagement;
import java.util.Arrays;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class MountainBike extends Bicycle {
    private static final int MAX_TOOLS = 10;
    /**
     * Numero de luzes.
     */
    private int numberOfLights;
    /**
     * Tipo de suspensao.
     */
    private MountainBikeSuspension suspension;
    /**
     * Utensilios existentes neste tipo de bicicleta.
     */
    private BikeTools[] bikeTools;

    /**
     * Numero de utensilios de um bicicleta.
     */
    private int numberOfTools;
    
    private BikeToolsManagement[] bikeTools_management;

    /**
     * Método construtor para a criacao de uma instancia de {@link MountainBike
     * bicicleta de montanha} sem utensilios.
     *
     * @param numberOfLights Numero de luzes.
     * @param suspension Tipo de suspensao.
     * @param id Identificador da bicicleta.
     * @param numberOfGears Numero de velocidades.
     * @param mainColor Cor da bicicleta.
     * @param wheelsize Diametro das rodas.
     * @param bikeLenght Comprimento da bicicleta.
     * @param adjustableSeatpost Saber se assento é ajustavel.
     * @param price Preco de bicicleta
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension, int id, int numberOfGears, String mainColor, float wheelsize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGears, mainColor, wheelsize, bikeLenght, adjustableSeatpost, price);
        bikeTools = new BikeTools[MAX_TOOLS];
        numberOfTools = 0;
        if (numberOfLights < 0) {
            System.out.println("O numero de luzes tem que ser positivo.");
        } else {
            this.numberOfLights = numberOfLights;
        }
        this.suspension = suspension;
    }

    /**
     * Método construtor para a criacao de uma instancia de {@link MountainBike
     * bicicleta de montanha} com utensilios.
     *
     * @param bikeTools Colecao de utensilios.
     * @param numberOfLights Numero de luzes.
     * @param suspension Tipo de suspensao.
     * @param id Identificador da bicicleta.
     * @param numberOfGears Numero de velocidades.
     * @param mainColor Cor da bicicleta.
     * @param wheelsize Diametro das rodas.
     * @param bikeLenght Comprimento da bicicleta.
     * @param adjustableSeatpost Saber se assento é ajustavel.
     * @param price Preco de bicicleta
     */
    public MountainBike(BikeTools[] bikeTools, int numberOfLights, MountainBikeSuspension suspension, int id, int numberOfGears, String mainColor, float wheelsize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGears, mainColor, wheelsize, bikeLenght, adjustableSeatpost, price);
        this.bikeTools = bikeTools;
        numberOfTools = 0;
        if (numberOfLights < 0) {
            System.out.println("O numero de luzes tem que ser positivo.");
        } else {
            this.numberOfLights = numberOfLights;
        }
        this.suspension = suspension;
    }

    /**
     * Retorna o {@link MountainBike#numberOfLights} da bicicleta de montanha.
     *
     * @return
     */
    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        if (numberOfLights < 0) {
            System.out.println("O numero de luzes tem que ser positivo.");
        } else {
            this.numberOfLights = numberOfLights;
        }
    }

    public int getNumberOfTools() {
        return numberOfTools;
    }

    public void setNumberOfTools(int numberOfTools) {
        this.numberOfTools = numberOfTools;
    }

    /**
     * Retorna o tipo de {@link MountainBike#suspension} da bicicleta de
     * montanha.
     *
     * @return
     */
    public MountainBikeSuspension getSuspension() {
        return suspension;
    }

    public void setSuspension(MountainBikeSuspension suspension) {
        this.suspension = suspension;
    }

    /**
     * Retorna os {@link MountainBike#bikeTools} da bicicleta de montanha.
     *
     * @return
     */
    public BikeTools[] getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(BikeTools[] bikeTools) {
        this.bikeTools = bikeTools;
    }

    public BikeToolsManagement[] getBikeTools_management() {
        return bikeTools_management;
    }

    public void setBikeTools_management(BikeToolsManagement[] bikeTools_management) {
        this.bikeTools_management = bikeTools_management;
    }  

    /**
     * Metodo que permite a insercao de um utensilio na colecao de utensilios.
     *
     * @param bk Uma colecao de utensilios
     * @return valor booleano que indica o sucesso ou insucesso do metodo
     */
    public boolean addBikeTools(BikeTools bk) {
        if (numberOfTools == bikeTools.length) {
            BikeTools[] bt = new BikeTools[numberOfTools +5];
            for (int i = 0; i < numberOfTools; i++) {
                bt[i] = this.bikeTools[i];
                bt[numberOfTools] = bk;
                numberOfTools++;
                this.bikeTools = bt;
            }
        } else {
           bikeTools[numberOfTools] = bk;
            numberOfTools++;
        }
        return true;
    }

    /**
     * Metodo que permite a edicao de um utensilio na colecao de utensilios.
     *
     * @param id_bikeTools Identificador de um utensilio.
     * @param name Nome do utensilio.
     * @param descricao Descricao do utensilio.
     * @return valor booleano que indica o sucesso ou insucesso do metodo
     */
    public boolean editBikeTools(int id_bikeTools, String name, String descricao) {
        for (int i = 0; i < numberOfTools; i++) {
            if (id_bikeTools == bikeTools[i].getId()) {
                bikeTools[i].setId(id_bikeTools);
                bikeTools[i].setName(name);
                bikeTools[i].setDescription(descricao);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Metodo que permite a remocao de um utensilio na colecao de utensilios.
     *
     * @param id_bikeTools Identificador do utensilio.
     * @return valor booleano que indica o sucesso ou insucesso do metodo
     */
    public boolean removeBikeTools(int id_bikeTools) {
        BikeTools b;
        b = bikeTools[id_bikeTools];
        for(int i = id_bikeTools; i < this.numberOfTools - 1; i++){
            bikeTools[i] = bikeTools[i+1];
            i--;
        }
        this.numberOfTools--;
        return true;
    }

    /**
     * Metodo que permite a listagem dos elementos existentes numa colecao de
     * utensilios.
     *
     * @param bike_tools Colecao de utensilios.
     */
    public void listBikeTools(BikeTools[] bike_tools) {
        for (int i = 0; i < numberOfTools; i++) {
            System.out.println("Id: " + bike_tools[i].getId());
            System.out.println("Name: " + bike_tools[i].getName());
            System.out.println("Decription: " + bike_tools[i].getDescription() + "\n");
        }
    }

    @Override
    public String toString() {
        return "MountainBike{" + "numberOfLights=" + numberOfLights + ", suspension=" + suspension + ", bikeTools=" + Arrays.toString(bikeTools) + ", numberOfTools=" + numberOfTools + ", bikeTools_management=" + Arrays.toString(bikeTools_management) + '}';
    }  
}
