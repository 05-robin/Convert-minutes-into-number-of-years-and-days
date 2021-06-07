
package pkgnew.project;

import java.util.Scanner;

public class NewProject {

    public static void main(String[] args) {
        int a;
        System.out.println("Input number of minutes: ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        float b=a/60;
        float c=b/24;
        float d=c/365;
        int e=(int) (c/365);
        float f=d-e;
        int g=(int) (f*365);
        System.out.println(a+" minutes is approximately "+e+" Years and "+g+" days");
        
        
    }
    
}
