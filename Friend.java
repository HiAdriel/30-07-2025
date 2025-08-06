//Object Class
public class Friend {
    // Property Class
    String name;
    int age;
    String cita;
    String hobi;

    // Constructor Class
    public Friend(String n, int a, String c, String h) {
        this.name = n;
        this.age = a;
        this.cita = c;
        this.hobi = h;

    }

    // method untuk menampilkan data
    public void print() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("cita : " + cita);
        System.out.println("hobi : " + hobi);

    }
}
