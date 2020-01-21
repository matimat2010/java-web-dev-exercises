package exercises.Technology;

public class AbstractEntitiy {
    private int id = 1;

public AbstractEntitiy() {
    this.id=id;
}
    public int newId(){
//        for (int i=0; i < 0 ; i++){
            setId(id + 1);
//        }
           return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
