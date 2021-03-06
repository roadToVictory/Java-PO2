abstract class Person {
  private final String name;
  private final String surname;

  Person(String n, String s) {
    this.name = n;
    this.surname = s;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String toString() {
    return getName() + " " + getSurname();
  }
}
