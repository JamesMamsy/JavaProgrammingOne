package Chapter8;

/**
 * Provides basic format for a time object
 *
 * @author James Miller
 */
public class Hours implements Comparable<Hours> {

    int id = 0;
    private int[] workHours = new int[7];
    private int totalHours;

    /**
     * Hours
     *
     * @param id WorkersId Number
     * @param workHours array listing how much worker with ID has worked in a
     * given day
     */
    public Hours(int id, int[] workHours) {
        this.id = id;
        this.workHours = workHours;
    }

    /**
     * getId
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * getHours
     *
     * @return workHours
     */
    public int[] getHours() {
        return workHours;
    }

    /**
     * getTotalHours returns total Amount of hours worked
     *
     * @return totalHours Amount of total hours integer
     */
    public int getTotalHours() {
        this.calcTotalHours();
        return totalHours;
    }

    /**
     * calctotalHours Calculated total hours worked
     */
    private void calcTotalHours() {
        this.totalHours = 0;
        for (int x : workHours) {
            this.totalHours += x;
        }
    }

    /**
     * compareTo comparator function overloaded, bases off total hours worked
     *
     * @param comparedHour
     * @return Difference in hours
     */
    @Override
    public int compareTo(Hours comparedHour) {
        return this.getTotalHours() - comparedHour.getTotalHours();
    }

}
