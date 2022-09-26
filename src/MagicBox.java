
import java.util.Random;

public class MagicBox<T> {
    public int num;
    protected T[] items = (T[]) new Object[num];
    Random random = new Random();

    public MagicBox(int num) {
        this.items = (T[]) new Object[num];
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                System.out.println("Вы успешно заполнили ячейку значением " + item);
                return true;
            }
        }
        System.out.println("Свободных ячеек больше нет.");
        return false;
    }

    public T pick() throws Exception {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не полна, Вы можете заполнить еще " + (items.length - (i)) + " ячеек. ");
            }
        }
        System.out.println("Коробка заполнена, создайте новую. Рандомное значение: ");
        int randomInt = random.nextInt(items.length);
        return items[randomInt];
    }

}
