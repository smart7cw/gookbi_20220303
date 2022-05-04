package test0412am;

public class Main01 {

	public static void main(String[] args) {
		
		// 4. arr 배열에 DanceRobot, SingRobot, DrawRobot 객체 생성
		// (소프트웨어 공학기술의 요구사항 도출 기법을 활용하여 업무 분석가가 제시한 분석모델에 대해서 확인할 수 있다.10)
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };	//4.

		for(int i=0; i< arr.length;i++) {
			// 5. 반복문을 통해서 action() 메서드 호출
			// (업무 분석가가 제시한 분석모델이 개발할 응용소프트웨어에 미칠 영향을 검토하여 기술적인 타당성 조사를 할 수 있다.10)
			action(arr[i]);		//5.
		}

	}
	
	public static void action(Robot r) {
		// 6. 파라미터로 넘어온 객체 r이 DanceRobot인지 체크  
		// (업무 분석가가 제시한 분석모델에 대해서 응용소프트웨어를 개발하기 위해 필요한 추가적인 의견을 제시할 수 있다.10)
		if(r instanceof DanceRobot) {	//6.
			// 7. r 객체를 DanceRobot 으로 명시적 객체 형변환한다.
			//(소프트웨어 공학기술의 요구사항 분석 기법을 활용하여 업무 분석가가 정의한 응용소프트웨어의 요구사항을 확인할 수 있다.3)
			DanceRobot dr = (DanceRobot)r;	//7.
			// 8. dance() 호출
			//(	개발하고자 하는 응용소프트웨어와 관련된 운영체제ㆍ데이터베이스관리시스템ㆍ미들웨어 등의 요구사항을 식별할 수 있다.3)
			dr.dance();	//8.
		// 9. 파라미터로 넘어온 객체 r이 SingRobot인지 체크
		// (업무 분석가가 제시한 분석모델에 대해서 응용소프트웨어를 개발하기 위해 필요한 추가적인 의견을 제시할 수 있다.10)
		} else if(r instanceof SingRobot) {	//9.
			// 10. r 객체를 SingRobot 으로 명시적 객체 형변환한다.
			//(소프트웨어 공학기술의 요구사항 분석 기법을 활용하여 업무 분석가가 정의한 응용소프트웨어의 요구사항을 확인할 수 있다.3)
			SingRobot sr = (SingRobot)r;	//10.
			// 11. sing() 호출
			//(	개발하고자 하는 응용소프트웨어와 관련된 운영체제ㆍ데이터베이스관리시스템ㆍ미들웨어 등의 요구사항을 식별할 수 있다.3)
			sr.sing();	//11.
		// 12. 파라미터로 넘어온 객체 r이 DrawRobot인지 체크
		// (업무 분석가가 제시한 분석모델에 대해서 응용소프트웨어를 개발하기 위해 필요한 추가적인 의견을 제시할 수 있다.10)
		} else if(r instanceof DrawRobot) {	//12.
			// 13. r 객체를 DrawRobot 으로 명시적 객체 형변환한다.
			//(소프트웨어 공학기술의 요구사항 분석 기법을 활용하여 업무 분석가가 정의한 응용소프트웨어의 요구사항을 확인할 수 있다.3)
			DrawRobot dr = (DrawRobot)r;	//13.
			// 14. draw() 호출
			//(	개발하고자 하는 응용소프트웨어와 관련된 운영체제ㆍ데이터베이스관리시스템ㆍ미들웨어 등의 요구사항을 식별할 수 있다.5)
			dr.draw();	//14.
		}
	}


}
