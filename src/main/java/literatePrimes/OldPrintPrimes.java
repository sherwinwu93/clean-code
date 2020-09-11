package literatePrimes;

public class OldPrintPrimes {
    public static void main(String[] args) {
        //要得出质数的数量
        final int M = 1000;
        //打印的列数
        final int RR = 50;
        //打印的行数
        final int CC = 4;
        final int ORDMAX = 30;
        //存储质数的数组
        int[] P = new int[M + 1];
        //页码
        int PAGENUMBER;
        //页码对应的偏移量
        int PAGEOFFSET;
        //行码对应的偏移量
        int ROWOFFSET;
        //行中的索引
        int C;
        //自然数起始
        int J;
        //质数索引
        int K;
        //质数标识
        boolean JPRIME;
        //存储质数的平方数量
        int ORD;
        //自然平方数
        int SQUARE;
        int N;
        int[] MULT = new int[ORDMAX + 1];

        J = 1;
        K = 1;
        P[1] = 2;
        ORD = 2;
        SQUARE = 9;

        while (K < M) {
            do {
                J = J + 2;
                if (J == SQUARE) {
                    /**
                     * J:9;ORD:2
                     * ORD=2+1=3;
                     * P:[0,2,3,5,7]
                     * SQUARE=P[3]*P[3]=5*5=25
                     * MULT[ORD-1]=MULT[2]=9
                     */
                    //SQUARE是下个质数的平方
                    //MULT[2]存储这些质数的平方
                    ORD = ORD + 1;
                    SQUARE = P[ORD] * P[ORD];
                    MULT[ORD - 1] = J;
                }
                /**
                 * 回到定义上去,质数?除了1和自身没有公约数
                 * 换句话描述:质数为x:x不能被[2, x-1]整除.
                 * todo wusd 离散数学时,注意这点
                 */
                N = 2;
                JPRIME = true;
                while (N < ORD && JPRIME) {
                    while (MULT[N] < J) {
                        System.out.format("start N->%10d,MULT->%10d,P->%10d", N, MULT[N], P[N]);
                        System.out.println();
                        MULT[N] = MULT[N] + P[N] + P[N];
                        System.out.format("end.. N->%10d,MULT->%10d,P->%10d", N, MULT[N], P[N]);
                        System.out.println();
                    }
                    if (MULT[N] == J)
                        JPRIME = false;
                    N = N + 1;
                }
            } while (!JPRIME);
            K = K + 1;
            P[K] = J;
        }
        {
            PAGENUMBER = 1;
            PAGEOFFSET = 1;
//            while (PAGEOFFSET <= M) {
            while (PAGEOFFSET <= 0) {
                System.out.println("The First " + M + " Prime Numbers --- Page " + PAGENUMBER);
                System.out.println("");
                for (ROWOFFSET = PAGEOFFSET; ROWOFFSET < PAGEOFFSET + RR; ROWOFFSET++) {
                    for (C = 0; C < CC; C++)
                        if (ROWOFFSET + C * RR <= M)
                            System.out.format("%10d", P[ROWOFFSET + C * RR]);
                    System.out.println("");
                }
                System.out.println("\f");
                PAGENUMBER = PAGENUMBER + 1;
                PAGEOFFSET = PAGEOFFSET + RR * CC;
            }
        }
    }
}
