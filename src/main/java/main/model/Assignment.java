package main.model;

public class Assignment {

    private String title;
    private String description;
    private String subDate;
    private double oralMark;
    private double totalMark;

    public Assignment(String title, String description, String subDate, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.subDate = subDate;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public Assignment() {
    }

    public Assignment(String title, String subDateTime) {
        this.title = title;
        this.subDate = subDateTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDate;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDate = subDate;
    }

    public double getOralMark() {
        return oralMark;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "\n Assignment{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", subDate='" + subDate + '\'' +
                ", oralMark=" + oralMark +
                ", totalMark=" + totalMark +
                '}';
    }
}
