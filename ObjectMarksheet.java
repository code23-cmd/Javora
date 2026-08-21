class ObjectMarksheet {

    String name;
    int rollNo;
    int english, hindi, maths, science, computer;
    int total;
    double percentage;

    // Constructor
    ObjectMarksheet(String n, int r, int e, int h, int m, int s, int c) {
        name = n;
        rollNo = r;
        english = e;
        hindi = h;
        maths = m;
        science = s;
        computer = c;

        total = english + hindi + maths + science + computer;
        percentage = total / 5.0;
    }

    void display() {
        System.out.println("========== MARKSHEET ==========");
        System.out.println("Name       : " + name + "            |");
        System.out.println("Roll No    : " + rollNo + "              |");
        System.out.println("-------------------------------");
        System.out.println("English    : " + english + "               |");
        System.out.println("Hindi      : " + hindi + "               |");
        System.out.println("Maths      : " + maths + "               |");
        System.out.println("Science    : " + science + "               |");
        System.out.println("Computer   : " + computer + "               |");
        System.out.println("-------------------------------");
        System.out.println("Total      : " + total + "              |");
        System.out.println("Percentage : " + percentage + "%" + "            |");
        System.out.println("-------------------------------");
    }

    public static void main(String args[]) {
         ObjectMarksheet s1 = new ObjectMarksheet("Sapna", 101,
            85, 90, 95, 88, 92 );

        s1.display();
    }
}