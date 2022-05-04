package fortest;

import java.util.Scanner;

abstract class Game {
	private String gameName;
	private String gameProduction;
	private int gamePlayer;
	
	
	public Game(String gameName, String gameProduction, int gamePlayer) {
		super();
		this.gameName = gameName;
		this.gameProduction = gameProduction;
		this.gamePlayer = gamePlayer;
	}
	
	public Game() {
		super();
		this.gameName = "Elden Ring";
		this.gameProduction = "FromSoft";
		this.gamePlayer = 2000;
	}


	public String getGameName() {return gameName;}
	public void setGameName(String gameName) {this.gameName = gameName;}
	
	public String getGameProduction() {return gameProduction;}
	public void setGameProduction(String gameProduction) {this.gameProduction = gameProduction;}

	public int getGamePlayer() {return gamePlayer;}
	public void setGamePlayer(int gamePlayer) {this.gamePlayer = gamePlayer;}
	
	@Override
	public String toString() {
		return "Game [gameName=" + gameName + ", gameProduction=" + gameProduction + ", gamePlayer=" + gamePlayer + "]";
	}


	public abstract String cheatKey();
}

class Minecraft extends Game {

	
	public Minecraft() {
		super();
	}

	public Minecraft(String gameName, String gameProduction, int gamePlayer) {
		super(gameName, gameProduction, gamePlayer);
	}

	@Override
	public String cheatKey() {
		return "ShowMeTheMoney";
	}
	
}

/*
 * 상속 문제!
 * 
 * 부모 클래스인 Game 클래스를 생성한다.
 * Game 클래스는 
 * gameName(게임이름), gameProduction(제작사), gamePlayer(한 판당 최대 인원)
 * 을 멤버변수로 갖는다.
 * 
 * 그리고, Game 클래스를 상속받는 "본인이 좋아하는 게임이름" 클래스를 만들고,
 * 해당 게임의 특징을 멤버변수로 갖는 자식 클래스 두 개를 생성한다.
 * 
 * JavaBeans와 toString을 이용하여 main메서드에서 해당 게임의 정보를 출력하시오!
 * 
 * 게임의 특징 ex) 게임 장르, 게임의 캐릭터 수, 한 판 당 걸리는 시간 등,,
 * 
 */


class Hello{
	public void say() {
		System.out.println("Hello");
	}
}

class Korean extends Hello{
	@Override
	public void say() {
		System.out.println("안녕하세요.");
	}
	
	public void talk() {
		System.out.println("또 만났군요.");
	}
}

public class Main01 {

	public static void main(String[] args) {
		
		Minecraft m = new Minecraft();
		System.out.println(m);

		System.out.println(m.toString());
		System.out.println(m.cheatKey());
		
		/*
	
		Hello h = new Korean();
		h.say();
		// talk는 Hello 클래스에 정의된 기능이 아니므로 에러
		//h.talk();
		
		Korean k = new Korean();
		k.say();
		k.talk();
		
		*/
		
	}

}