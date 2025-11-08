import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int[] integerarrayf(int rosterarray[], int a) {
        int[] integerarray = new int[a];
        for (int i = 0; i < rosterarray.length; i++) {
            integerarray[i] = rosterarray[i];
        }
        return integerarray;
    }

    public static int[] rotatedarrayf(int arr[]) {
        int z = arr.length;
        int[] rotatedarray = new int[z];
        rotatedarray[0] = arr[z - 1];
        for (int i = 1; i < z; i++) {
            rotatedarray[i] = arr[i - 1];
        }
        return rotatedarray;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int[] myArr = {4, 8, 15, 16, 23, 42};

        System.out.println("For the given array:");
        System.out.println("The length of the array is: " + myArr.length);
        System.out.println("The value of the first element is: " + myArr[0]);
        System.out.println("The index value of the last element is: " + (myArr.length - 1));
        System.out.println("The value of the third element is: " + myArr[2]);
        System.out.println("The value of myArr[3] is: " + myArr[3]);

        //System.out.println(myArr[10]);
        //if we try to access myArr[10] the error message "ArrayIndexOutOfBoundsException" occurs.
        //which means the memory space for the index number that we wanted to reach in the array was not created.
        //we can solve this problem by copying the elements of our array to a new, larger array.

        int[] rosterarray = new int[20];
        System.out.println("\nRoster array is:");
        for (int i = 0; i < 20; i++) {
            rosterarray[i] = 1000 + i;
            System.out.println(rosterarray[i]);
        }

        System.out.println("\nPlease write the total number of students");
        int a = sc.nextInt();

        System.out.println("\nInteger array is:");
        int[] integerarayff = integerarrayf(rosterarray, a);
        for (int i = 0; i < integerarayff.length; i++) {
            System.out.println(integerarayff[i]);
        }

        int x = rd.nextInt(10, 21);
        int[] arr = new int[x];
        System.out.println("\nInitial array is:");
        for (int i = 0; i < x; i++) {
            int y = rd.nextInt(100);
            arr[i] = y;
            System.out.println(arr[i]);
        }
        int[] rotatedarrayff = rotatedarrayf(arr);
        System.out.println("\nRotated array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(rotatedarrayff[i]);
        }

        int sayacs=0;
        int sayacc=0;
        int sayacr=0;
        int sayacst=0;

        String[] weather= new String[100];
        for(int i=0;i<40;i++){
            weather[i]="Sunny";
            sayacs++;
        }
        for(int i=40;i<70;i++){
            weather[i]="Cloudy";
            sayacc++;
        }
        for(int i=70;i<90;i++){
            weather[i]="Rainy";
            sayacr++;
        }
        for(int i=90;i<100;i++){
            weather[i]="Stormy";
            sayacst++;
        }
        System.out.println("Percentages for the representative array are: \nSunny: "+ sayacs);
        System.out.println("Cloudy: "+ sayacc);
        System.out.println("Rainy: "+ sayacr);
        System.out.println("Stormy: "+sayacst);

        float sayacsunny=0.0f;
        float sayaccloudy=0.0f;
        float sayacrainy=0.0f;
        float sayacstormy=0.0f;
        int[] weather2 = new int[1000000];
        for(int i=0;i<1000000;i++){
            int j= rd.nextInt(4);
            weather2[i]= j;
            switch(j) {
                case 0:
                    sayacsunny++;
                    break;
                case 1:
                    sayaccloudy++;
                    break;
                case 2:
                    sayacrainy++;
                    break;
                case 3:
                    sayacstormy++;
                    break;
            }

        }
        System.out.println("Percentages for the simulated days are:");
        float aa= (100.0f*sayacsunny)/1000000.0f;
        System.out.printf("Sunny percantage is ");
        System.out.printf("%.2f\n", aa);
        float bb= (100.0f*sayaccloudy)/1000000.0f;
        System.out.printf("Cloudy percantage is ");
        System.out.printf("%.2f\n", bb);
        float cc= (100.0f*sayacrainy)/1000000.0f;
        System.out.printf("Rainy percantage is ");
        System.out.printf("%.2f\n", cc);
        float dd= (100.0f*sayacstormy)/1000000.0f;
        System.out.printf("Stormy percantage is ");
        System.out.printf("%.2f\n", dd);

        float aaa= aa-sayacs;
        float bbb= bb-sayacc;
        float ccc= cc-sayacr;
        float ddd= dd-sayacst;

        if(aaa==0) {
            System.out.println("representative and the simulation percentages are the same for sunny weather");
        }
            else if(aaa<0){
            System.out.println("simulation percentage is " + aaa*-1 + " less than representative percentage for sunny weather");
        }
            else{
            System.out.println("simulation percentage is " + aaa + " more than representative percentage for sunny weather");
        }
        if(bbb==0) {
            System.out.println("representative and the simulation percentages are the same for cloudy weather");
        }
        else if(bbb<0){
            System.out.println("simulation percentage is " + bbb*-1 + " less than representative percentage for cloudy weather");
        }
        else{
            System.out.println("simulation percentage is " + bbb + " more than representative percentage for cloudy weather");
        }
        if(ccc==0) {
            System.out.println("representative and the simulation percentages are the same for rainy weather");
        }
        else if(ccc<0){
            System.out.println("simulation percentage is " + ccc*-1 + " less than representative percentage for rainy weather");
        }
        else{
            System.out.println("simulation percentage is " + ccc + " more than representative percentage for rainy weather");
        }
        if(ddd==0) {
            System.out.println("representative and the simulation percentages are the same for stormy weather");
        }
        else if(ddd<0){
            System.out.println("simulation percentage is " + ddd*-1 + " less than representative percentage for stormy weather");
        }
        else{
            System.out.println("simulation percentage is " + ddd + " more than representative percentage for stormy weather");
        }
        int[] arr2= new int[30];
        System.out.println("\nThe array is: ");
        for(int i=0;i<30;i++){
            int k=rd.nextInt(1,101);
            arr2[i]=k;
            System.out.println(arr2[i]);
        }
        int sayac= 0;
        int max=arr2[0];
        System.out.println("\nThe peaks are: ");
        for(int i=1;i<29;i++){
            if(arr2[i]>arr2[i-1] && arr2[i]>arr2[i+1]){
                System.out.println(arr2[i]);
                sayac++;
                if(arr2[i]>max){
                    max=arr2[i];
                }
            }
        }
        System.out.println("\nThere are " + sayac + " peaks");
        if(sayac!=0){
        System.out.println("\nThe biggest peak is " + max+"\n");
        }

        float summ=0.0f;
        float av=0.0f;
        float summm=0.0f;
        float avv=0.0f;
        int[] [] quizes = new int [5] [4];
        System.out.printf("   students                  quizes                     student averages");
        System.out.println();
        for(int i=0;i<=4;i++){
                System.out.printf("      " +(i + 1) + ".             ");
                for (int k = 0; k <= 4; k++) {

                    int h = rd.nextInt(101);
                    if (k == 4) {
                        av = summ / 4.0f;
                        System.out.printf("     %.2f", av);
                        summ = 0;
                    } else {
                        quizes[i][k] = h;
                        System.out.printf("%02d       ", quizes[i][k]);
                        summ += quizes[i][k];
                    }
                }
                System.out.println();
        }
        System.out.printf("\nquiz averages:  ");
        for(int k = 0; k<4; k++) {
            summm=0;
            for (int i=0;i<5;i++) {
                summm+=quizes[i][k];
            }
            avv = summm / 5.0f;
            System.out.printf("    %.2f", avv);
        }

    }
}





