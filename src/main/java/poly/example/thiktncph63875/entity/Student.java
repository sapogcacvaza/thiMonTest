package poly.example.thiktncph63875.entity;

public class Student {
    private long id;
    private String name;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(long id, String name, double mark, int age) {
        this.id = id;
        setName(name);
        setMark(mark);
        setAge(age);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18)  {
            throw new IllegalArgumentException("Age must be greater than 18!");
        }
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if(mark < 0 || mark > 10) {
            throw new IllegalArgumentException("Mark must be between 0 and 10!");
        }
        this.mark = mark;
    }
}
