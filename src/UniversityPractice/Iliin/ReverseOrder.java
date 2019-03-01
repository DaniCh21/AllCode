package UniversityPractice.Iliin;

public class ReverseOrder {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};              //source array
        int b[] = new int[a.length];                            //additional temporary array
        for(int i = 0, j=1; i<a.length; i++, j++){              //initializing array b with array a's reverse elements
            b[i]=a[a.length-j];
        }
        a=b;                                                    //assign reverse items back to array a
        for(int i: a){                                          //output
            System.out.print(i + " ");
        }
    }
}

