package ch.jug.introduction.kotlin.f_dataclasses;

import java.util.Objects;

class SuperheroJava {

    private String gender;
    private String name;
    private String realName;

    public SuperheroJava(String gender, String name, String realName) {
        this.gender = gender;
        this.name = name;
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperheroJava that = (SuperheroJava) o;
        return Objects.equals(gender, that.gender) &&
                Objects.equals(name, that.name) &&
                Objects.equals(realName, that.realName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, name, realName);
    }

    @Override
    public String toString() {
        return "SuperheroJava{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
