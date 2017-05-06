package Escola;

import ObjectManagement.ContainerOfObjects;

/**
 * Politécnico do Porto - Escola Superior de Tecnologia e Gestao
 *
 * @LEI - PP
 * @author Ana A. Martins
 */
public class CourseManagement extends ContainerOfObjects {

    private static final int MAX_DISCIPLINAS_PROF = 5;
    private Aluno[] alunos;
    private Professor[] professores;

    public CourseManagement() {
    }
    
     public CourseManagement(int objSize){
        super(objSize);
    }

    public boolean addDisciplinasProfessor(Professor p, Disciplina[] d) {
       for(int i = 0; i< p.getNumberDisciplinas(); i++){
           super.addObject(d);
       }
       return false;
    }

    public boolean removeDisciplinas(int position) {
        return super.removeObject(position);
    }

    public Object print() {
        return super.printAll();
    }
    
    public Object[] getAllDisciplinas(){
        return super.getAllObjects();
    }

}
