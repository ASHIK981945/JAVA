public class  Model{
    private String name ="";
    

    //setters
    public String setName(String name){ 
        this.name = name;
    

        // getters
    public String getGreeting(){
        return "hello" + name + "!";
    }
    }
}