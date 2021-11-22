public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("ghy");
        t1.setAge(20);
        System.out.println(t1.getName() + "," + t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("关皓云",20);
        System.out.println(t2.getName() + "," + t2.getAge());
        t2.teach();

        Student s1 = new Student("wangwangwang",0);
        System.out.println(s1.getName() + "," + s1.getAge());
        s1.study();


    }


}
