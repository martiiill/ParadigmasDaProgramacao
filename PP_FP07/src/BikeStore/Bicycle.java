package BikeStore;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao PP - Paradigmas da
 * Programacao
 *
 * @author Ana Martins
 */
public class Bicycle {

    /**
     * Identicador da bicicleta.
     */
    private int id;
    /**
     * Número de velocidades.
     */
    private int numberOfGears;
    /**
     * Cor da bicileta.
     */
    private String mainColor;
    /**
     * Diamentro das rodas.
     */
    private float wheelsize;
    /**
     * Comprimento da bicicleta.
     */
    private float bikeLenght;
    /**
     * Saber se assento é ajustáel.
     */
    private boolean adjustableSeatpost;
    /**
     * Preco da bicicleta.
     */
    private float price;

    /**
     * Método construtor para a criacao de uma instancia de
     * {@link Bicycle bicicleta}
     *
     * @param id Identificador da bicicleta
     * @param numberOfGears Numero de velocidades
     * @param mainColor Cor da bicicleta
     * @param wheelsize Diametro das rodas
     * @param bikeLenght Comprimento da bicicleta
     * @param adjustableSeatpost Saber se assento e ajustavel
     * @param price Preco da bicicleta.
     */
    public Bicycle(int id, int numberOfGears, String mainColor, float wheelsize, float bikeLenght, boolean adjustableSeatpost, float price) {
        if (id < 0) {
            System.out.println("O id nao pode ser menor que zero.");
        } else {
            this.id = id;
        }
        if (numberOfGears < 0) {
            System.out.println("O numero de mudancas tem que ser positivo.");
        } else {
            this.numberOfGears = numberOfGears;
        }
        if (mainColor.isEmpty() == true) {
            System.out.println("A bicicleta tem que ter uma cor.");
        } else {
            this.mainColor = mainColor;
        }
        if (wheelsize < 0) {
            System.out.println("O diametro da roda tem que ser positivo.");
        } else {
            this.wheelsize = wheelsize;
        }
        if (bikeLenght < 0) {
            System.out.println("O comprimento da bicicleta tem que ser positivo.");
        } else {
            this.bikeLenght = bikeLenght;
        }
        this.adjustableSeatpost = adjustableSeatpost;
        if (price < 0) {
            System.out.println("O preco tem que ser positivo.");
        } else {
            this.price = price;
        }
    }

    /**
     * Retorna o {@link Bicycle#id} de uma bicicleta
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            System.out.println("O id nao pode ser menor que zero.");
        } else {
            this.id = id;
        }
    }

    /**
     * Retorna o {@link Bicycle#numberOfGears} de uma bicicleta.
     *
     * @return
     */
    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        if (numberOfGears < 0) {
            System.out.println("O numero de mudancas tem que ser positivo.");
        } else {
            this.numberOfGears = numberOfGears;
        }
    }

    /**
     * Retorna a {@link Bicycle#mainColor} da bicicleta.
     *
     * @return
     */
    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        if (mainColor.isEmpty() == true) {
            System.out.println("A bicicleta tem que ter uma cor.");
        } else {
            this.mainColor = mainColor;
        }
    }

    /**
     * Retorna o {@link Bicycle#wheelsize} da bicicleta.
     *
     * @return
     */
    public float getWheelsize() {
        return wheelsize;
    }

    public void setWheelsize(float wheelsize) {
        if (wheelsize < 0) {
            System.out.println("O diametro da roda tem que ser positivo.");
        } else {
            this.wheelsize = wheelsize;
        }
    }

    /**
     * Retorna o {@link Bicycle#bikeLenght} da bicicleta.
     *
     * @return
     */
    public float getBikeLenght() {
        return bikeLenght;
    }

    public void setBikeLenght(float bikeLenght) {
        if (bikeLenght < 0) {
            System.out.println("O comprimento da bicicleta tem que ser positivo.");
        } else {
            this.bikeLenght = bikeLenght;
        }
    }

    /**
     * Retorna um valor booleano que dizer se a bicicleta tem ou nao
     * {@link Bicycle#adjustableSeatpost}
     *
     * @return
     */
    public boolean isAdjustableSeatpost() {
        return adjustableSeatpost;
    }

    public void setAdjustableSeatpost(boolean adjustableSeatpost) {
        this.adjustableSeatpost = adjustableSeatpost;
    }

    /**
     * Retorna o {@link Bicycle#price} da bicicleta.
     *
     * @return
     */
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0) {
            System.out.println("O preco tem que ser positivo.");
        } else {
            this.price = price;
        }
    }
}
