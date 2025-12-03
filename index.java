class index{
    public static void main(String[] args) {
        int n=7;
        boolean prime=true;

        for(int i=2; i< n/2;i++){
            if(n%i==0){
                prime=false;
                break;
            }
            if(prime){
            System.out.println("this is the prime number :"+prime);
            }
            else{
                System.out.println("this is the not prime number :"+prime);
            }
        }
    }
}