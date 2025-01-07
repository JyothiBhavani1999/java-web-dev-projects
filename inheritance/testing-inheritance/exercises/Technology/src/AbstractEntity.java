public abstract class AbstractEntity {
    private  static  int idcounter = 1;
    private final int id;
    
       public AbstractEntity() {
        this.id = idcounter++;
    }

    public int getId(){
        return id;
    }
}
