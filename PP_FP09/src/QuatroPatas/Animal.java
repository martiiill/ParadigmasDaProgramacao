
package QuatroPatas;

import QuatroPatas.Enums.GeneroAnimal;
import QuatroPatas.Enums.TipoServico;
import java.util.Objects;

/**
 *
 * @author anaal
 */
public class Animal {
    /**
     * Identificador do animal
     */
    private int id;
    /**
     * Nome do animal
     */
    private String nome; 
    /**
     * Genero do Animal
     */
    private GeneroAnimal genero;
    /**
     * Idade do Animal
     */
    private int idade;
    
    private double altura;
    
    private double peso;
    
    private TipoServico[] servicos;

    public Animal(int id, String nome, GeneroAnimal genero, int idade, double altura, double peso, TipoServico[] servicos) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.servicos = servicos;
    }
    
    public Animal(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GeneroAnimal getGenero() {
        return genero;
    }

    public void setGenero(GeneroAnimal genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.genero);
        hash = 97 * hash + this.idade;
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
        final Animal other = (Animal) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        return this.idade == other.idade;
    }


    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nome=" + nome + ", genero=" + genero + ", idade=" + idade + '}';
    }

}
