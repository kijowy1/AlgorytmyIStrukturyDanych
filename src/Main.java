import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("pomiary.txt");
        //int[] sizes = {100,5000,10000,50000,75000,100000};
        int[] sizes = {1000};
        Random rand = new Random();
        
        {//Insertion
            for (Integer i : sizes) {
                System.out.println("Rozpoczecie pomiaru dla: " + i + "\n" + "-Insertion, randomArray ");
                fw.write("Insertion sort dla listy o wielkosci " + i + "\n");
                fw.write("Random " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::insertionSort,
                        listGenerators::generateRandomArray, i)) + "\n");
                System.out.println("-Insertion, decrasing");

                fw.write("Deacrisng  " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::insertionSort,
                        listGenerators::generateDecreasingArray, i)) + "\n");
                System.out.println("-Insertion, increasing");

                fw.write("Increasing " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::insertionSort,
                        listGenerators::generateIncreasingArray, i)) + "\n");
                System.out.println("-Insertion, ashaped");

                fw.write("AShaped " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::insertionSort,
                        listGenerators::generateAShapedArray, i)) + "\n");
                System.out.println("-Insertion, constant");

                fw.write("Constant " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::insertionSort,
                        (rozmiar) -> listGenerators.generateConstantArray(i, rand.nextInt(1000)), i)) + "\n");
                fw.write("\n");
                System.out.println("Koniec pomiaru");
            }
        }
        fw.write("\n\n");
        
        {// shellSort
            for (Integer i : sizes) {
                System.out.println("Rozpoczecie pomiaru dla: " + i + "\n" + "-shell, randomArray ");
                fw.write("Shell sort dla listy o wielkosci " + i + "\n");
                fw.write("Random " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::shellSort,
                        listGenerators::generateRandomArray, i)) + "\n");
                System.out.println("-shell, decrasing");

                fw.write("Deacrisng  " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::shellSort,
                        listGenerators::generateDecreasingArray, i)) + "\n");
                System.out.println("-shell, increasing");

                fw.write("Increasing " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::shellSort,
                        listGenerators::generateIncreasingArray, i)) + "\n");
                System.out.println("-shell, ashaped");

                fw.write("AShaped " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::shellSort,
                        listGenerators::generateAShapedArray, i)) + "\n");
                System.out.println("-shell, constant");

                fw.write("Constant " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::shellSort,
                        (rozmiar) -> listGenerators.generateConstantArray(i, rand.nextInt(1000)), i)) + "\n");
                fw.write("\n");
                System.out.println("Koniec pomiaru");
            }
        }
        fw.write("\n\n");
        
        {// selectionSort
            for (Integer i : sizes) {
                System.out.println("Rozpoczecie pomiaru dla: " + i + "\n" + "selection, randomArray ");
                fw.write("selection sort dla listy o wielkosci " + i + "\n");
                fw.write("Random " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::selectionSort,
                        listGenerators::generateRandomArray, i)) + "\n");
                System.out.println("-selection, decrasing");

                fw.write("Deacrisng  " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::selectionSort,
                        listGenerators::generateDecreasingArray, i)) + "\n");
                System.out.println("-selection, increasing");

                fw.write("Increasing " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::selectionSort,
                        listGenerators::generateIncreasingArray, i)) + "\n");
                System.out.println("-selection, ashaped");

                fw.write("AShaped " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::selectionSort,
                        listGenerators::generateAShapedArray, i)) + "\n");
                System.out.println("-selection, constant");

                fw.write("Constant " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::selectionSort,
                        (rozmiar) -> listGenerators.generateConstantArray(i, rand.nextInt(1000)), i)) + "\n");
                fw.write("\n");
                System.out.println("Koniec pomiaru");
            }
        }
        fw.write("\n\n");
        
        {// heapSort
            for (Integer i : sizes) {
                System.out.println("Rozpoczecie pomiaru dla: " + i + "\n" + "-heap, randomArray ");
                fw.write("Heap sort dla listy o wielkosci " + i + "\n");
                fw.write("Random " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::heapSort,
                        listGenerators::generateRandomArray, i)) + "\n");
                System.out.println("-heap, decrasing");

                fw.write("Deacrisng  " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::heapSort,
                        listGenerators::generateDecreasingArray, i)) + "\n");
                System.out.println("-heap, increasing");

                fw.write("Increasing " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::heapSort,
                        listGenerators::generateIncreasingArray, i)) + "\n");
                System.out.println("-heap, ashaped");

                fw.write("AShaped " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::heapSort,
                        listGenerators::generateAShapedArray, i)) + "\n");
                System.out.println("-heap, constant");

                fw.write("Constant " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::heapSort,
                        (rozmiar) -> listGenerators.generateConstantArray(i, rand.nextInt(1000)), i)) + "\n");
                fw.write("\n");
                System.out.println("Koniec pomiaru");
            }
        }
        fw.write("\n\n");

        { // QuickSort
            for (Integer i : sizes) {
                System.out.println("Rozpoczecie pomiaru dla: " + i + "\n" + "-quick, randomArray ");
                fw.write("Quick sort dla listy o wielkosci " + i + "\n");
                fw.write("Random " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::quickSort,
                        listGenerators::generateRandomArray, i)) + "\n");
                System.out.println("-quick, decrasing");

                fw.write("Deacrisng  " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::quickSort,
                        listGenerators::generateDecreasingArray, i)) + "\n");
                System.out.println("-quick, increasing");

                fw.write("Increasing " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::quickSort,
                        listGenerators::generateIncreasingArray, i)) + "\n");
                System.out.println("-quick, ashaped");

                fw.write("AShaped " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::quickSort,
                        listGenerators::generateAShapedArray, i)) + "\n");
                System.out.println("-quick, constant");

                fw.write("Constant " + (sortingAlgorithms.algorythmTime(
                        sortingAlgorithms::quickSort,
                        (rozmiar) -> listGenerators.generateConstantArray(i, rand.nextInt(1000)), i)) + "\n");
                fw.write("\n");
                System.out.println("Koniec pomiaru");
            }
        }
        
        fw.close();
    }
}
class listGenerators{
    public static final Random random = new Random();

    public static List<Integer> generateRandomArray(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(10000));
        }
        return list;
    }

    public static List<Integer> generateIncreasingArray(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        return list;
    }

    public static List<Integer> generateDecreasingArray(int size) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(size-i);
        }
        return list;
    }

    public static List<Integer> generateConstantArray(int size, int value) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            list.add(value);
        }
        return list;
    }

    public static List<Integer> generateAShapedArray(int size) {
        List<Integer> list = new ArrayList<>();
        int halfSize = size / 2;
        for (int i = 0; i < halfSize; i++) {
            list.add(i);
        }
        for (int i = halfSize; i < size; i++) {
            list.add(size - i);
        }
        return list;
    }
}
class sortingAlgorithms{
    public static Map<Integer, Integer> countNumbersInList(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (!map.containsKey(list.get(i))) {
                map.put(list.get(i), 1);
            } else {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            }
        }
        return map;
    }

    public static void heapify(List<Integer> list, int listSize, int i) {
        int parent = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        if (leftChild < listSize && list.get(leftChild) > list.get(parent)) {
            parent = leftChild;
        }
        if (rightChild < listSize && list.get(rightChild) > list.get(parent)) {
            parent = rightChild;
        }
        if (parent != i) {
            int temp = list.get(i);
            list.set(i, list.get(parent));
            list.set(parent, temp);
            heapify(list, listSize, parent);
        }
    }
        public static void insertionSort(List<Integer> list){
            for(int i=1;i< list.size();i++) {
                int temp = list.get(i);
                int j;
                for(j=i-1;j>=0;j--) {
                    if(list.get(j)> temp){
                        list.set(j+1,list.get(j));
                    }else{
                        break;
                    }
                }
                list.set(j+1,temp);
            }
        }
    public static void shellSort(List<Integer> list) {
        int n = list.size();
        List<Integer> gaps = new ArrayList<>();
        int k = 0;
        int gap;
        while (true) {
            if (k % 2 == 0) {
                gap = (int)(9 * (Math.pow(2, k) - Math.pow(2, k / 2)) + 1);
            } else {
                gap = (int)(8 * Math.pow(2, k) - 6 * Math.pow(2, (k + 1) / 2) + 1);
            }

            if (gap > n) break;
            gaps.add(0, gap);
            k++;
        }for (int gapVal : gaps) {
            for (int i = gapVal; i < n; i++) {
                int temp = list.get(i);
                int j;

                for (j = i; j >= gapVal; j -= gapVal) {
                    if (list.get(j - gapVal) > temp) {
                        list.set(j, list.get(j - gapVal));
                    } else {
                        break;
                    }
                }
                list.set(j, temp);
            }
        }
    }
        public static void selectionSort(List<Integer> list){
            for(int i=0;i< list.size()-1;i++){
                int minimalValueIndex = i;
                for(int j=i+1;j<list.size();j++){
                    if(list.get(minimalValueIndex)>list.get(j)){
                        minimalValueIndex= j;
                    }
                }

                int temp = list.get(i);
                list.set(i,list.get(minimalValueIndex));
                list.set(minimalValueIndex,temp);
            }
        }
        public static void heapSort(List<Integer> list){
            int n = list.size();
            for (int i = (n / 2) - 1; i >= 0; i--) {
                heapify(list, n, i);
            }
            for (int i = n - 1; i > 0; i--) {
                int temp = list.get(0);
                list.set(0,list.get(i));
                list.set(i,temp);
                heapify(list, i, 0);
            }
        }
    public static void quickSort(List<Integer> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        quickSortHelper(list, 0, list.size() - 1);
    }

    private static void quickSortHelper(List<Integer> list, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(list, low, high);

            quickSortHelper(list, low, partitionIndex - 1);
            quickSortHelper(list, partitionIndex + 1, high);
        }
    }

    private static int partition(List<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (list.get(j) <= pivot) {
                i++;
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }
        public static double algorythmTime(Consumer<List<Integer>> sortAlgorithm,
                                        Function<Integer, List<Integer>> arrayGenerator,
                                        int size){
            List<Integer> list = arrayGenerator.apply(size);
            double start = System.currentTimeMillis();
            sortAlgorithm.accept(list);
            double end = System.currentTimeMillis();
            return (end-start)/1000;
        }

}
