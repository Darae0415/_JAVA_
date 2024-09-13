import java.util.Scanner;

public class TvFunc {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    Tv t = new Tv();

    boolean flag = true;
    while(flag){
      System.out.println("1. On/Off");
      System.out.println("2. 채널 지정");
      System.out.println("3. 채널 변경");
      System.out.println("4. 색상 변경");
      System.out.println("5. TV 정보");
      System.out.print("메뉴 선택 : ");

      int menu = sc.nextInt();
      sc.nextLine();

      switch(menu){
        case 1:
          t.setPower();
          break;
        case 2:
          System.out.print("채널 입력 : ");
          int ch = sc.nextInt();
          sc.nextLine();

          t.setChannel(ch);
          break;
        case 3:
          boolean f = true;
          while(f){
            System.out.print("UP(+)/Down(-) : ");
            String dir = sc.nextLine();

            if(dir.equals("+")){
              t.channelUp();
            }else if(dir.equals("-")){
              t.channelDown();
            }else{
              f=false;
            }
            System.out.println();
          }
          break;
        case 4:
          System.out.print("색상 입력 : ");
          String col = sc.nextLine();

          t.setColor(col);
          break;
        case 5:
          t.disp();
          break;
        default:
          System.out.println("프로그램 종료");
          flag = false;
      }
      System.err.println();
    }
    
  }
}