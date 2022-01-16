import java.util.List;

public class Class {
    Student monitor;

    List<Student> students;

    public Class() {
        System.out.println("Class类无参构造函数被调用");
    }

    public Student getMonitor() {
        return monitor;
    }

    public void setMonitor(Student monitor) {
        this.monitor = monitor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Class").append('[')
                .append("monitor=")
                .append(monitor)
                .append(",students=")
                .append(students)
                .append(']');
        return sb.toString();
    }
}
