package UniversityPractice.Iliin;

public class ShiftArray {
    public static void main(String[] args) {
        HandlerTest h = new HandlerTest();
        //h.shift(3);
        h.shift(2);
        h.shift(1);
    }
}

class HandlerTest {
    int[] shift = {1,2,3,4,5,6};

    void shift (int n) {
        int temp1 = shift[0];
        for(int i = 0; i < n; i++){
            int temp2;
            for(int k = 0; k < shift.length - 1; k++){
                temp2 = shift[k + 1];
                shift[k] = temp2;
            }
            shift[shift.length - 1] = temp1;
            temp1 = shift[0];
        }
        for (int cou: shift){
            System.out.print(cou + " ");
        }
        System.out.println();
    }
}