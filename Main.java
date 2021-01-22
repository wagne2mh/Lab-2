class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int totalMnM;
    double colorBlue;
    double colorBrown;
    double colorGreen;
    double colorOrange;
    double colorRed;
    double colorYellow;
    totalMnM = 55*11;
    colorBlue = totalMnM * .24;
    colorBrown = totalMnM *.13;
    colorGreen = totalMnM *.16;
    colorOrange = totalMnM *.20;
    colorRed = totalMnM *.13;
    colorYellow = totalMnM *.14;
    System.out.println("blue: " + colorBlue);
    System.out.println("brown: " + colorBrown);
    System.out.println("green: " + colorGreen);
    System.out.println("orange: " + colorOrange);
    System.out.println("Red: " + colorRed);
    System.out.println("yellow: " + colorYellow);
    double sumColor = (colorBlue + colorBrown + colorGreen + colorOrange + colorRed + colorYellow);
     System.out.println("Sum: " + sumColor);
     if (colorBlue > colorBrown && colorRed > colorOrange)
      System.out.println("Blue over Brown and Red over Orange ");
      if (colorBrown <= colorGreen)
      System.out.println("Brown is less than or equal to green");
      if (sumColor == totalMnM)
      System.out.println("Numbers Match");
  }
}
