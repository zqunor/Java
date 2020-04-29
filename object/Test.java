class Animal {
    public void bark () {
        System.out.println("动物叫");
    }
}

class Dog extends Animal {
    public void bark () {
        System.out.println("汪、汪、汪");
    }
    public void dogType () {
        System.out.println("这什么品种的狗");
    }
}

public class Test {
    public static void main (String[] args) {
        Animal a = new Animal();

        // 向上转型：会遗忘子类对象中与父类对象不同的方法，也会覆盖与父类中相同的方法
        Animal b = new Dog();


        // Anima无法转换为Dog
        // Dog c = new Animal();
        Dog d = new Dog();

        a.bark();
        b.bark();
        // c.bark();
        d.bark();

        // a.dogType();
        // b.dogType();
        // c.dogType();
        d.dogType();
    }
}