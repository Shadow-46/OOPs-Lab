public class Encapsulation1 {
    private String name;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setCity(String newCity) {
        city = newCity;
    }

    public static void main(String[] args) {
        Encapsulation1 obj = new Encapsulation1();
        obj.setName("John");
        obj.setAge(25);
        obj.setCity("New York");

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("City: " + obj.getCity());
    }
}
