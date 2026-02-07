class LoopDemo {
  public static void main(String[] sandra) {
    int i;
    System.out.print(i + " ");
    
    System.out.println();
    i=1;
    while (i<=10) {
      System.out.print(i + " ");
      i+=1;
    }
    System.out.print(i + " ");
    i=1;
    do {
      System.out.print(i + " ");
      ++i;
    } while(i<=10);
    System.out.println()
      
    for(int x=1; x<=10; ++x) {
      for(int y=1; y<=10; ++y)
      System.out.print("[" + (x*y) + "]" + "\t");
      System.out.println();
    }
  }
}
