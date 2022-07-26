package kiemtra.bai4.tinh_truu_tuong;

public class Main implements Person{// the hien tinh truu tuong

    @Override
    public void hoTen() {
        System.out.println("Tran Thai Cong");
    }

    @Override
    public String LuaTuoi(int age) {
        if(age<15) return "tre chau";
        else if(age<35) return "tre gia ";
        else return "lon tuoi";
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.hoTen();
        System.out.println(m.LuaTuoi(20));
    }

}
