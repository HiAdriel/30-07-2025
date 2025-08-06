//Driver Class
public class FriendTest {
    public static void main(String[] args) {
        // membuat objek dari class Friend
        Friend friend1 = new Friend(
                "Grisli", 16, "Data Analyst", "Belajar");
        friend1.print();

        Friend friend2 = new Friend(
                "M Rohman", 15, "Web Designer", "Running");
        friend2.print();

        Friend friend3 = new Friend(
                "M. Nasywan", 15, "Pengusaha", "Olahraga");
        friend3.print();

        Friend friend4 = new Friend(
                "Daffa", 15, "Web Designer", "Running");
        friend4.print();

        Friend friend5 = new Friend(
                "Fathur", 15, "Software Engineer", "Coding");
        friend5.print();

    }
}
