package BikeStore;

import BikeStore.Enums.MountainBikeSuspension;
import ObjectManagement.BicyclesSalesManagement;

/**
 * P.Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class BikeStoreDemo {

    public static void main(String[] args) {
        double total = 0 ;
        BikeTools[] bt = {new BikeTools(0, "FCPorto", "The best club")};
        Bicycle[] b = { new MountainBike(bt,1, MountainBikeSuspension.SIMPLES, 0, 5, "Black", 40, 50, true, 200),
                        new DeliveryBike(20, true, 0, 20, "Yellow", 40, 100, true, 1000),
        new MountainBike(bt,1, MountainBikeSuspension.SIMPLES, 0, 5, "Black", 40, 50, true, 200)};

        SaleDate sd = new SaleDate(20, 3, 2017);

        BicyclesSalesManagement bsm = new BicyclesSalesManagement(b, 0, sd);

        bsm.addBicycle(b[0]);
         bsm.addBicycle(b[1]);
          bsm.addBicycle(b[2]);
        
        System.out.println(bsm.toString());
         for (int i = 0; i < bsm.getNumberOfObjects(); i++) {
            total= total + bsm.getAllBicycles()[i].getPrice();
        }
         System.out.println("Total = " + total);
         bsm.removeBicycle(2);
         System.out.println(bsm.toString());
    }

}
