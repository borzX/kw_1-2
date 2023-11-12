import java.util.ArrayList;
import java.util.List;

public class ToyQueue {



    public static List<Toy> toyCreate() {


        List<Toy> toyList = new ArrayList<Toy>();
        toyList.add(new Toy(1, "Конструктор", 20));
        toyList.add(new Toy(2, "Кукла", 60));
        toyList.add(new Toy(3, "Робот", 20));



        return toyList;
    }
}
