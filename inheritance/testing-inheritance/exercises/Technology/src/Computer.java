public class Computer extends AbstractEntity{
    private  String brand;
    private  int memory;
    private  int offer;

    public Computer(String brand, int memory, int offer)
    {
        super();
        this.brand = brand;
        this.memory = memory;
        this.offer = offer;
    }

    public void details(){
        System.out.println("details are: "+brand+","+memory+"It is on "+offer+"% offer!!!!");
        System.out.println("unique ID: "+getId());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
