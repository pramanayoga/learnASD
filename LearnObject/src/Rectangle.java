public class Rectangle {
    int panjang;
    int lebar;
    Rectangle(){}
    Rectangle(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    int hitungLuas() {
        return panjang * lebar;
    }
    int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}
