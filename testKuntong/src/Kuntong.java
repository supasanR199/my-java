public class Kuntong {
    String name = null;
    int age = 2;
    int weight = 500;
    int weightEat = 500;

    public Kuntong(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    void speak(String s) {
        if (s.length() == 0) {
            System.out.println("ไม่มีการพูดใดๆ");
            System.out.println("age : " + age);
        } else {
            System.out.println("พูด : " + s);
        }
    }

    void eat(int e) {
        if (e >= weight) {
            System.out.println("ท้องเสียเยย");
            weightEat = weight;
        } else {
            weightEat += e;
        }
    }

    void feces(int f) {
        if (f >= weightEat - weight) {
            System.out.println("ถ่ายมากสุดได้ : " + (weightEat - weight));
            weightEat = weight;
        } else {
            weightEat -= f;
        }
    }

    Kuntong fuckWithKuntong(Kuntong whoFuckWithKuntong) {
        return new Kuntong(this.name + whoFuckWithKuntong.getName());

    }

}