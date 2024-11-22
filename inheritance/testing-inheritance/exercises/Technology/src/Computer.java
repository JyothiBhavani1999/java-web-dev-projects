public class Computer {

    private Boolean isFullyCharged = true;
    private String  doesCalculation = "calculation";
    private String canSendMessage = "sends message";

    public  Computer(){
        System.out.println("This is Computer class");
    }

    public Boolean getIsFullyCharged(){
        return isFullyCharged;
    }

    public String getDoesCalculation() {
        return doesCalculation;
    }

    public String getCanSendMessage() {
        return canSendMessage;
    }

    public void performsCalculation(){
        if(isFullyCharged){
            System.out.println("Computer can perform calculation");
        }
    }

    public void setCanSendMessage(String canSendMessage) {
        if(isFullyCharged)
        {
            System.out.println("Computer can send messages!");
            isFullyCharged = false;
        }
    }
}
