package assignment.bai5;

public class Rectangle extends Shape {
    public Float dai ;
    public Float rong ;

    public Rectangle(Float dai, Float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public float chuvi() {
        return 2*(dai+rong);
    }

    @Override
    public float dientich() {
        return dai*rong;
    }

    public Float getDai() {
        return dai;
    }

    public void setDai(Float dai) {
        this.dai = dai;
    }

    public Float getRong() {
        return rong;
    }

    public void setRong(Float rong) {
        this.rong = rong;
    }
}
