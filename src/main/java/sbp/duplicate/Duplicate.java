package sbp.duplicate;

import java.util.*;
import java.util.stream.Collectors;

public class Duplicate <T> {


    private T[] collection;
    private int capacity;

    /**
     * Конструктор массива.
     */
    public Duplicate() {
        collection = (T[]) new Object[]{};
    }

    /**
     * принимаем значение типа инт и если что-то не так то подбрасываем его
     *
     * @param capacity
     * @throws IllegalArgumentException
     */
    public Duplicate(int capacity) {

        if (capacity < 0) {
            throw new ArrayIndexOutOfBoundsException("Размер массива не может быть отрицательным." + capacity);
        } else {
            this.capacity = capacity;
            collection = (T[]) new Object[this.capacity];
        }
    }

    /**
     * Копируем присылаемую коллекцию к массиву collection
     *
     * @param collection1
     */
    public Duplicate(Collection<T> collection1) {
        collection = (T[]) collection1.toArray();
    }

    /**
     * Возвращает дубликаты коллекции.
     * Если нет дубликатов, возвращает null
     *
     * @param collection1
     * @return
     */
    public Collection<T> sortDuplicateOne(Collection<T> collection1) {
        collection = (T[]) collection1.toArray();
        Collection<T> collectionCopy = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < collection.length; i++) {
            for (int z = 0; z < collection.length; z++) {
                if (z == i) {
                    continue;
                }
                if (collection[i].equals(collection[z])) {
                    collectionCopy.add(collection[i]);
                    collection[i] = (T) "0";
                    index++;
                }
            }
        }
        if (index > 0) {
            return (Collection<T>) collectionCopy;
        }
        return null;
    }

    /**
     * Возвращает дубликаты коллекции.
     * Если нет дубликатов, возвращает null
     *
     * @param collection1
     * @return
     */
    public T sortDuplicateTwo(Collection<T> collection1) {
        collection = (T[]) collection1.toArray();
        Collection<T> result = new ArrayList<>();

        result = collection1.stream()
                .filter(e -> Collections.frequency(collection1, e) > 1)
                .distinct()
                .collect(Collectors.toList());
        if (result.size() > 0) {
            return (T) result.toString();
        }
        return null;
    }

    /**
     * Возвращает дубликаты коллекции.
     * Если нет дубликатов, возвращает null
     *
     * @param collection1
     * @return
     */
    public Set<T> sortDuplicateThree(Collection<T> collection1) {
        Collection<T> setToReturn = new HashSet<>();
        Set<T> set1 = new HashSet<>();

        for (T yourInt : collection1) {
            if (!set1.add(yourInt)) {
                setToReturn.add(yourInt);
            }
        }
        if (setToReturn.size() != 0) {
            return (Set<T>) setToReturn;
        }
        return null;
    }
}



