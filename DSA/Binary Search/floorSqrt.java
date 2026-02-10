public class floorSqrt {

        public static int sqr_t(int n){
            long lo = 0,hi = n;
            while(lo <= hi){
                long mid = (lo + hi)/2;
                if(mid * mid == n ) return (int)mid;
                else if(mid * mid > n) hi = mid -1;
                else lo = mid + 1 ;
            }
            return (int )hi;
        }



    public static void main(String[] args) {
        int n = 20 ;
        int x= sqr_t(n);
        System.out.println(x);

    }
}
