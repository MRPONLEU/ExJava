package Ex1;
import java.util.*;
import java.io.File;
public class Ex1 {
    public static void main(String[] args)throws java.io.IOException {
        String[] phoneNumber=new String[4];
        Scanner sc =new Scanner(new File("C:/Users/PONLEU-IT/Desktop/Ph.txt"));
        int idx=0;
        while(sc.hasNext()){
            phoneNumber[idx]=sc.nextLine();
            System.out.println(phoneNumber[idx]);
            idx++;
        }
    }
}
