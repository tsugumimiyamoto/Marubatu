import java.util.Scanner;

public class Marubatu{
	public static void main(String [] args) {

		String [][] masume = new String [3][3];

		for(int a=0;a<3;a++) {
			for(int b=0;b<3;b++) {
				masume[a][b] = " ";
			}
		}
		for(int c=0;c<3;c++) {
			for(int d=0;d<3;d++) {
				System.out.println(masume[c][d]);
				if(c==2) {
				}
				System.out.print(" |");
			}
			System.out.println();
		}
	      System.out.println("◯×ゲームです。");
	      System.out.println("専攻は◯、後攻は×です。");
	      System.out.println("0〜2の数字を入力してください。");

	      String x="◯";
	      String y="×";
	      boolean repeat = true;
	      int num = 0;
	      while(repeat) {
	    	  String e;
	      if (num%2==0) {
	    	  e ="◯";
	    	  }else {
	    		  e= "×";
	    	  }
			System.out.println(e+"の番です。");
			Scanner sc = new Scanner(System.in);
			System.out.println("1個目の数字を入力してください。");
			int num1 = sc.nextInt();
			if(num1 <0 | num1 >2) {
				System.out.println("その数字は入力できません。もう一度入力してください。");
				continue;
			}
			System.out.println("2個目の数字を入力してください。");
			int num2 = sc.nextInt();
			if(num2 <0| num2 >2) {
				System.out.println("その数字は入力できません。もう一度入力してください。");
				continue;
			}
			if(masume[num1][num2]!=" ") {
				System.out.println("そこにはすでに入っています。もう一度入力してください。");
				continue;
			}
			masume[num1][num2] = e;
			for(int c = 0;c < 3;c++ ){
				for(int d = 0;d < 3;d++ ){
					System.out.print(masume[c][d]);
					if(d==2){
						continue;
					}
		          System.out.print("|");
		        }
		        System.out.println(" ");
			}
			        if((masume[0][0]==e&&masume[0][1]==e&&masume[0][2]==e)||(masume[1][0] == e&&masume[1][1]==e&&masume[1][2]==e)||(masume[2][0]==e&&masume[2][1]==e&&masume[2][2]==e)){
						System.out.println(e + "の勝ちです。");
						break;
					}
			        if((masume[0][0]==e&&masume[1][0]==e&&masume[2][0]==e)||(masume[0][1] ==e&&masume[1][1]==e&&masume[2][1]==e)||(masume[0][2]==e&&masume[1][2]==e&&masume[2][2]==e)){
			        	System.out.println(e + "の勝ちです。");
			        	break;
			        }
			        if((masume[0][0]==e&& masume[1][1]==e&& masume[2][2]==e)||(masume[0][2]==e&& masume[1][1]==e&& masume[2][0]==e)) {
			        	System.out.println(e + "の勝ちです。");
			        	break;
			        }else {
			        }
			        repeat =false;
			        for(int c=0;c<3;c++) {
			        	for(int d=0;d<3;d++) {
			        		if(masume[c][d]==" ") {
			        			repeat = true;
			        		}
			        	}
			        }
			        if(!repeat) {
			        	System.out.println("引き分けです。");
							}
			        num++;
		    }
	}
}