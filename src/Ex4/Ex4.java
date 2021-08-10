package Ex4;

public class Ex4 {
    public static void main(String[] args) {
        String arr[][]= {
                {"Name","sex","age","tel"},
                {"vannda","Male","31","077 322 366"},
                {"Theara","Male","25","077 322 367"},
                {"Cheata","Female","18","012 213 272"}
        };
        for(int i=0;i< arr[0].length;i++) {
            System.out.print(arr[0][i]+"\t");
        }
        System.out.print("\n");
        int idx=1;
        while(idx<arr.length) {
            for(int i=0;i< arr[0].length;i++) {
                System.out.print(arr[idx][i]+"\t");
            }
            idx++;
            System.out.print("\n");
        }
    }
}
