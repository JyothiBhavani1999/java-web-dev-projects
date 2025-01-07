public class SmartPhone extends Computer {
    private  String cameraQuality;

    public SmartPhone(String cameraQuality,String touchType, String brand, int memory, int offer){
        super(brand,memory,offer);
        this.cameraQuality = cameraQuality;
    }

    public String getCameraQuality() {
        return cameraQuality;
    }

    public void setCameraQuality(String cameraQuality) {
        this.cameraQuality = cameraQuality;
    }

    @Override
    public void details() {
        System.out.println("camera quality: "+cameraQuality);
        super.details();
    }


}
