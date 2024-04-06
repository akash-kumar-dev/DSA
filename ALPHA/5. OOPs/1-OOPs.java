public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();     // crated a Pen Object called p1
        // p1.setColor("Blue");
        p1.color = "Blue";
        System.err.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount A1 = new BankAccount();
        A1.username = "fsociety";
        // A1.password = "xyz"     // private DataTypes not accessable outside the Class
        A1.setPassword("ABCD");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    String getColor() {     // getter
        return this.color;      // this keyword used to refer current Object
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;     // this also use for diff. b/w external variable and local varibale when both have same name
    }
}
