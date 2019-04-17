public class Examples {

    public int fibonnaci_recursive(int n){
        if(n<0){
            return -1;
        }
        if (n<2){
            return n;
        }
        else {
            return fibonnaci_recursive(n - 1) + fibonnaci_recursive(n - 2);
        }
    }
    public int fibonaci_normal(int n){
        int sum =0;
        if(n<0){
           sum =-1;
        }
        else {
            if (n == 1)
                sum = 1;
        }
        if(n==2){
            sum=1;
        }
        if(n>2){
            sum=1;
            int temp1 = 0;
            int temp2 = 1;
            for(int i =2;i<=n;i++){
                sum = temp1+temp2;
                temp1=temp2;
                temp2 = sum;

            }
        }


        return sum;
    }

    public int fibonaci_normal2(int n){
        int sum=0;
        if(n<0){
            return -1;
        }
        if(n<=2){
            return n;
        }
        int res = 1;
        int temp1 =0;
        int temp2 =1;
        for(int i=2;i<=n;i++){
            sum = temp1 + temp2;
            temp1=temp2;
            temp2=sum;
            res+=sum;

        }
        return res;
    }

    public static void main(String [] args){
        Examples example = new Examples();

    }
}
