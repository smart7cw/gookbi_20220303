package test0412pm;

public class MyTv {
	private boolean isPowerOn;		// 파워
	private int channel;			// 채널
	private int volume;				// 볼륨
	private int prevChannel; 		// 이전 채널
	
	final int MAX_VOLUME = 100;		// 최대볼륨
	final int MIN_VOLUME = 0;		// 최소볼륨
	final int MAX_CHANNEL = 100;	// 최대채널
	final int MIN_CHANNEL = 1;		// 최소채널

	public void setVolume(int volume) {
		// 1.volume이 최대 볼륨보다 크고, 최소볼륨보다 작고, 파워가 꺼져있으면 볼륨 설정 불가능  
		// (재사용성 확보와 중복 개발을 회피하기 위하여ㆍ전체 시스템 차원과 단위 시스템 차원의 공통부분을 식별하여 이에 대한 상세 명세를 작성할 수 있다.5)
		if ( !this.isPowerOn || volume > this.MAX_VOLUME || volume < this.MIN_VOLUME) {
			return;
		}	//1.
		
		// 2.전역변수 volume에 param값 volume 할당
		// (개발할 응용소프트웨어의 전반적인 기능과 구조를 이해하기 쉬운 크기로 공통 모듈을 설계할 수 있다.5)
		this.volume = volume;	//2.
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		// 3.channel이 최대 채널보다 크고, 최소 채널보다 작고, 파워가 꺼져있으면 채널 설정 불가능
		// (재사용성 확보와 중복 개발을 회피하기 위하여ㆍ전체 시스템 차원과 단위 시스템 차원의 공통부분을 식별하여 이에 대한 상세 명세를 작성할 수 있다.5)
		if ( !this.isPowerOn || channel > this.MAX_CHANNEL || channel < this.MIN_CHANNEL) {
			return;
		}	//3.
		
		// 4.현재 채널을 이전 채널에 저장한다.
		// (개발할 응용소프트웨어의 전반적인 기능과 구조를 이해하기 쉬운 크기로 공통 모듈을 설계할 수 있다.5)
		this.prevChannel = this.channel;	//4.
		
		// 5.전역변수 channel에 param값 channel 할당
		// (개발할 응용소프트웨어의 전반적인 기능과 구조를 이해하기 쉬운 크기로 공통 모듈을 설계할 수 있다.10)
		this.channel = channel;		//5.
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		// 6.전역변수 isPowerOn에 param값 isPowerOn 할당
		// (재사용성 확보와 중복 개발을 회피하기 위하여ㆍ전체 시스템 차원과 단위 시스템 차원의 공통부분을 식별하여 이에 대한 상세 명세를 작성할 수 있다.10)
		this.isPowerOn = isPowerOn;		//6.
	}

	public int getChannel() {
		return channel;
	}

	// 7.현재 체널을 이전 채널로 변경한다
	// (개발할 응용소프트웨어의 전반적인 기능과 구조를 이해하기 쉬운 크기로 공통 모듈을 설계할 수 있다.10)
	public void gotoPrevChannel() {
		int temp = this.channel;			//7.
		this.channel = this.prevChannel;	//7.
		this.prevChannel = temp;			//7.
	}

	// 8.toString() 생성
	// (소프트웨어 측정지표 중 모듈 간의 결합도는 줄이고 개별 모듈들의 내부 응집도는 높이기 위한 공통모듈을 설계할 수 있다.10)
	@Override
	public String toString() {
		return "MyTv [isPowerOn=" + this.isPowerOn + ", channel=" + this.channel + ", volume=" + this.volume + ", prevChannel="
				+ this.prevChannel + ", MAX_VOLUME=" + this.MAX_VOLUME + ", MIN_VOLUME=" + this.MIN_VOLUME + ", MAX_CHANNEL="
				+ this.MAX_CHANNEL + ", MIN_CHANNEL=" + this.MIN_CHANNEL + "]";
	}	//8.
	
	
}