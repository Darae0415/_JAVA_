public class LoopEx {
  public static void main(String[] args){
  int sum = 0;
  int num = 0;

    // while(true){
    //   ++num;
    //   if(num%2 != 0){
    //     continue;
    //   }
    //   sum += num;
    //   System.out.println("num : " + num);

    //   if(num >=10){
    //     break;
    //   }
    // }
    // System.out.println("1에서 10까지 짝수의 합 : " + sum);

    int [] arr = new int[5];

    for(int i=0; i<5; i++){
      arr[i] = 10+i;
    }

    for(int i=0; i<5; i++){
      System.out.println("arr["+i+"] = " + arr[i]);
    }
  }
}
