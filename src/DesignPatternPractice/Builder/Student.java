package DesignPatternPractice.Builder;

public class Student {
    private final String firstname;
    private final String lastname;
    private final String age;

    private Student(Builder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String age;

        public Builder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

class BuilderTest {
    public static void main(String[] args) {
        Student student = new Student.Builder().firstname("test").lastname("test1").age("12").build();
        System.out.println(student);
    }
}