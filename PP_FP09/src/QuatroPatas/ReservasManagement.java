package QuatroPatas;

import ObjectManagement.ContainerOfObjects;

/**
 *
 * @author anaal
 */
public class ReservasManagement extends ContainerOfObjects {
    private ContainerOfObjects[] historico;
    
    public ReservasManagement() {
    }

    public ReservasManagement(Reserva[] objects) {
        super(objects);
    }

    /**
     * 
     * @param r
     * @return 
     */
    protected boolean addReserva(Reserva r) {    
      if(findObject(r) != -1){
          return super.addObject(r);
      } else {
          return false;
      }
    }

    /**
     * 
     * @param r
     * @return 
     */
   protected boolean validarReserva(Reserva r){
       if(findObject(r) != -1){
          r.setEstado("concluida");
          return true;
       } else {
           return false;
       }
   }
   
   protected void printReservaData(Reserva[] r, Data d){
       for(int i = 0; i < r.length; i++){
           if(d.equals(r[i].getData())){
               if("Por concluir".equals(r[i].getNumberOfReservas())){
                   System.out.println("Id: " + r[i].getId());
               } else {
                   System.out.println("Nao existem reservas por concluor");
               }
           } else {
               System.out.println("Nao existem reservas com essa data");
           }
       }
   }
    
    
}
