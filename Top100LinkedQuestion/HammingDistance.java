class HammingDistance {
    public int hammingDistance(int x, int y) {
        int xor = x^y;
        int num=0;
        for(int i=0;i<32;i++){
            num += (xor>>i)&1;
        }
        return num;
    }
}