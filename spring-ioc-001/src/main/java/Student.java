import java.util.Date;

public class Student {
    public Student() {
        System.out.println("Student类无参构造被调用");
    }

    private String name;

    private Date birthday;

    private String studentNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student").append('[')
                .append("name=")
                .append(name)
                .append(",birthday=")
                .append(birthday)
                .append(",studentNo=")
                .append(studentNo)
                .append(']');
        return sb.toString();
    }
}
