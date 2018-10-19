package strategy;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private String position;
    private int age;
    private String location;
    private BigDecimal sallary;

    public Employee(Builder builder) {
        this.name = builder.name;
        this.position = builder.position;
        this.age = builder.age;
        this.location = builder.location;
        this.sallary = builder.sallary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigDecimal getSallary() {
        return sallary;
    }

    public void setSallary(BigDecimal sallary) {
        this.sallary = sallary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", sallary=" + sallary +
                '}';
    }

    public static class Builder {
        private String name;
        private String position;
        private int age;
        private String location;
        private BigDecimal sallary;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPosition(String position) {
            this.position = position;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setSallary(BigDecimal sallary) {
            this.sallary = sallary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
