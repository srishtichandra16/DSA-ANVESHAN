import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int num = 0;
//        int temp = n;
//        while (temp != 0) {
//            a = temp % 10;
//            temp = temp / 10;
//            num = num * 10 + a;
//        }
//        if (num == n) {
//            System.out.println("palidrom");
//        }


        //question 2;
//        System.out.println("enter first number:");
//        int b = sc.nextInt();
//        System.out.println("enter second number:");
//        int c = sc.nextInt();
//        System.out.println("enter your choice:");
//        char op = sc.next().trim().charAt(0);
//        switch (op) {
//            case '+':
//                System.out.println(b + c);
//                break;
//            case '-':
//                System.out.println(c - b);
//                break;
//            case '*':
//                System.out.println(b * c);
//                break;
//            case '/':
//                if (b != 0) {
//                    System.out.println(b / c);
//                }
//                break;
//            case '%':
//                System.out.println(b % c);
//                break;
//            default:
//                System.out.println("invalid operator");
//        }
       // question 3
//        int n1= sc.nextInt();
//        int rem =0;
//        int pw=0;
//        int deci =0;
//        while(n1!=0){
//          rem = n1%10;
//            deci = deci+(rem*(int)Math.pow(2,pw));
//            n1=n1/10;
//            pw++;
//        }
        //question 4
//        System.out.println("decimal form = "+ deci);
//        int numb = sc.nextInt();
//        int ans = 0;
//        int rem = 0;
//        int temp = numb;
//        while (temp != 0) {
//            rem = temp % 10;
//            ans = ans * 10 + rem;
//            temp = temp / 10;
//        }
//        System.out.println("reverse of " +numb+" = "+ ans);

        //question 6;

        //char op = sc.next().trim().charAt(0);
//            int tempo=0;
//        System.out.println("enter value of x");
//            int x= sc.nextInt();
//        System.out.println("enter value of y");
//            int y= sc.nextInt();
//            tempo=x;
//            x=y;
//            y=tempo;
//            System.out.println("value of x = " + x + " "+ " value of y = "+ y);

       //question 7;
//        System.out.print("enter your choice:");
//        char ch  = sc.next().trim().charAt(0);
//        if((ch=='A'&&ch =='Z')|| (ch=='a'&& ch =='z')){
//            System.out.println("it is a alphabet");
//        }
//        if((ch>='0'&&ch<='9')){
//            System.out.println("it is a digit");
//        }
//        else {
//            System.out.println(" it is  a special character");
//        }

        //question 8;
        int[][] a ={{1,1,1},{2,2,2},{3,3,3}};
        int [][] b = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] c= new int[3][3];
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
            c[i][j]=0;
            for(int k=0;k<3;k++){
                c[i][j] +=a[i][k]*b[k][j];
            }
                System.out.print(c[i][j]+" ");
        }
            System.out.println();
}
}}
