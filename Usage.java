class Usage {

    //2-2-1  
    public int Usage(int[] useageArr, int fee) {

        int sum = 0;
        for(int item : useageArr){
            sum += item;
        }

        int usage = sum * fee;

        return usage;

    }
}
