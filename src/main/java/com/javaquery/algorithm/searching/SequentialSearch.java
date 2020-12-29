package com.javaquery.algorithm.searching;

public class SequentialSearch {

    /**
     * Sequential search on un-ordered dataset.
     * @param data
     * @param searchElement
     * @return position of element if found or -1 in case not found.
     */
    public static int UnOrderedDataSearch(int data[], int searchElement) {
        int position = -1;
        System.out.print("Compare: ");
        
        /* Search through dataset until record not found */
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " == " + searchElement + ", ");
            if (data[i] == searchElement) {
                position = i;
                break;
            }
        }
        return position;
    }

    /**
     * Sequential search on ordered dataset.
     * @param data
     * @param searchElement
     * @return position of element if found or -1 in case not found.
     */
    public static int OrderedDataSearch(int data[], int searchElement){
        int position = -1;
        System.out.print("Compare: ");
        
        /**
         * As we know its "Ordered dataset"...
         * Compare through dataset until dataset record less than search element .
         */
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " == " + searchElement + ", ");
            if(data[i] == searchElement){
                position = i;
                break;
            }else if(data[i] > searchElement){
                System.out.print(data[i] + " > " + searchElement + "[break loop]");
                break;
            }
        }
        return position;
    }
    
    public static void main(String[] args) {
        /**
         * Best case: When record found on first position.
         * Average case: When record found on middle position. 
         * Worst case: When record found at last position or have to compare upto last record in dataset.
         */
        System.out.println("Sequential Search[Unordered dataset]");
        int[] UnOrderedData = {2, 1, 89, 3, 65, 32, 99, 100, 77};
        
        System.out.println("1. Best case");
        int bestCaseUnOrdered = UnOrderedDataSearch(UnOrderedData, 2);
        System.out.println("\nPosition: " + bestCaseUnOrdered);
        System.out.println("--------------------------------");
        
        System.out.println("2. Average case");
        int averageCaseUnOrdered = UnOrderedDataSearch(UnOrderedData, 65);
        System.out.println("\nPosition: " + averageCaseUnOrdered);
        System.out.println("--------------------------------");
        
        System.out.println("3. Worst case");
        int worstCaseUnOrdered = UnOrderedDataSearch(UnOrderedData, 101);
        System.out.println("\nPosition: " + worstCaseUnOrdered);

        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        
        
        System.out.println("Sequential Search[Ordered dataset]");
        int[] OrderedData = {1, 2, 3, 32, 65, 77, 89, 99, 100};
        
        System.out.println("1. Best case");
        int bestCaseOrdered = OrderedDataSearch(UnOrderedData, 2);
        System.out.println("\nPosition: " + bestCaseOrdered);
        System.out.println("--------------------------------");
        
        System.out.println("2. Average case");
        int averageCaseOrdered = OrderedDataSearch(OrderedData, 65);
        System.out.println("\nPosition: " + averageCaseOrdered);
        System.out.println("--------------------------------");
        
        System.out.println("3. Worst case");
        int worstCaseOrdered = OrderedDataSearch(OrderedData, 78);
        System.out.println("\nPosition: " + worstCaseOrdered);
    }
}
