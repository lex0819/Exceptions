package seminar03.task05;

public class Point2D {
    private  int i;
    private  int j;

    public Point2D(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        return String.format("{%s, %s}", i, j);
    }
}
