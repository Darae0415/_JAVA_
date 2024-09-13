import java.util.Scanner;

public class IfEx2 {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    // int count;

    // System.out.println("방문 횟수 : ");
    // count = sc.nextInt();

    // if(count < 1){
    //   System.out.println("처음 방문하셨군요. 5층 안내 센터에서 커피 쿠폰 받아가세요");
    // }else if(count > 10){
    //     System.out.println("단골 고객님. 5층 안내 센터에서 5캐럿 다이아 받아가세요");
    // }else{
    //     System.out.println("VIP 고객님. 5층 안내 센터에서 샤넬 빽 받아가세요");
    // }

    // System.out.printf("행복한 소핑 시간 보내세요. \n방문횟수 : %d번\n", ++count);

    System.out.print("점수 입력 : ");
    System.out.println();

    int score = sc.nextInt();
    char grade = 'f';

    int level = score / 10;
    switch(level){
    case 10 :
    case 9 :
      grade = 'A';
    break;
    case 8 :
      grade = 'B';
      break;
    case 7 :
      grade = 'C';
      break;
    case 6 :
      grade = 'D';
      break;
    default:
      grade = 'F';
    }

    System.out.println("점수 : " + score);
    System.out.println("등급 : " + grade);

  }
}
