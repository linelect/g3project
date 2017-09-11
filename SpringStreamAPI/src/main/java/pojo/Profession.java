package pojo;

import java.util.ArrayList;

public class Profession {
    private String name;
    private ArrayList<Student> proffesionals = new ArrayList<>();
    private Student professional;

    public Profession() {
    }

    public Profession(String name) {
        this.name = name;
    }

    public Profession(String name, Student professional) {
        this.name = name;
        this.professional = professional;
    }

    public Profession(Student professional) {
        this.professional = professional;
    }

    public Student getProfessional() {
        return professional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addProffesionals(Student student) {
        return proffesionals.add(student);
    }

    public ArrayList<Student> getProffesionals() {
        return proffesionals;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "name='" + name + '\'' +
                ", professional=" + professional +
                '}';
    }
}
