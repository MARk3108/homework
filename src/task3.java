public class task3 {
    public static void main(String[] args) {
        Person mark = new Person();
        mark.firstName = "Mark";
        mark.lastName = "Fomin";
        mark.weight = 65;
        mark.height = 186;
        mark.sex = "Male";
        mark.pay = 1000;
        mark.age = false;
        System.out.println("Информация о "+mark.firstName+" "+ mark.lastName+":"+"\n"+"18 лет достиг - "+mark.age+"\n"+
        "Пол - "+mark.sex+"\n"+"Зарабатывает "+ mark.pay+" рублей в месяц, "+ mark.pay*12+" рублей в год."+
        "\n"+"Вес - "+ mark.weight+" кг. Рост - "+ mark.height+" см");
    }
}
class Person {
    String firstName;
    String lastName;
    int weight;
    int height;
    String sex;
    int pay;
    boolean age;
}