import java.util.Scanner;

/*q1 */

/*public class exercice1 {
    public static void main(String[] args) throws Exception {
        int[] myNum = {10, 20, 30, 40};
        for (int i =0;i<myNum.length;i++){
            System.out.println(myNum[i]);
        }
    }
}*/

/*q2 */

public class exercice1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--->");
        int n = scanner.nextInt();

        if ( n%2 == 0 ){
            System.out.println("le nombre est paire");
        } else {
            System.out.println("le nombre est impaire");
        }

        scanner.close();
        
    }
}


/*q3 */
/* 
public class exercice1{
public static void main(String[] args) throws Exception {
    int myNum = 0;
    for (int i =0;i<11;i++){
        myNum += i;
        
    }
 System.out.println(myNum);
}
}
*/