class HelloWorld {
    //Maximum
    static int Max(int[] array){
        int max=array[0];
        for(int i=0;i<5;i++){
            if(max<=array[i]){
                max=array[i];
            }
        }
        return max;
    }
    //Minimum
        static int Min(int[] array){
        int min=array[0];
        for(int i=0;i<5;i++){
            if(min>=array[i]){
                min=array[i];
            }
        }
        return min;
    }
    
    static void LCM(int x, int y){
        int gcd=1;
        for(int i=1;i<=x&&i<=y;++i){
            if(x%i==0&&y%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm= (x*y)/gcd;
        System.out.println(lcm);
        
    }
    public static void main(String[] args) {
        int[] arr={5, 3, 6, 4, 5};
        int mx=Max(arr);
        int mn=Min(arr);
        LCM(mx,mn);
    }
}