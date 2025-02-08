package com.jiangyixin.extendesdemo;

public class Test {
    public static void main(String[] args) {
        // 创建一个子类对象
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setSex('男');
        teacher.setSkill("Java");
        c c = new c();
        c.print();
        System.out.println(teacher);
    }
}

class a {
    String name = "ye";
}

class b extends a {
    String name = "fu";
}

class c extends b {
    String name = "zi";

    public void print() {
        String name = "ni";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

}