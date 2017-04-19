
package ObjectManagement;

import BikeStore.Sponsor;

/**
 * P.Porto - Escola Superior de Tecnologia e Gestao 
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class SponsorsManagement extends ContainerOfObjects{
    
    /**
     * Metodo construtor que permite instanciar {@link SponsorsManagement}
     */
    public SponsorsManagement(){
        
    }
    
    /**
     * Metodo que permite criar uma instancia de {@link SponsorsManagement}, enviando
     * como argumento um tamanho definido.
     * @param objSize Tamanho pretendido para o vetor {@link SponsorsManagement}
     */
    public SponsorsManagement(int objSize){
        super(objSize);
    }
    
    /**
     * Metodo que permite adicionar um objeto do tipo {@link Sponsor patrocionador}
     * ao vetor de {@link ContainerOfObjects#objects objetos}
     * @param sponsors colecao de {@link Sponsor patrocionadores}
     * @return valor booleano que representa o sucesso/insucesso da operacao
     */
    public boolean addSponsors(Sponsor sponsors){
        return super.addObject(sponsors);
    }
    
    /**
     * Metodo que permite eliminar um {@link Sponsor patrocionador} da colecao de
     * {@link ContainerOfObjects#objects objetos}.
     * @param position Posicao do elemento que quero eliminar.
     * @return {@link ContainerOfObjects#objects obbjecto} que eliminei
     */
    public boolean removeSponsors(int position){
        return super.removeObject(position);
    }
    
    /**
     * Metodo que permite saber se existe o {@link Sponsor patrocionador} que envio
     * como argumento.
     * @param sponsor {@link Sponsor patrocionador} que quero encontrar
     * @return valor booleano que representa o sucesso/insucesso da operacao
     */
    public boolean hasSponsors(Sponsor sponsor){
        return super.hasObject(sponsor);
    }
    
    /**
     * Metodo que permite obter todos os {@link Sponsor patrocionadores} que existem
     * na colecao de {@link ContainerOfObjects#objects objetos}
     * @return {@link ContainerOfObjects#objects objetos} que existem
     */
    public Sponsor[] getAllSponsors(){
        return (Sponsor[]) super.getAllObjects();
    } 
}
