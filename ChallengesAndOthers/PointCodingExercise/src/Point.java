public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double result = Math.sqrt((this.x )*(this.x ) + (this.y ) * (this.y ));
        return result;
    }

    public double distance(int x, int y){
        double result = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y) * (this.y - y));
        return result;
    }

    public double distance(Point another){
        return distance(another.getX(), another.getY());
    }
}
