public class Coche {
  int numberDoors;

  public Coche(int numDoors) {
    this.numberDoors = numDoors;
  }

  public void addDoors() {
    numberDoors++;
  }

  public int getDoors() {
    return numberDoors;
  }
}
