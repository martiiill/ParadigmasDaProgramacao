/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuatroPatas;

import QuatroPatas.Enums.GeneroAnimal;
import QuatroPatas.Enums.PorteCao;
import QuatroPatas.Enums.TipoGato;
import QuatroPatas.Enums.TipoServico;

/**
 *
 * @author anaal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TipoServico[] s = {
            TipoServico.Alojamento, TipoServico.Banho_e_Tosquia
        };
        
        TipoServico[] ss = {
          TipoServico.Alojamento, TipoServico.Banho_e_Tosquia
        };
        
        Cao a = new Cao(PorteCao.Pequeno, 0, "Tininho", GeneroAnimal.Feminino, 5, 1.77, 50, s);
        Gato a2 = new Gato(TipoGato.Interior, 0, "Joana", GeneroAnimal.Feminino, 22, 1.50,33,ss);

        Data d = new Data(10, 5, 2016);

        Reserva[] r = {
          new Reserva(0, d, a)
        };
        
        ReservasManagement rr= new ReservasManagement();
        rr.addReserva(r[0]);
        System.out.println(rr.toString());
        rr.printReservaData(r, d);
    }
    

}
