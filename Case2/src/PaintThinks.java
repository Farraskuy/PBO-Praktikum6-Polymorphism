import com.company.model.Cylinder;
import com.company.model.Paint;
import com.company.model.Rectangle;
import com.company.model.Sphere;

import java.text.DecimalFormat;

public class PaintThinks {
    // Membuat beberapa bentuk dan objek Paint
    // lalu mencetak jumlah cat yang dibutuhkan.
    public static void main(String[] args) {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);

        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;

        double deckAmt, ballAmt, tankAmt;

        // Membuat tiga objek bentuk untuk dicat
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);

        // Menghitung jumlah cat yang dibutuhkan untuk setiap bentuk
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // Mencetak jumlah cat untuk masing-masing.
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("Big Ball " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
