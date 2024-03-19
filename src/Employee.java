import java.time.*;

public class Employee {
    public  String  lastId;
    
    private String  name;
    private int     age;
    private int     id;
    private static int joined;

    public Employee(String name, int age, OptionalInt joined ) {
        this.name = name;
        this.age = age;
        this.id = newId();
        this.joined = joined.isPresent() ? joined.getAsInt() : localDate.getYear();
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }

    public int getLastId(){
        return lastId;
    }

    public int newId(){
        int current = getLastId();
        lastId = current++;
        return lastId;
    }

    public int getTimeEmployeed() {
        return localDate.getYear() - joined;
    }

}