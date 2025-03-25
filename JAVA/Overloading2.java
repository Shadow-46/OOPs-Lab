class Overloading2 {
  int rows = 5;

  public void display() {
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
  }

  public void display(char c) {
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
  }

  public static void main(String[] args) {
    Overloading2 d1 = new Overloading2();
    d1.display();
    System.out.println("\n");
    d1.display('#');
  }
}