package Escola;

import ObjectManagement.ContainerOfObjects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public class PersonManagement extends ContainerOfObjects {

    public PersonManagement() {
    }
    
    /**
     * Metodo que permite adicionar pessoas
     * @param p
     * @return
     */
    protected boolean addPessoa(Pessoa p){
        return super.addObject(p);
    }
    
    /**
     * Metodo que permite remover uma pessoa
     * @param position
     * @return 
     */
    protected boolean removePessoa(int position){
        return super.removeObject(position);
    }
    
    /**
     * Metodo que permite listar os dados de uma pessoa 
     * @return 
     */
    protected Object listarPessoas(){
       return super.printAll();
    }
}
