interface Reportable {
    void generateReport();
}

interface Trainable {
    void attendTraining();
}

class Employee2 {
    String name;
    Employee2(String name) {
        this.name = name;
    }
}

class Manager2 extends Employee2 implements Reportable {
    Manager2(String name) {
        super(name);
    }
    public void generateReport() {
        System.out.println(name + " составил отчет");
    }
}

class Developer2 extends Employee2 implements Trainable {
    Developer2(String name) {
        super(name);
    }
    public void attendTraining() {
        System.out.println(name + " прошел обучение");
    }
}

public class SRO2 {
    public static void main(String[] args) {
        Manager2 m = new Manager2("Айдос");
        m.generateReport();

        Developer2 d = new Developer2("Ернар");
        d.attendTraining();
    }
}
