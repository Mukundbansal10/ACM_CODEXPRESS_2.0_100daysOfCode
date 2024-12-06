import java.util.Scanner;

public class HR_TrekkingGroupStaminaCheck {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int T = scan.nextInt();
            for(int t=0;t<T;t++){
                int n = scan.nextInt();
                int[] s = new int[n];

                for(int j=0;j<n;j++){
                    s[j] = scan.nextInt();
                }
                int even=0,odd=0;
                for (int i = 0; i < s.length; i++) {
                    if (s[i]%2==0) even++;
                    else odd++;
                }
                if (even>odd) System.out.println("Yes");
                else System.out.println("No");
            }

        }
    }


