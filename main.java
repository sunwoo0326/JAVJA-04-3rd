Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    
    String months[] = {  
      "January", "February", "March", "April", 
      "May","June","July","August",
      "September","October","November","December"
  };
    int re = 0;

    System.out.println("해당 월의 영어 단어를 입력하시오");
    System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요.");
    
    do{
    int month = 1 + rand.nextInt(12);
  
    while(true){
    System.out.print(month + "월:");
    String s = sc.next();

    if (s.equals(months[month-1])) break; 
      System.out.println("틀렸습니다.");
    }  
      System.out.print("정답입니다.");
      System.out.print("다시 한번? 1....Yes / 0....No: ");
      re =  sc.nextInt();
  
    }while(re == 1);

    }
}
