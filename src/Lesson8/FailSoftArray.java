package Lesson8;

public class FailSoftArray {
    private int a[];
    private int errVal;
    public int longitude;


    public FailSoftArray(int size, int errV) {
        a = new int[size];
        errVal = errV;
        longitude = size;
    }
    public int get (int index) {
        if (index < longitude)
            return a[index];
        return errVal;
    }
    public boolean put (int index, int val) {
        if (index >= 0 & index < longitude) {
            a[index] = val;
            return true;
        }
        return false;
    }

    private boolean indexOk(int index) {
        if (index >=0 & index < longitude) return true;
        return false;

    }
}
