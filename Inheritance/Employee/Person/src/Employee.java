//Dont ever modify these codes
class Employee extends Person {
    private int id;
    Employee(String sname, int id){
            super(sname);
            setId(id);
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
}