package Task2_3;

public class Points {
    private double x;
    private double y;

    public Points(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Points add(double x, double y) {
        return new Points(getX() + x, getY() + y);
    }

    public Points add(Points points) {
        return add(points.getX(), points.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    //Returns the hashcode
    @Override
    public int hashCode() {
        long bits = java.lang.Double.doubleToLongBits(getX());
        bits ^= java.lang.Double.doubleToLongBits(getY()) * 31;
        return (((int) bits) ^ ((int) (bits >> 32)));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Points)) {
            return false;
        }
        return (x == ((Points) obj).x && y == ((Points) obj).y);
    }

    @Override
    public String toString() {
        return "[x=" + x + ",y=" + y + "]";
    }
}
