public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[5]; 
        rectangles[0] = new Rectangle(4, 5);
        System.out.println("Luas dan Keliling Persegi Panjang 1:");
        System.out.println(rectangles[0].hitungLuas());
        System.out.println(rectangles[0].hitungKeliling());
        
        rectangles[1] = new Rectangle();
        rectangles[1].panjang = 6;
        rectangles[1].lebar = 3;
        System.out.println("Luas dan Keliling Persegi Panjang 2:");
        System.out.println(rectangles[1].hitungLuas());
        System.out.println(rectangles[1].hitungKeliling());
        System.out.println("-----------------------------------------------------");
        rectangles[2] = new Rectangle(7, 2);
        rectangles[3] = new Rectangle(5, 4);
        rectangles[4] = new Rectangle(3, 8);

        
        for (int i = 2; i < rectangles.length; i++) {
            System.out.println("Luas dan Keliling Persegi Panjang " + (i + 1) + ":");
            System.out.println(rectangles[i].hitungLuas());
            System.out.println(rectangles[i].hitungKeliling());
            System.out.println("-----------------------------------------------------");
        }
    }
}