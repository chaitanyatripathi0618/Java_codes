public class Encapsulation {
    //students
    int id;
    String name;
    String email;
    public Encapsulation(int id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
    }
    public Encapsulation(){
        super();
    }
    public void setId(int id){
        this .id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this .name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this .email=email;
    }
    public String getEmail(){
        return email;
    }
    public String toString(){
        return "id: "+id +"name: "+name+ "email:" +email;
    }
    
}
