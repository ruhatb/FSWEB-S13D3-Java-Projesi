public class Main {
    public static void main(String[] args) {
       Person person1 = new Person("Ruhat","Bastu", 29, 1.79,73, "Brown");
       Person person2 = new Person("Ali","Demir",40);


       //Person

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("EyesColor: " + person1.getEyesColor());



        //Wall

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }


}