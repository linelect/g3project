package pojo;

public class Student {
    private Group group;
    private String name;
    private int avgRating;

    public Student() {
    }

    public Student(Group group, String name, int avgRating) {
        this.group = group;
        this.name = name;
        this.avgRating = avgRating;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(int avgRating) {
        this.avgRating = avgRating;
    }

    @Override
    public String toString() {
        return "App.Student{" +
                "group=" + group +
                ", name='" + name + '\'' +
                ", avgRating=" + avgRating +
                '}';
    }
}