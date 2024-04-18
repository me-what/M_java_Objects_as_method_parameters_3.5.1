public class Main {
    public static void main(String[] args) {
        Person kate = new Person("Kate");
        System.out.println(kate.getName());     // Kate
        changeName(kate);
        System.out.println(kate.getName());     // Alice

    }
    static void changeName(Person p){
        p.setName("Alice");
    }
}