import java.io.*;
import java.util.*;

public class backjoon_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Person[] person = new Person[a];
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            person[i] = new Person(age, st.nextToken());
        }

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Person pe : person) {
            bw.write(pe.toString() + "\n");
        }

        bw.flush();
        bw.close();
    }
}

class Person {
    int age;
    String name;

    Person() {}
    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getAge() + " " + getName();
    }
}