public class task4 {
    public static void main(String[] args) {
        pet dog = new pet("Овчарка",70,"Шарик");
        pet cat = new pet("Сиамская",30,"Мурка");
        human woman = new human("Маша", 56,165,25);
        human man = new human("Паша",74,190,20);
        info(dog,cat,man,woman);
    }
    public static void info(pet dog,pet cat,human man,human woman) {
        System.out.println("Собака:"+"\n"+"Порода "+dog.poroda+"\n"+"вес "+dog.weight+"\n"+"кличка "+dog.klichka+"\n");
        System.out.println("Кишка:"+"\n"+"Порода "+cat.poroda+"\n"+"вес "+cat.weight+"\n"+"кличка "+cat.klichka+"\n");
        System.out.println("Девушка:"+"\n"+"Имя - "+woman.firstName+"\n"+"Вес:"+ woman.weight+" Рост:"+ woman.height+"\n"+"Возраст:"+woman.age);
        System.out.println("Парень:"+"\n"+"Имя - "+man.firstName+"\n"+"Вес:"+ man.weight+" Рост:"+ man.height+"\n"+"Возраст:"+man.age);
    }
}
class pet{
    String poroda;
    int weight;
    String klichka;
    pet (String p,int w, String k){
        poroda = p;
        weight = w;
        klichka = k;
    }
}

class human {
    String firstName;
    int weight;
    int height;
    int age;
    human(String name,int wes,int rost, int old){
        firstName=name;
        weight=wes;
        height=rost;
        age=old;
    }
}