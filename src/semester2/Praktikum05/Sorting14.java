package semester2.Praktikum05;
public class Sorting14 {
    int[] data;
    int jumData;
    Sorting14(int[] Data, int jmlData){
        jumData=jmlData;
        data= new int[jmlData];
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];}}
    
    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");}
            System.out.println();}
    void selectionsort(){
        for (int i = 0; i < jumData-1; i++) {
            int min=i;
            for (int j=i+1 ; j < jumData; j++) {
                if (data[j]<data[min]) {min=j;}}
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;}}
    void insertionsort(){
        for (int i = 0; i < jumData; i++) {
            int temp = data[i];
            int j=i-1;
            while (j>=0&&data[j]<temp) {
                data[j+1]=data[j];
                j--;}
            data[j+1]=temp;}}}
