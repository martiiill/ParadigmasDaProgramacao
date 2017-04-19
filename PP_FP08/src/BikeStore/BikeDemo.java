package BikeStore;

import BikeStore.Enums.MountainBikeSuspension;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao 
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class BikeDemo {

    public static void main(String[] args) {
        BikeTools[] bk = {
            new BikeTools(0, "Luvas", "Luvas com protecao especial"),
            new BikeTools(1, "Capacete", "Capacete com protecao especial")
        };

        Sponsor[] s = {
            new Sponsor(1, "Pepsi", "Bebida genial"),
            new Sponsor(2, "Asus", "Melhor marca de portateis do mercado")
        };

        Bicycle myBike1 = new MountainBike(1, MountainBikeSuspension.SIMPLES, 1, 5, "Preto", 20, 50, true, 1000);
        Bicycle myBike2 = new DeliveryBike(20, true, 1, 4, "Blue", 20, 30, true, 2000);

        Bicycle[] bicycles = {
            new MountainBike(bk, 1, MountainBikeSuspension.DUPLA, 2, 5, "Brown", 20, 50, false, 2000),
            new DeliveryBike(s, 33, false, 2, 4, "Blue", 20, 30, false, 1000)
        };

        BicycleManagment myBike3 = new BicycleManagment();
        myBike3.addBicycles(bicycles[0]);
        myBike3.addBicycles(bicycles[1]);

        if (myBike1 instanceof MountainBike) {
            MountainBike myMountainBike1 = (MountainBike) myBike1;
            System.out.println("Id: " + myBike1.getId());
            System.out.println("Color: " + myBike1.getMainColor());
            System.out.println("Wheel Size: " + myBike1.getWheelsize());
            System.out.println("Price: " + myBike1.getPrice());
            System.out.println("Number Of Gears: " + myBike1.getNumberOfGears());
            System.out.println("Bike Lenght: " + myBike1.getBikeLenght());
            if (myBike1.isAdjustableSeatpost() == true) {
                System.out.println("Adjustable Seatpost");
            } else {
                System.out.println("Not Adjustable Seatpost");
            }
            System.out.println("Number of Lights: " + myMountainBike1.getNumberOfLights());
            System.out.println(MountainBikeSuspension.MountainBikeSuspensionToString(myMountainBike1.getSuspension()));
            myMountainBike1.addBikeTools(bk[0]);
            myMountainBike1.addBikeTools(bk[1]);
            myMountainBike1.listBikeTools(myMountainBike1.getBikeTools());
            //myMountainBike1.editBikeTools(1, "Nao sei", "Nao sei");
            //System.out.println("Depois do edit: ");
            //myMountainBike1.listBikeTools(myMountainBike1.getBikeTools());
            System.out.println("Depois do remove: ");
            myMountainBike1.removeBikeTools(1);
            myMountainBike1.listBikeTools(bk);
        }

        if (myBike2 instanceof DeliveryBike) {
            DeliveryBike myDeliveryBike1 = (DeliveryBike) myBike2;
            System.out.println("Id: " + myBike2.getId());
            System.out.println("Color: " + myBike2.getMainColor());
            System.out.println("Wheel Size: " + myBike2.getWheelsize());
            System.out.println("Price: " + myBike2.getPrice());
            System.out.println("Number Of Gears: " + myBike2.getNumberOfGears());
            System.out.println("Bike Lenght: " + myBike2.getBikeLenght());
            if (myBike2.isAdjustableSeatpost() == true) {
                System.out.println("Adjustable Seatpost");
            } else {
                System.out.println("Not Adjustable Seatpost");
            }
            System.out.println("Basket Capacity: " + myDeliveryBike1.getBasketCapacity());
            if (myDeliveryBike1.isIsFrontBasket() == true) {
                System.out.println("Front Basket.");
            } else {
                System.out.println("Isn't front basket.");
            }
            myDeliveryBike1.addSponsor(s[0]);
            myDeliveryBike1.addSponsor(s[1]);
            myDeliveryBike1.listSponsors(myDeliveryBike1.getSponsors());
            myDeliveryBike1.editSponsor(1, "Nao sei", "naosei");
            myDeliveryBike1.listSponsors(myDeliveryBike1.getSponsors());
            myDeliveryBike1.removeSponsor(1);
            myDeliveryBike1.listSponsors(myDeliveryBike1.getSponsors());
        }
        
        System.out.println("Bicycles Management\n");
        myBike3.printByciclesManagement(myBike3);
    }

}
