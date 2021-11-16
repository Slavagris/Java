/**
* Java lvl 1 Employee
*@authot Slava Grishin 
*@version 16.11.2021
*/
class Employee {
    String name;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
    this.name = name;
    this.post = post;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.salary = salary;
    this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " +
                " Тел.: " + phoneNumber + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);

    }
}
