
package QuatroPatas;

import QuatroPatas.Enums.GeneroAnimal;
import QuatroPatas.Enums.TipoGato;
import QuatroPatas.Enums.TipoServico;
import java.util.Objects;

/**
 *
 * @author anaal
 */
public class Gato extends Animal{
    private TipoGato tipo;

    public Gato(TipoGato tipo, int id, String nome, GeneroAnimal genero, int idade, double altura, double peso, TipoServico[] servicos) {
        super(id, nome, genero, idade, altura, peso, servicos);
        this.tipo = tipo;
    }

    public TipoGato getTipo() {
        return tipo;
    }

    public void setTipo(TipoGato tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.tipo);
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
        final Gato other = (Gato) obj;
        return this.tipo == other.tipo;
    }

    @Override
    public String toString() {
        return "Gato{" + "tipo=" + tipo + '}';
    }
}
