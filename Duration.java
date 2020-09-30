import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);

            int N = s.nextInt();

            for(int i=0;i<N;i++)

            { int DH=0,DM=0; // Duration Hour and Duration Minute

            int SH= s.nextInt();

            int SM = s.nextInt();

            int EH = s.nextInt();

            int EM= s.nextInt();

            if(EM-SM==0) // Exact hours

            {

            DH = EH-SH;

            DM = 0;

            }

            else if(EM-SM<0) // Less than hours

                { DM = 60-SM+EM;

                DH = EH-SH-1;

                }

            else if(EM-SM>0) // More than hour

                { DH = EH-SH;

                DM = EM-SM;

                }

            System.out.println(DH+" "+DM);

            }
    }
}
