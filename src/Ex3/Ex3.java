package Ex3;

public class Ex3 {
    public static void main(String[] args) {
        String[][] con=new String[2][4];
        con[0][0]="Name";
        con[1][0]="Tel";
        con[0][1]="vannda";
        con[0][2]="Theara";
        con[0][3]="Kunthea";
        con[1][1]="077 322 366";
        con[1][2]="077 321 543";
        con[1][3]="077 213 272";
        for(int st=0;st<2;st++) {
            System.out.print(con[st][0]+ "\t ");
        }
        System.out.print("\n");
        for(int st=0;st<4;st++) {
            System.out.println(con[0][st]+ "\t "+con[1][st]);
        }
    }
}
