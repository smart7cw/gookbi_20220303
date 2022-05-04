package override;

class Hello3{
	public Hello3( String msg ) {
		System.out.println(msg);
	}
}

class Korean3 extends Hello3 {
	/*
	 * 부모와 동일한 파라미터를 받도록 생성자를 정의하고,
	 * 전달받은 파라미터를 부모에게 재전달 한다.
	 */
	public Korean3( String msg ) {
		super( msg );
	}
}


public class Main03 {

	public static void main(String[] args) {

	}

}
