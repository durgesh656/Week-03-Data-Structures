package quicksort;

public class Sort {

    public void quickSort(int[] productPrices, int startIndex, int endIndex){

        if(startIndex >= endIndex){
            return;
        }

        //set pivot value
        int pivotIdx = partition(productPrices, startIndex, endIndex);

        quickSort(productPrices, startIndex, pivotIdx-1);
        quickSort(productPrices, pivotIdx+1, endIndex);
    }

    public int partition(int[] productPrices, int startIndex, int endIndex){
        int pivot = productPrices[endIndex];

        int i = startIndex -1;

        for(int j = startIndex; j < endIndex; j++){
            if(productPrices[j] <= pivot){
                i++;

                //swap
                int temp = productPrices[j];
                productPrices[j] = productPrices[i];
                productPrices[i] = temp;
            }
        }
        i++;

        //swapping
        int temp = pivot;
        productPrices[endIndex] = productPrices[i];
        productPrices[i] = temp;
        return i;
    }
}
