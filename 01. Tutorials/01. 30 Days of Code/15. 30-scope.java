

	// Add your code here
    Difference(int[] elems){
        this.elements = elems;
    }

    void computeDifference(){
        int min = 100;
        int max = 1;

        for(int i=0; i<elements.length; i++){
            if(elements[i] < min){
                min = elements[i];
            }
            if(elements[i] > max){
                max = elements[i];
            }
        }
        maximumDifference = max - min;
    }

