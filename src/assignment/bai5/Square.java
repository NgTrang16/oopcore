package assignment.bai5;

public class Square extends Shape{
    public float chieudai;

    @Override
    public float chuvi() {
        return chieudai*4;
    }

    @Override
    public float dientich() {
        return (float) Math.pow(chieudai, 2);
    }

    public float getChieudai() {
        return chieudai;
    }

    public void setChieudai(float chieudai) {
        this.chieudai = chieudai;
    }
}
