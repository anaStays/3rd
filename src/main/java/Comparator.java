import java.util.List;

/**
 * List containers comparator
 */
public class Comparator {
    /**
     * operations quantity
     */
    private Integer countOperations = 10000;

    /**
     * just constructor for operations counter
     * @param countOperations operations quantity
     */
    public Comparator(Integer countOperations){
        this.countOperations=countOperations;
    }

    /**
     * default constructor
     */
    public Comparator(){

    }

    /**
     * add testing method with middle inserting
     * @param experimental experimental container
     * @return testing time in ms
     */
    public long add(List<Integer> experimental) {
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i<countOperations;i++) {
            experimental.add(experimental.size()/2, i);
        }
        return System.currentTimeMillis() - timeStart;
    }

    /**
     * add in container begin
     * @param experimental experimental container
     * @return testing time in ms
     */
    public long addBegin(List<Integer> experimental){
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i<countOperations;i++) {
            experimental.add(0, i);
        }
        return System.currentTimeMillis() - timeStart;
    }

    /**
     * add in container end
     * @param experimental experimental container
     * @return testing time in ms
     */
    public long addEnd(List<Integer> experimental){
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i<countOperations;i++) {
            experimental.add(i);
        }
        return System.currentTimeMillis() - timeStart;
    }

    /**
     * delete testing
     * @param experimental experimental container
     * @return testing time in ms
     */
    public long delete(List<Integer> experimental) {
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i<countOperations;i++) {
            experimental.remove(experimental.size()/2);
        }
        return System.currentTimeMillis() - timeStart;
    }

    /**
     * get testing
     * @param experimental experimental container
     * @return testing time in ms
     */
    public long get(List<Integer> experimental) {
        long timeStart = System.currentTimeMillis();
        for(int i = 0; i<countOperations;i++) {
            Integer k = experimental.get(experimental.size()/2);
        }
        return System.currentTimeMillis() - timeStart;
    }

    /**
     * quantity of operations
     * @return quantity of operations
     */
    public Integer getCountOperations() {
        return countOperations;
    }
}
