
class Data { int x; }

public class ClassReview {
    public static void main(String[] args) {

        Data d = new Data();
        d.x = 10;
        System.out.println(d);

        Data d2 = copy(d);

        System.out.println("d.x = " + d.x);
        System.out.println(d);
        System.out.println("d2.x = " + d2.x);
        System.out.println(d2);
    }

    static Data copy(Data d) {
        System.out.println(d);
        Data tmp = new Data();
        tmp.x = d.x;
        System.out.println(d + "   " + tmp);

        return tmp;


    }
}
