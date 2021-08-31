package Lesson2;

public class Lesson2Exceptions {
    public static void myArrayException(String[][] stringArr) throws MyArraySizeException, MyArrayDataException {
        if ((stringArr.length!=4)||(stringArr[0].length!=4)) {
            throw new MyArraySizeException ("Wrong size");
        }
        int sum=0;
       for(int i=0; i<stringArr.length;i++){
           for(int j=0; j<stringArr.length;j++){
               try {
               sum=sum+Integer.parseInt(stringArr[i][j]);}
               catch (NumberFormatException nfe){
                   throw new MyArrayDataException(nfe.getMessage(), i,j);
               }
           }
       }

    }

    public static void main(String[] args){
        String[][] stringArr1= new String[4][4];
        stringArr1[0][0]="12";
        stringArr1[0][1]="12";
        stringArr1[0][2]="12";
        stringArr1[0][3]="12";
        stringArr1[1][0]="12";
        stringArr1[1][1]="12";
        stringArr1[1][2]="12";
        stringArr1[1][3]="12";
        stringArr1[2][0]="12";
        stringArr1[2][1]="12";
        stringArr1[2][2]="12";
        stringArr1[2][3]="12";
        stringArr1[3][0]="12";
        stringArr1[3][1]="12";
        stringArr1[3][2]="12";
        stringArr1[3][3]="12c";

        String[][] stringArr2= new String[3][3];
        stringArr2[0][0]="12";
        stringArr2[0][1]="12";
        stringArr2[0][2]="12";
        stringArr2[1][0]="12";
        stringArr2[1][1]="12";
        stringArr2[1][2]="12";
        stringArr2[2][0]="12";
        stringArr2[2][1]="12";
        stringArr2[2][2]="12";

        System.out.println("stringArr1:");
        try{myArrayException(stringArr1);}
        catch (MyArrayDataException made){
            System.out.println(made.getMessage());
            System.out.println("wrong position: ["+ made.i +"]["+made.j+"]");
        }
        catch (MyArraySizeException mase){
            System.out.println(mase.getMessage());
        }
        System.out.println();
        System.out.println("stringArr2:");
        try{myArrayException(stringArr2);}
        catch (MyArrayDataException made){
            System.out.println(made.getMessage());
            System.out.println("wrong position: ["+ made.i +"]["+made.j+"]");
        }
        catch (MyArraySizeException mase){
            System.out.println(mase.getMessage());
        }


    }
}
