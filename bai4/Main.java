package kiemtra.bai4;

class Person {
    private String bophan ;
    private String iq;

    public Person() {
    }

    public Person(String bophan, String iq) {
        this.bophan = bophan;
        this.iq = iq;
    }

    public String getBophan() {
        return bophan;
    }

    public void setBophan(String bophan) {
        this.bophan = bophan;
    }

    public String getIq() {
        return iq;
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    @Override
    public String toString() {
        return "Person{" +
                "bophan='" + bophan + '\'' +
                ", iq='" + iq + '\'' +
                '}';
    }
}
// tinh dong goi
public class Main extends Person { // tinh ke thua
    private int age ;
    private String name ;
    private String id_card ;

    public Main() {
    }

    public Main(int age, String name, String id_card) {
        this.age = age;
        this.name = name;
        this.id_card = id_card;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    @Override
    public String toString() {
        return super.toString() +"Main{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id_card='" + id_card + '\'' +
                '}';
    }
}

class NhanVienVSS extends Person{
    private String name ;
    private int age ;
    private String level ;

    public NhanVienVSS() {
    }

    public NhanVienVSS(String name, int age, String level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    // the hien tinh da hinh khi no co ten giong voi ten phuong thuc toString cua lop Main nhung no lai co cach the hien khac
    @Override
    public String toString() {
        return super.toString() +"NhanVienVSS{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", level='" + level + '\'' +
                '}';
    }
}