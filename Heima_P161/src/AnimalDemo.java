public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("和猫住");
        c1.setAge(100);
        System.out.println(c1.getName() + "," + c1.getAge() + "岁");
        c1.catchMouse();

        Cat c2 = new Cat("花花与三猫",100);
        System.out.println(c2.getName() + "," + c2.getAge() + "岁");

        Dog d1 = new Dog("育碧",2021);
        d1.Watchdog();

    }


}
