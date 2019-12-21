package tonhi;

import java.util.Random;
import java.util.Scanner;

public class gamedoanso {

	static void choiGame() {
		Random rd = new Random();
		int soMay = rd.nextInt(101);
		int soLanDoan = 0;
		int soNguoi = 0;
		System.out.println("Máy đã ra 1 số từ 0 tới 100, mời bạn đoán");
		while (true) {
			System.out.println("Bạn đoán: ");
			soNguoi = new Scanner(System.in).nextInt();
			soLanDoan++;
			if (soNguoi == soMay) {
				System.out.println("Chúc mừng!! Bạn đoán đúng!");
				System.out.println("Số máy= " + soMay);
				break;
			}
			if (soNguoi < soMay) {
				System.out.println("bạn đoán sai, số bạn nhỏ hươn số máy");
			} else {
				System.out.println("bạn đoán sai,số bạn lớn hươn số máy");
			}
			System.out.println("Bạn đã đoán " + soLanDoan);
			if (soLanDoan >= 7) {
				System.out.println("GAME OVER!");
				break;
			}
		}
	}

	public static void main(String[] args) {

		choiGame();
	}

}
