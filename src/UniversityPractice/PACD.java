package UniversityPractice;

public class PACD {

    public static void main(String[] args) {
        Controller c1 = new Controller();
        c1.addElement(12,8);
        c1.addElement(14,7);
        c1.addElement(2,4);
        c1.addElement(5,5);
        c1.addElement(1,9);
        c1.addElement(0,7);
        c1.addElement(4,7);
        c1.addElement(7,7);
        c1.addElement(8,7);
        c1.addElement(78,7);
        //c1.addElement(12,7);
        c1.displayAmountOfElements();
        System.out.println("//////////////////////////");
        //c1.deleteByIndex(15);
        c1.displayIndexesOfArray();
        //c1.deleteByIndex(2);
        //c1.displayAmountOfElements();
        //c1.swipeByIndexes(5,0);
        //c1.displayElementsOfArray();
        //System.out.println(c1.arrayOfAddedIndexes.length);
        }
}

class Controller{
    int[] arrayOfElements = new int[100];
    int amountOfElements = 0;
    int[] arrayOfAddedIndexes = new int[100];
    int amountOfIndexes = 0;

    void addElement(int index, int number){
        arrayOfElements[index] = number;
        amountOfElements++;
        System.out.println("Element with index[" + index + "] has a number: " + number);
        //arrayOfAddedIndexes[amountOfIndexes] = index;                                           // Should be inside if
        amountOfIndexes++;
        int counter = 0;
            while(index > arrayOfAddedIndexes[counter] && counter < amountOfIndexes){
                counter++;
            }
            if(counter != amountOfIndexes){
                int temp1 = arrayOfAddedIndexes[counter];
                arrayOfAddedIndexes[counter] = index;
                while(counter < amountOfIndexes + 1){
                    int temp2 = arrayOfAddedIndexes[counter + 1];
                    arrayOfAddedIndexes[counter + 1] = temp1;
                    temp1 = temp2;
                    counter++;
                }
                arrayOfAddedIndexes[counter] = arrayOfAddedIndexes[counter];

            }else {
                arrayOfAddedIndexes[amountOfIndexes - 1] = index;
            }
    }

    void deleteByIndex(int index){
        int counter = 0;
        while(arrayOfAddedIndexes[counter] != index && counter < amountOfIndexes){
            counter++;
        }
        if(counter != amountOfIndexes){
            arrayOfElements[index] = 0;
            amountOfElements--;
            amountOfIndexes--;
            System.out.println("Element with index[" + index + "] was deleted");
        }else {
            System.out.println("Can't delete element with index[" + index + "], because it does not exist");
        }
    }

    void swipeByIndexes(int index1, int index2){
        int temp = arrayOfElements[index1];
        arrayOfElements[index1] = arrayOfElements[index2];
        arrayOfElements[index2] = temp;
        System.out.println(arrayOfElements[index1] + " and second " + arrayOfElements[index2]);
    }

    void displayAmountOfElements(){
        System.out.println("The average amountOfElements is: " + amountOfElements);
    }

    void displayElementsOfArray(){
        for(int counter = 0; counter < amountOfIndexes; counter++)
        System.out.print("[" + arrayOfElements[arrayOfAddedIndexes[counter]] + "] ");
    }
    void displayIndexesOfArray(){
        for(int counter = 0; counter < amountOfIndexes; counter++)
            System.out.print("[" + arrayOfAddedIndexes[counter] + "] ");
    }
}


//        int n = 100;
//        int[] arrayOfElements = new int[n];
//        arrayOfElements[0] = 4;
//        arrayOfElements[1] = 15;
//        arrayOfElements[2] = 88;
//        arrayOfElements[3] = 35;
//        arrayOfElements[4] = 90;
//        arrayOfElements[5] = 255;
//        arrayOfElements[6] = 64;
//        arrayOfElements[7] = 25;
//        arrayOfElements[8] = 46;
//        int amountOfElements = 9;
//        for (int i = 0; i < amountOfElements; i++){
//            System.out.print(arrayOfElements[i] + " ");

/*void deleteByIndex(int index){                                                            // method with BREAK
        for(int pointer = 0; pointer < amountOfIndexes; pointer++){
            if(arrayOfAddedIndexes[pointer] == index && pointer < amountOfIndexes - 1){
                arrayOfElements[index] = 0;
                amountOfElements--;
                System.out.println("Element with index[" + index +"] was deleted");
                break;
            }
            else if(pointer == amountOfIndexes - 1){
                System.out.println("Can't delete element with index[" + index + "], because it does not exist");
            }
        }

    }*/