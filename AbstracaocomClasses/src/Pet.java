public class Pet {
    private boolean clean;
    private String name;

    public Pet(String name){
        this.name = name;
        this.clean = false;
    }

    public String getName() {
       return name;
    }

    public boolean isClean(){
        return clean;
    }
    
    public void setClean(boolean clean){
        this.clean = clean;
    } 
}