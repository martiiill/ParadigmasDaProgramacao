/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuatroPatas;

import QuatroPatas.Enums.GeneroAnimal;
import QuatroPatas.Enums.PorteCao;
import QuatroPatas.Enums.TipoServico;
import java.util.Objects;

/**
 *
 * @author anaal
 */
public class Cao extends Animal{
    
    private PorteCao porte;

    public Cao(PorteCao porte, int id, String nome, GeneroAnimal genero, int idade, double altura, double peso, TipoServico[] servicos) {
        super(id, nome, genero, idade, altura, peso, servicos);
        this.porte = porte;
    }


    public PorteCao getPorte() {
        return porte;
    }

    public void setPorte(PorteCao porte) {
        this.porte = porte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.porte);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cao other = (Cao) obj;
        return this.porte == other.porte;
    }

    @Override
    public String toString() {
        return "Cao{" + "porte=" + porte + '}';
    }

}
