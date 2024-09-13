import java.time.LocalDate;

public class Hello {
  public static void main(String[] args){

    System.out.println("Hello World!");
    // 여러분 안녕하세요~
    /* 이건 주석이래요~ 
     * 주석이2
     * 주석이3
     짜잔 주석이4
     * 0 , 1 = 2진수
     * 000 001 010 011 100 101 110 111 = 8진수
     * 
     * 0 1 : 논리데이터
     * 
     * 변수 타입 ▶ char = 문자 , string = 문자열 , byte/short/int/long = 정수 , flat/double = 실수 , boolean = 논리형(참,거짓) , null : 값이 비어있는 형
     * 
     * 변수 : 변하는 데이터 저장소
     * 변수선언 : 변수타입 변수명; => int a;
     * 변수명은 단독으로 숫자로 불가능, 특수문자는 _ , $ 사용가능 
     * 
     * int apple_number; => int appleNumber; : _n을 N으로 쓰는건 파스칼
    */
    int var;
    var = 1;
    var = var + 1;

    int var2 = 3;
    float fvar = 3;
    float fvar2 = 1.0f;
    /*
     * 아스키코드 : 7비트 부호체계
     * 유니코드 : 4바이트로 표현하는 코드
     * EUC-KR : 2바이트로 표현할 수 있는 코드
     * 
     *
    */ 
    boolean bvar = true;
    boolean bvar1 = false;

    int ivar = 1;
    double dvar = 3.14;
    double res = (double) ivar + dvar;

    // 날짜데이터 : 2024-09-12
    LocalDate ldvar;
    ldvar = LocalDate.now();
    System.out.println(ldvar);
    
    /*
    Stream
    System.in  : 사용자 입력 데이터를 처리
    System.out : 사용자 출력 데이터를 처리
    buffer : 데이터를 저장한 후 한꺼번에 처리하기 위해 저장되는 임시저장소
    */ 
    System.out.println(ivar);
    System.out.print(ivar);
    System.out.printf("%d", ivar);
    System.out.printf("%f", (float)ivar);
    System.out.printf("%c", (char)ivar);
    System.out.printf("%s", ivar);


    /*
     * \n : 줄 바꿈
     * \t : 탭 크기만큼 이동
     * \\ : 화면에 출력되지 않는 제어문자들을 표기
     *  ex> 줄바꿈 명령어는 \\n
     * 
     * Scanner : 다양한 타입의 입력값을 읽어오기 위한 함수
     * next() : 문자열
     * nextLine() : 한 라인 전체를 읽어옴
     * nextByte() , nextInt() , nextLong() , nextFloat() , nextDouble()은 숫자
     * 사용법 Scanner 변수명 = new Scanner(System.in);
     * */ 
  }
}