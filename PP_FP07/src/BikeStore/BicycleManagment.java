package BikeStore;

import BikeStore.Enums.MountainBikeSuspension;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class BicycleManagment {

    /**
     * Numero maximo de bicicletas que pode ter.
     */
    private static final int MAX_BYCICLES = 20;
    /**
     * Colecao de bicicletas
     */
    private Bicycle[] bicycles;
    /**
     * Numero de bicicletas que existem.
     */
    private int numberOfBicycles;

    /**
     * Metodo construtor que permite criar uma instancia de
     * {@link BicycleManagment bicicleta}
     *
     * @param bicycles colecao de bicicletas
     */
    public BicycleManagment(Bicycle[] bicycles) {
        this.bicycles = bicycles;
    }

    /**
     * Metodo construtor que permite criar uma instancia de
     * {@link BicycleManagment}
     */
    public BicycleManagment() {
        bicycles = new Bicycle[MAX_BYCICLES];
        numberOfBicycles = 0;
    }

    /**
     * Retorna uma colecao de {@link BicycleManagment#bicycles}.
     *
     * @return
     */
    public Bicycle[] getBicycles() {
        return bicycles;
    }

    public void setBicycles(Bicycle[] bicycles) {
        this.bicycles = bicycles;
    }

    /**
     * Retorna o {@link BicycleManagment#numberOfBicycles}.
     *
     * @return
     */
    public int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    /**
     * Metodo que permite adicionar uma bicicleta a uma colecao de bicicletas
     *
     * @param b bicicleta que quer adicionar
     * @return valor booleano que indica o sucesso ou insucesso da operacao
     */
    public boolean addBicycles(Bicycle b) {
        if (numberOfBicycles < MAX_BYCICLES) {
            bicycles[numberOfBicycles] = b;
            numberOfBicycles++;
            return true;
        } else {
            return false;
        }
    }

    public void printByciclesManagement(BicycleManagment b) {
        for (int i = 0; i < numberOfBicycles; i++) {
            System.out.println("Bicycle number: " + b.getBicycles()[i].getId());
            System.out.println("Main color: " + b.getBicycles()[i].getMainColor());
            System.out.println("Number of Gears: " + b.getBicycles()[i].getNumberOfGears());
            System.out.println("Wheel Size: " + b.getBicycles()[i].getWheelsize());
            System.out.println("Bike Lenght: " + b.getBicycles()[i].getBikeLenght());
            System.out.println("Price: " + b.getBicycles()[i].getPrice());

            if (b.getBicycles()[i].isAdjustableSeatpost() == true) {
                System.out.println("Adjustable Seatpost");
            } else {
                System.out.println("Not Adjustable Seatpost");
            }

            if (b.getBicycles()[i] instanceof MountainBike) {
                MountainBike myMB = (MountainBike) b.getBicycles()[i];
                System.out.println("Number Of Lights: " + myMB.getNumberOfLights());
                MountainBikeSuspension.MountainBikeSuspensionToString(myMB.getSuspension());
                for (int j = 0; j < b.getNumberOfBicycles(); j++) {
                    System.out.println("Id Bike Tool: " + myMB.getBikeTools()[j].getId());
                    System.out.println("Name Bike Tool: " + myMB.getBikeTools()[j].getName());
                    System.out.println("Description Bike Tool: " + myMB.getBikeTools()[j].getDescription());
                }
            } else {
                DeliveryBike myDB = (DeliveryBike) b.getBicycles()[i];
                System.out.println("Basket Capacity: " + myDB.getBasketCapacity());

                if (myDB.isIsFrontBasket() == true) {
                    System.out.println("Front Basket.");
                } else {
                    System.out.println("Not Front Basket.");
                }
                for (int j = 0; j < b.getNumberOfBicycles(); j++) {
                    System.out.println("Id Sponsor: " + myDB.getSponsors()[j].getId());
                    System.out.println("Name Sponsor: " + myDB.getSponsors()[j].getName());
                    System.out.println("Description Sponsor: " + myDB.getSponsors()[j].getDescription());
                }
            }
        }
    }

}
