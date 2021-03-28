package hu.nive.ujratervezes.zarovizsga.housecup;

public class Cup {

    private String houseName;
    private String studentName;
    private int pointsEarned;

    public Cup(String houseName, String studentName, int pointsEarned) {
        this.houseName = houseName;
        this.studentName = studentName;
        this.pointsEarned = pointsEarned;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }
}
