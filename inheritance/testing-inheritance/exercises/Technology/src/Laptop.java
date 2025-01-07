public class Laptop extends Computer{
    private  String touchType;

    public Laptop(String touchType, String brand, int memory, int offer){
        super(brand,memory,offer);
        this.touchType = touchType;
    }

    public String getTouchType() {
        return touchType;
    }

    public void setTouchType(String touchType) {
        this.touchType = touchType;
    }

    @Override
    public void details() {
        super.details();
        System.out.println("laptop type: "+touchType);
    }
}
