public class Practice1 {
    public static void main(String[] args) {
        System.out.println(" Демонстрация спецификаторов доступа в Java \n");

        Person person = new Person("Иван", "Иванов", 30, "123-45-67");

        System.out.println("1. Доступ к публичным методам:");
        person.displayPublicInfo();
        System.out.println();

        System.out.println("2. Работа с приватными данными через геттеры/сеттеры:");
        System.out.println("Телефон через геттер: " + person.getPhoneNumber());
        person.setPhoneNumber("987-65-43");
        System.out.println("Новый телефон: " + person.getPhoneNumber());
        System.out.println();

        System.out.println("3. Демонстрация protected и package-private:");
        Employee employee = new Employee("Петр", "Петров", 25, "111-22-33", "IT");
        employee.displayEmployeeInfo();

        SamePackageTester samePackage = new SamePackageTester();
        samePackage.testPackagePrivateAccess();
        System.out.println();

        System.out.println("4. Демонстрация protected через наследование:");
        Manager manager = new Manager("Мария", "Сидорова", 35, "444-55-66", "Sales", 5);
        manager.displayManagerInfo();

        System.out.println("\n5. Вызов protected метода из класса в том же пакете:");
        samePackage.callProtectedMethod(manager);
    }
}

class Person {
    public String firstName;
    String lastName;
    protected int age;
    private String phoneNumber;

    public Person(String firstName, String lastName, int age, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void displayPublicInfo() {
        System.out.println("Имя: " + firstName + " " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Телефон: " + getMaskedPhone());
    }

    void displayPackagePrivateInfo() {
        System.out.println("Информация (только в пакете): " + firstName + " " + lastName + ", тел: " + phoneNumber);
    }

    protected void displayProtectedInfo() {
        System.out.println("Защищенная информация: " + firstName + " " + lastName + ", возраст: " + age);
    }

    private String getMaskedPhone() {
        if (phoneNumber == null || phoneNumber.length() < 5) {
            return "***";
        }
        return "***-" + phoneNumber.substring(phoneNumber.length() - 4);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null && phoneNumber.matches("\\d{3}-\\d{2}-\\d{2}")) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Некорректный формат телефона!");
        }
    }

    String getLastName() {
        return lastName;
    }

    protected int getAge() {
        return age;
    }
}

class Employee extends Person {
    private String department;

    public Employee(String firstName, String lastName, int age, String phoneNumber, String department) {
        super(firstName, lastName, age, phoneNumber);
        this.department = department;
    }

    public void displayEmployeeInfo() {
        System.out.println("Сотрудник: " + firstName + " " + lastName);
        System.out.println("Возраст: " + age);
        System.out.println("Отдел: " + department);
        displayProtectedInfo();
        System.out.println("Телефон: " + getPhoneNumber());
        System.out.println("Фамилия: " + lastName);
    }

    @Override
    protected void displayProtectedInfo() {
        System.out.println("Информация сотрудника (protected): " +
                          firstName + " " + lastName + ", отдел: " + department);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String firstName, String lastName, int age,
                   String phoneNumber, String department, int teamSize) {
        super(firstName, lastName, age, phoneNumber, department);
        this.teamSize = teamSize;
    }

    public void displayManagerInfo() {
        System.out.println("Менеджер: " + firstName + " " + lastName);
        System.out.println("Команда: " + teamSize + " человек");
        displayProtectedInfo();
    }
}

class SamePackageTester {
    public void testPackagePrivateAccess() {
        Person person = new Person("Анна", "Смирнова", 28, "777-88-99");

        System.out.println("Доступ из того же пакета:");
        System.out.println("Фамилия (package-private): " + person.lastName);
        person.displayPackagePrivateInfo();
        System.out.println("Возраст (protected): " + person.age);
        person.displayProtectedInfo();
        System.out.println("Имя (public): " + person.firstName);
    }

    public void callProtectedMethod(Person person) {
        person.displayProtectedInfo();
    }
}