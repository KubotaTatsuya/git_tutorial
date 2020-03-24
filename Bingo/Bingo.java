package Bingo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Bingo {

	public static void main(String[] args) {

		ArrayList<Integer> bingo = new ArrayList<Integer>();
		ArrayList<Integer> lottery = new ArrayList<Integer>();
		int r;
		int c=0;
		for(int i = 0; i < 25; i++){
			r = new Random().nextInt(99)+1;
			while(bingo.contains(r)){
				r = new Random().nextInt(99)+1;
			}
			if(i == 12){
				bingo.add(null);
			}else{
				bingo.add(r);
			}
		}

		System.out.println("----------------");
		for(int i = 0; i < bingo.size(); i++){
			if(bingo.get(i) == null){
				System.out.print("|　");
				c++;
			}else if(bingo.get(i) < 10){
				System.out.print("|"+ bingo.get(i)+" ");
				c++;
			}
			else{
				System.out.print("|"+ bingo.get(i));
				c++;
			}
			if(c == 5){
				System.out.println("|");
				System.out.println("----------------");
				c = 0;
			}
		}

		for(int j = 1; true; j++){

			System.out.println();

			System.out.print(j +"回目の抽選→Enterキーを押してください");
			Scanner s = new Scanner(System.in);
			s.nextLine();
			r = new Random().nextInt(99)+1;
			while(lottery.contains(r)){
				r = new Random().nextInt(99)+1;
			}

			lottery.add(r);

			System.out.println("抽選結果:" + r);
			for(int i = 0; i < bingo.size(); i++){
				if(bingo.get(i)==null){
					continue;
				}
				if(bingo.get(i) == r){
					bingo.set(i,null);
					break;
				}
			}

			System.out.println("----------------");

			for(int i = 0; i < bingo.size(); i++){
				if(bingo.get(i) == null){
					System.out.print("|　");
					c++;
				}else if(bingo.get(i) < 10){
					System.out.print("|"+ bingo.get(i)+" ");
					c++;
				}
				else{
					System.out.print("|"+ bingo.get(i));
					c++;
				}
				if(c == 5){
					System.out.println("|");
					System.out.println("----------------");
					c = 0;
				}
			}
			if(bingo.get(0) == null && bingo.get(1) == null && bingo.get(2) == null && bingo.get(3) == null && bingo.get(4) == null
					|| bingo.get(5) == null && bingo.get(6) == null && bingo.get(7) == null && bingo.get(8) == null && bingo.get(9) == null
					|| bingo.get(10) == null && bingo.get(11) == null && bingo.get(12) == null && bingo.get(13) == null && bingo.get(14) == null
					|| bingo.get(15) == null && bingo.get(16) == null && bingo.get(17) == null && bingo.get(18) == null && bingo.get(19) == null
					|| bingo.get(20) == null && bingo.get(21) == null && bingo.get(22) == null && bingo.get(23) == null && bingo.get(24) == null
					|| bingo.get(0) == null && bingo.get(5) == null && bingo.get(10) == null && bingo.get(15) == null && bingo.get(20) == null
					|| bingo.get(1) == null && bingo.get(6) == null && bingo.get(11) == null && bingo.get(16) == null && bingo.get(21) == null
					|| bingo.get(2) == null && bingo.get(7) == null && bingo.get(12) == null && bingo.get(17) == null && bingo.get(22) == null
					|| bingo.get(3) == null && bingo.get(8) == null && bingo.get(13) == null && bingo.get(18) == null && bingo.get(23) == null
					|| bingo.get(4) == null && bingo.get(9) == null && bingo.get(14) == null && bingo.get(19) == null && bingo.get(24) == null
					|| bingo.get(0) == null && bingo.get(6) == null && bingo.get(12) == null && bingo.get(18) == null && bingo.get(24) == null
					|| bingo.get(4) == null && bingo.get(8) == null && bingo.get(12) == null && bingo.get(16) == null && bingo.get(20) == null
					){
				System.out.println("BINGO!!");
				break;
			}
		}

	}

}
