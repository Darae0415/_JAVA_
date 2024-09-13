import java.time.LocalDate;

public class Hello {
  public static void main(String[] args){
    System.out.println("Hello World!!!");
    //여러분 사랑합니다.

     int var;

     var = 1;
     var = var + 1;

     int var2 = 3;
     float fvar = 1;
     float fvar2 = 1.0f;

     boolean bvar = true; //1
     boolean bvar1 = false; //0

     int ivar = 64;
     double dvar = 3.14;
     double res = (double)ivar + dvar;

     LocalDate ldvar;
     ldvar = LocalDate.now();
     System.out.println(ivar);
     System.out.print(ivar);
     System.out.printf("%d\n", ivar);
     System.out.printf("%f\n", (float)ivar);
     System.out.printf("%c\n", (char)ivar);
     System.out.printf("%s\n", ivar);

  }
}