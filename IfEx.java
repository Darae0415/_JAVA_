import java.util.Scanner;

public class IfEx {
  public static void main(String[] args) {
    // int kor;
    // int sum;

    // kor = 90;

    // sum = kor + 90 + 90;
    // System.out.println("Interbal");

    // kor = 90;
    // sum = kor + 90;

    Scanner sc = new Scanner(System.in);
  //   int count;
  //   System.out.println("방문횟수 : ");
  //   count = sc.nextInt();

  //   if(count < 1){
  //     System.out.println("처음 방문하셨군요. 5층 안내센터에서 커피쿠폰 받아가세요.");
  //   } else{
  //     if(count > 10){
  //       System.out.println("단골 고객님. 5층 안내센터에서 5캐럿 다이아 받아가세요.");
  //     }else{
  //       System.out.println("VIP고객님. 5층 안내센터에서 샤넬가방 받아가세요.");
  //     }
      
  // }
  // System.out.printf("행복한 쇼핑 시간 보내세요. \n 방문횟수 : %d", ++count);

  System.out.print("점수입력 : ");
  System.out.println();

  int scope = sc.nextInt();
  char grade = 0;

  int lavel = scope / 10;
  switch (lavel) {
    case 10 :
      grade = 'A';
      break;
    case 9 :
      grade = 'B';
      break;
    case 8 :
      grade = 'C';
      break;
    case 7 :
      grade = 'D';
      break;
    default:
      grade = 'F';
      break;
  }
  
  System.out.println("점수 : "+scope);
  System.out.println("등급 : "+grade);
}
}
