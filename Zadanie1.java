abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract void work();
    abstract void introduce();
}

class Developer extends Employee {
    String language;

    Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println(name + " пишет код на " + language);
    }

    @Override
    void introduce() {
        System.out.println("Я разработчик " + name + ", зарплата " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(name + " управляет " + teamSize + " людьми");
    }

    @Override
    void introduce() {
        System.out.println("Я менеджер " + name + ", зарплата " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Иван", 150000, "Java");
        Employee man = new Manager("Алия", 200000, 5);

        dev.introduce();
        dev.work();

        man.introduce();
        man.work();
    }
}
