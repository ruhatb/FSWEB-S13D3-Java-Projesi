public class Person {
    String firstName;
    String lastName;
    int age;

    double height;
    double weight;

    String eyesColor;
public Person(String firstName, String lastName, int age){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

}

    public Person (String firstName, String lastName, int age , double height , double weight, String eyesColor){
     this(firstName,lastName,age); //chaining

      this.height = height;
      this.weight = weight;
      this.eyesColor = eyesColor;
    }


    /// get'le constructor
    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
       return lastName;
    }

    public int getAge() {
      return age;

    }

    public String getEyesColor(){
    return eyesColor;
    }

    public boolean isTeen(){
     if (13 < age && age <19){
         return true;
     }
     else { return false;}
    }


}

