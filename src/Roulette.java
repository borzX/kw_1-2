import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Roulette {
    public static void start() {

        List<Toy> toys = ToyQueue.toyCreate();


        int[] number = new int[toys.size()]; // Числа
        int[] chance = new int[toys.size()]; // Количество
        for (int i=0; i<toys.size(); i++){
            number[i] = toys.get(i).getToyID();
            chance[i] = toys.get(i).getToyWeight();
        }

        int count = IntStream.of(chance).sum();

        // Вывод вероятностей:
        for (int i = 0; i < chance.length; i++) {
            System.out.println("Вероятность получить игрушку \"" + toys.get(i).getToyName() + "\":  \t" + (chance[i]*100d/count) + "%");
        }

        // Генерация случайного числа
        Random random = new Random();
        for (int randomNumsCount = 0; randomNumsCount < 10; randomNumsCount++) {

            int index = random.nextInt(count); // Выбираем случайный индекс из воображаемого массива

            for (int i = 0; i < chance.length; i++) { // Ищем элемент, которому принадлежит этот индекс
                index -= chance[i];
                if(index < 0) {
                    System.out.println("Вы получили игрушку: " + toys.get(i).getToyName());
                    break;
                }
            }

        }
    }
}


