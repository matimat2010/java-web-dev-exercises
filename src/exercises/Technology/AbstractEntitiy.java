package exercises.Technology;

public class AbstractEntitiy {
    private static int id = 1;


public  AbstractEntitiy() {
   //
}
    public static int newId(){
//        for (int i=0; i < 0 ; i++){
            //id++;
            id = id +1;
//        }
           return id;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
