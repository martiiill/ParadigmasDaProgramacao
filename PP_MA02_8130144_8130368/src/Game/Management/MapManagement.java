/**
 * Nome: Joana Machado Baptista
 * Número: 8130144
 * Turma: 3
 *
 * Nome: Ana Alice Gonçalves Martins
 * Número: 8130368
 * Turma: 3
 */
package Game.Management;

import Game.MapEntry;
import Resources.Collection.MapEntryContract;
import Resources.Collection.MapManagementContract;
import Resources.Exceptions.DuplicateEntryException;
import Resources.Exceptions.EndOfCollectionException;
import Resources.Exceptions.KeyNotFoundException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável por representar uma estrutura que associa chaves e
 * valores.
 */
public class MapManagement implements MapManagementContract, Serializable {

    private ListManagement man;
    private int numberOfMaps;

    public MapManagement() {
        this.man = new ListManagement();
    }

    /**
     * Método que permite definir uma entrada identificada por uma chave
     * associada a um valor. Não podem existir chaves repetidas e cada chave
     * apenas é mapeada a um valor
     *
     * @param o Objeto que representa a estrutura da chave
     * @param o1 valor associado à chave
     * @return valor que sinaliza o sucesso/insucesso da operação
     * @throws DuplicateEntryException Exceção que representa os erros que podem
     * ocorrer no método de adição da chave.
     */
    @Override
    public boolean addEntry(Object o, Object o1) throws DuplicateEntryException {
        if (this.man.hasObject(o)) {
            throw new DuplicateEntryException("Essa chave ja existe");
        } else {
            MapEntry mapEntry = new MapEntry(o, o1);
            this.man.addObject(mapEntry);
            this.numberOfMaps++;
            return true;
        }
    }

    /**
     * Método responsável por verificar pela navegação entre as
     * {@link MapEntry entradas} do mapa
     *
     * @return Valor que sinaliza o se existe/não existe animação seguinte
     */
    @Override
    public boolean hasNext() {
        for (int i = 0; i < this.numberOfMaps; i++) {
            return man.getObjects() != null;
        }
        return false;
    }

    /**
     * Método responsável por verificar se existe uma próxima
     * {@link MapEntry entrada} no mapa. O acesso ao mapa deverá ser feito
     * elemento a elemento através daqui.
     *
     * @return A próxima {@link MapEntry entrada} do mapa
     * @throws EndOfCollectionException
     */
    @Override
    public MapEntryContract next() throws EndOfCollectionException {

        while (hasNext()) {
            for (int i = 0; i < this.man.getNumberOfObjects(); i++) {
                return (MapEntryContract) this.man.getObjects()[i];
            }
        }
        return null;
    }

    /**
     * Método que permite retornar um valor associado a uma chave
     *
     * @param o Chave para obter a entrada
     * @return o valor associada à chave
     * @throws KeyNotFoundException Excecao que representa a ausência da key na
     * coleção.
     */
    @Override
    public Object getByKey(Object o) throws KeyNotFoundException {

        while (hasNext()) {
            try {
                MapEntry map = (MapEntry) next();
                if (this.man.hasObject(map.getKey()) && map.getKey() != null) {
                    return map.getValue();
                } else {
                    return null;
                }
            } catch (EndOfCollectionException ex) {
                Logger.getLogger(MapManagement.class.getName()).log(Level.SEVERE, 
                        null, ex);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "MapManagement{" + "man=" + man + ", numberOfMaps=" + 
                numberOfMaps + '}';
    }
}
