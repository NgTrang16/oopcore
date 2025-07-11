package assignment.bai7;

public class GraduateStudent extends Student{
    public String researchTopic;
    public String supervisorName;

    public GraduateStudent(String researchTopic, String supervisorName) {
        this.researchTopic = researchTopic;
        this.supervisorName = supervisorName;
    }

    @Override
    public String getDetail() {
        return "GraduateStudent{" +
                "researchTopic='" + researchTopic + '\'' +
                ", supervisorName='" + supervisorName + '\'' +
                '}';
    }

    public GraduateStudent() {
        super();
    }

    public GraduateStudent(String name, String maSinhVien, double gpa) {
        super(name, maSinhVien, gpa);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getMaSinhVien() {
        return super.getMaSinhVien();
    }

    @Override
    public void setMaSinhVien(String maSinhVien) {
        super.setMaSinhVien(maSinhVien);
    }

    @Override
    public double getGpa() {
        return super.getGpa();
    }

    @Override
    public void setGpa(double gpa) {
        super.setGpa(gpa);
    }

}

