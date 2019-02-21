package UniversityPractice;

public class PACD {
    public static void main(String[] args) {
        Controller c1 = new Controller();
        c1.addElement(12,8);
        c1.addElement(14,7);
        c1.addElement(2,4);
        c1.addElement(5,5);
        c1.addElement(1,9);
        c1.addElement(0,17);
        c1.addElement(4,64);
        c1.addElement(7,94);
        c1.addElement(8,28);
        c1.addElement(78,55);
        //c1.addElement(12,7);
        c1.displayAmountOfAddedElements();
        //c1.deleteByIndex(15);
        c1.displayIndexesOfArray();
        c1.deleteByIndex(2);
        c1.displayIndexesOfArray();
        //c1.deleteByIndex(2);
        //c1.displayAmountOfAddedElements();
        c1.swipeByIndexes(5,0);
        //c1.displayAddedElementsOfArray();
        //System.out.println(c1.arrayOfAddedIndexes.length);
        System.out.println(c1.amountOfElements);
        c1.deleteByKey(65);
        c1.displayAddedElementsOfArray();
    }
}

class Controller{
    int[] arrayOfElements = new int[100];                                                           //main array to work with
    int amountOfElements = 0;                                                                       //counter of all amount of added elements for easier work with loops and better output of array
    int[] arrayOfAddedIndexes = new int[100];                                                       //additional array for adding only edited indexes

    void addElement(int index, int key){                                                            //method that adds new element by index && key
        arrayOfElements[index] = key;
        amountOfElements++;
        System.out.println("Element with index[" + index + "] has a key: " + key);
        int counter = 0;
            while(index > arrayOfAddedIndexes[counter] && counter < amountOfElements){              //implementation of sorting indexes
                counter++;
            }
            if(counter != amountOfElements){                                                        //if after while we get NOT last element than use variable counter to get the right place (index) where that new index should be, than do shift
                int temp1 = arrayOfAddedIndexes[counter];
                arrayOfAddedIndexes[counter] = index;
                while(counter < amountOfElements + 1){
                    int temp2 = arrayOfAddedIndexes[counter + 1];
                    arrayOfAddedIndexes[counter + 1] = temp1;
                    temp1 = temp2;
                    counter++;
                }
                arrayOfAddedIndexes[counter] = arrayOfAddedIndexes[counter];
            }else {
                arrayOfAddedIndexes[amountOfElements - 1] = index;                                  //if counter exit on last element - just write it in the end of array
            }
    }

    void deleteByKey(int key){                                                                      //method that deletes element by key
        int counter = 0;
        while(arrayOfElements[counter] != key && counter < amountOfElements){                       //checks where counter exit from while, than makes a decision about existing of this element inside array
            counter++;
        }
        if(counter == amountOfElements){                                                            //when exit with last index - than make a decision that that element do not exist
            System.out.println("Can't delete element with key " + key + ", because it does not exist");
            }
        else {                                                                                      //else just deletes and assign to 0
            arrayOfElements[counter] = 0;
            System.out.println("Element with key " + key + " was deleted");
        }
    }

    void deleteByIndex(int index){                                                                  //the same one, but with indexes
        int counter = 0;
        while(arrayOfAddedIndexes[counter] != index && counter < amountOfElements){
            counter++;
        }
        if(counter != amountOfElements){
            arrayOfElements[index] = 0;
            System.out.println("Element with index[" + index + "] was deleted");
            while(index < amountOfElements){                                                        //sorts indexes
                arrayOfAddedIndexes[index] = arrayOfAddedIndexes[index + 1];
                index++;
            }
            amountOfElements--;

        }else {
            System.out.println("Can't delete element with index[" + index + "], because it does not exist");
        }
    }

    void swipeByIndexes(int index1, int index2){                                                    //method that swipes two indexes using temporary variable
        int temp = arrayOfElements[index1];
        arrayOfElements[index1] = arrayOfElements[index2];
        arrayOfElements[index2] = temp;
        System.out.println(arrayOfElements[index1] + " and second " + arrayOfElements[index2]);     //just to check that it works
    }

    void displayAmountOfAddedElements(){                                                            //method that displays average amount of added elements (for debugging or something)
        System.out.println("The average amountOfElements is: " + amountOfElements);
    }

    void displayAddedElementsOfArray(){                                                             //method that displays ONLY added elements (NOT all 100)
        int counter;
        System.out.print("Array of keys: ");
        for(counter = 0; counter < amountOfElements - 1; counter++) {
            System.out.print("[" + arrayOfElements[arrayOfAddedIndexes[counter]] + "]" + "," );     //uses arrayOfIndexes to extract ONLY added elements (NOT all 100)
        }
        System.out.println("[" + arrayOfElements[arrayOfAddedIndexes[counter]] + "]" + "." );
    }
    void displayIndexesOfArray(){                                                                   //method that displays only indexes of added elements
        int counter;
        System.out.print("Array of indexes: ");
        for(counter = 0; counter < amountOfElements - 1; counter++) {
            System.out.print("[" + arrayOfAddedIndexes[counter] + "]" + ",");
        }
        System.out.println("[" + arrayOfAddedIndexes[counter]+ "]" + ".");
    }
}

/*void deleteByIndex(int index){                                                                    //method with BREAK (first edition, but later I decided to use WHILE)
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