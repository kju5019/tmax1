package practice.ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class no_10 {

	public static void main(String[] args) {
		//HashSet으로 중복 없이 1~30중 25개의 숫자를 뽑아낸다.
		Set set = new HashSet();						
		int[][] board = new int[5][5];
		for (int i = 0; set.size() < 25; i++) {
			set.add((int) (Math.random() * 30) + 1 + "");
		}
		
		
		Iterator it = set.iterator();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}
