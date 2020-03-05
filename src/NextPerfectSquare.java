class Square {

   public  double  nextPerfectSquare(long input) {

    boolean result = false;
    double nps = 0;
    double val = Math.sqrt(input);
    if (val - Math.floor(val) == 0) {
      result = true;
    }
    if (result = true) {
      nps = (val + 1) * (val + 1);
    }
    return val;
  }
}
