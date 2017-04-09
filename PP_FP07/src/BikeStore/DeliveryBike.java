package BikeStore;

/**
 * P. Porto - Escola Superior de Tecnologia e Gestao 
 * PP - Paradigmas da Programacao
 *
 * @author Ana Martins
 */
public class DeliveryBike extends Bicycle {

    private final int SPONSOR_SIZE = 10;
    private float basketCapacity;
    private boolean isFrontBasket;
    private Sponsor[] sponsors;
    private int numberOfSponsors;

    /**
     * Metodo construtor que permite criar uma instancia de {@link DeliveryBike
     * bicicleta de estrada} sem patrocinios.
     *
     * @param basketCapacity Capacidade da bicicleta de estrada.
     * @param isFrontBasket Saber se tem tem cesto a frente.
     * @param id Identificador da bicicleta de estrada.
     * @param numberOfGears Numero de mudancas da bicicleta de estrada.
     * @param mainColor Cor da bicicleta de estrada.
     * @param wheelsize Diametro das rodas da bicicleta de estrada.
     * @param bikeLenght Comprimento da bicicleta de estrada.
     * @param adjustableSeatpost Saber se tem acento ajustavel.
     * @param price Preco da bicicleta de estrada.
     */
    public DeliveryBike(float basketCapacity, boolean isFrontBasket, int id, int numberOfGears, String mainColor, float wheelsize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGears, mainColor, wheelsize, bikeLenght, adjustableSeatpost, price);
        sponsors = new Sponsor[SPONSOR_SIZE];
        numberOfSponsors = 0;
        if (basketCapacity < 0) {
            System.out.println("A capacidade tem que ser positiva.");
        } else {
            this.basketCapacity = basketCapacity;
        }
        this.isFrontBasket = isFrontBasket;
    }
    
      /**
     * Metodo construtor que permite criar uma instancia de {@link DeliveryBike
     * bicicleta de estrada} sem patrocinios.
     *
     * @param sponsors Colecao de patrocinios.
     * @param basketCapacity Capacidade da bicicleta de estrada.
     * @param isFrontBasket Saber se tem tem cesto a frente.
     * @param id Identificador da bicicleta de estrada.
     * @param numberOfGears Numero de mudancas da bicicleta de estrada.
     * @param mainColor Cor da bicicleta de estrada.
     * @param wheelsize Diametro das rodas da bicicleta de estrada.
     * @param bikeLenght Comprimento da bicicleta de estrada.
     * @param adjustableSeatpost Saber se tem acento ajustavel.
     * @param price Preco da bicicleta de estrada.
     */
    public DeliveryBike(Sponsor[] sponsors, float basketCapacity, boolean isFrontBasket, int id, int numberOfGears, String mainColor, float wheelsize, float bikeLenght, boolean adjustableSeatpost, float price) {
        super(id, numberOfGears, mainColor, wheelsize, bikeLenght, adjustableSeatpost, price);
        this.sponsors = sponsors;
        numberOfSponsors = 0;
        if (basketCapacity < 0) {
            System.out.println("A capacidade tem que ser positiva.");
        } else {
            this.basketCapacity = basketCapacity;
        }
        this.isFrontBasket = isFrontBasket;
    }

    /**
     * Retorna a {@link DeliveryBike#basketCapacity} da bicicleta de estrada.
     *
     * @return
     */
    public float getBasketCapacity() {
        return basketCapacity;
    }

    public void setBasketCapacity(float basketCapacity) {
        if (basketCapacity < 0) {
            System.out.println("A capacidade tem que ser positiva.");
        } else {
            this.basketCapacity = basketCapacity;
        }
    }

    /**
     * Retorna um valor booleano que indica se a bicicleta de estrada tem
     * {@link DeliveryBike#isFrontBasket}.
     *
     * @return
     */
    public boolean isIsFrontBasket() {
        return isFrontBasket;
    }

    public void setIsFrontBasket(boolean isFrontBasket) {
        this.isFrontBasket = isFrontBasket;
    }

    /**
     * Retorna os {@link DeliveryBike#sponsors} da bicicleta de estrada.
     *
     * @return
     */
    public Sponsor[] getSponsors() {
        return sponsors;
    }

    public void setSponsors(Sponsor[] sponsors) {
        int i;
        this.sponsors = new Sponsor[SPONSOR_SIZE];
        for(i = 0; i < SPONSOR_SIZE && i < sponsors.length; i++){
            this.sponsors[i] = sponsors[i];
        }
        numberOfSponsors = i;
    }

    /**
     * Retorna o {@link DeliveryBike#numberOfSponsors} da bicicleta de estrada.
     *
     * @return
     */
    public int getNumberOfSponsors() {
        return numberOfSponsors;
    }
    
    private int findSponsor(int id){
        int i;
        for(i=0; i < numberOfSponsors; i++){
            if(this.getSponsors()[i].getId() == id){
                return i;
            } else {
                return -1;
            }
        }
        return i;
    }

    /**
     * Metodo que permite adicionar um patrocionio a colecao de patrocinios.
     *
     * @param sp Um patrocinio.
     * @return valor booleano que indica o sucesso ou insucesso do metodo
     */
    public boolean addSponsor(Sponsor sp) {
        if (numberOfSponsors <= SPONSOR_SIZE) {
            sponsors[numberOfSponsors] = sp;
            numberOfSponsors++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que permite editar um patrocionador da colecao de patrocionadores.
     *
     * @param id_sponsor Identificador do patrocinio.
     * @param name Nome do patrocinio.
     * @param description Descricao do patrocinio
     * @return valor booleano que indica o sucesso ou insucesso do metodo
     */
    public boolean editSponsor(int id_sponsor, String name, String description) {
        for (int i = 0; i < numberOfSponsors; i++) {
            if (id_sponsor == this.getSponsors()[i].getId()) {
                this.getSponsors()[i].setId(id_sponsor);
                this.getSponsors()[i].setName(name);
                this.getSponsors()[i].setDescription(description);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Metodo que permite remover um patrocinio da colecao de patrocinio
     *
     * @param id_sponsor Identificador do patrocinio
     * @return valor booleano que indica o sucesso ou insucesso do metodo
     */
    public boolean removeSponsor(int id_sponsor) {
        int posicao;
        posicao = findSponsor(id_sponsor);
        if(posicao != -1){
            for(int i = posicao; i < numberOfSponsors; i++){
                this.sponsors[i] = this.sponsors[i+1];
            }
            numberOfSponsors--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que permite listar uma colecao de patrocinios.
     *
     * @param sps Colecao de patrocinios.
     */
    public void listSponsors(Sponsor[] sps) {
        for (int i = 0; i< numberOfSponsors; i++) {
            System.out.println("Id: " + sps[i].getId());
            System.out.println("Name: " + sps[i].getName());
            System.out.println("Description: " + sps[i].getDescription() + "\n");
        }
    }
}
