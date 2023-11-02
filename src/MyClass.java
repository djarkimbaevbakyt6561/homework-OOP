public class MyClass {
    String name;
    String surname;
    byte age;
    String[] lessons;
    String lovelyFood;


    public MyClass(String name, String surname, byte age, String[] lessons, String lovelyFood) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.lessons = lessons;
        this.lovelyFood = lovelyFood;
    }

    public void getInfoAboutStudent() {
        System.out.println("Информация об ученике: ");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);

        System.out.print("Уроки которые посещает ученик" + name + ": ");
        for (int i = 0; i < lessons.length; i++) {
            if (i != lessons.length - 1) {
                System.out.println(lessons[i] + ", ");

            } else {
                System.out.println(lessons[i] + ".");
            }

        }

        System.out.println("Любимое блюдо: " + lovelyFood);
    }
}
