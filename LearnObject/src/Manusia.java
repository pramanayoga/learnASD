public class Manusia {
    String nama;
    int umur;
    boolean jenisKelamin;
    public Manusia(String nama, int umur, boolean jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }
    public void Berjalan(){
        System.out.println("Manusia sedang berjalan");
    }
    public void Berbicara(){
        System.out.println("Manusia sedang berbicara");
    }
     public void Makan(){
        System.out.println("Manusia sedang makan");
    }
     public void Minum(){
        System.out.println("Manusia sedang minum");
    }
}
