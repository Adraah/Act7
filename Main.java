import java.util.Scanner;

class Calculo {
    public static void primo(int n){
        int  i,p,count,flag;
        p=2;
        i=1;
        while(i<=n)
        {
            flag=1;
            for(count=2;count<=p-1;count++)
            {
                if(p%count==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(p+" ");
                i++;
            }
            p++;
        }
        System.out.println();
    }

    public static void fibonacci(int a){
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);

        for(int i=2;i<a;++i)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese numero:");
        int n = myObj.nextInt();
        System.out.println("Numeros primos:");
        Calculo.primo(n);
        System.out.println("Sucesion de fibonacci:");
        Calculo.fibonacci(n);
    }
}