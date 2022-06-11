
/**
 * List containers comparator
 */
public class Comparator {
    /**
     * Количество операций
     */
    private Integer countOperations = 10000;

    /**
     * Конструктор задающий количество операций
     * @param countOperations Количество операций
     */
    public Comparator(Integer countOperations){
        this.countOperations=countOperations;
    }

    /**
     * Конструктор по умолчанию
     */
    public Comparator(){

    }
}
