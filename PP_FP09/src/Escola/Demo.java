/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escola;

import Escola.Enums.Area;
import Escola.Enums.AreaAdmin;
import Escola.Enums.Habilitacoes;
import Escola.Enums.Tipo;
import QuatroPatas.Data;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

/**
 *
 * @author anaal
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Disciplina[] d = {
            new Disciplina("PP", "Paradigmas da Programacao",20)
        };
        Curso c = new Curso("LEI", "Engenharia Informatica", d);

        Data data = new Data(20, 9, 2013);
        Data data2 = new Data(22, 2, 2016);
        
        Pessoa a = new Aluno(data, Tipo.Nao_Trabalhador, "8130368", "Ana", "Porto", 12345679, 912223344, c);
        Pessoa p = new Professor(Habilitacoes.Licenciatura, Area.Informatica, data, data2, "ARM", "Altino", "Porto", 12345679, 123465789);
        Pessoa admin = new Administracao(Habilitacoes.Licenciatura, AreaAdmin.Secretaria, data2, 90, data2, "AA", "Ana", "Santo Tirso", 123456798, 13246789);
        
        PersonManagement pm = new PersonManagement();
        CourseManagement cm = new CourseManagement();

        pm.addPessoa(a);
        pm.addPessoa(p);
        pm.addPessoa(admin);
        
        cm.addDisciplinasProfessor((Professor) p, d);
        
        //cm.removeDisciplinas(0);
        //p.removePessoa(0);
        pm.listarPessoas();
        cm.print();
    }

}
