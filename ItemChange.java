public class ItemChange {
    private ItemChange nextValueChange;
    private int minTime;
    private int maxTime;

    public boolean isInRange(int time, boolean inclusive) {
        if(inclusive) { return time >= minTime && time =< maxTime; }
        return time > minTime && time < maxTime;
    }
}