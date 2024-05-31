package edu.kis.vh.nursery;
/**
 * HanoiRhymer is a specialized implementation of DefaultCountingOutRhymer
 * that rejects values that do not follow the ascending order.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;
    /**
     * Reports the total number of rejected values.
     *
     * @return the total number of rejected values
     */

    public int reportRejected() {
        return getTotalRejected();
    }
    /**
     * Adds a value to the rhymer. If the value is smaller than the current
     * top value, it is rejected and the totalRejected counter is incremented.
     *
     * @param in the value to be added to the rhymer
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }
    /**
     * Returns the total number of rejected values.
     *
     * @return the total number of rejected values
     */

    public int getTotalRejected() {
        return totalRejected;
    }
    /**
     * Sets the total number of rejected values.
     *
     * @param totalRejected the new total number of rejected values
     */

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }
}
