class GCD {
    public static void main(String[] args) {
      System.out.println(GCD(20,30));
    }
    static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }
}
