public class AddTwoMatrix {
    public static void addTwoDiagonal(int a[][],int b[][]){
        int c[][]=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int a[][]={{1,2,3},{5,3,4},{1,3,5}};
        int b[][]={{4,5,6},{1,7,8},{1,3,7}};
        addTwoDiagonal(a,b);
    }
}
