package com.jiangyixin.extendesdemo;

//子类

public class Teacher extends People {
    private String skill;

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public Teacher() {
    }

    // 如果不写skill技能 则默认技能为java
    public Teacher(String name, char sex) {
        this(name, sex, skill = "Java");
    }

    public Teacher(String name, char sex, String skill) {
        super(name, sex);
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "skill='" + skill + '\'' +
                ", name='" + getName() + '\'' +
                ", sex=" + getSex() +
                '}';
    }
}
