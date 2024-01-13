public class Patterns {
    public static void main(String[] args) {
        Patterns obj= new Patterns();
        obj.InvertedTriangle(5);

    }
    void printSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void printTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void printTriangle2(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }

    void printTriangle3(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }

    void InvertedTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

