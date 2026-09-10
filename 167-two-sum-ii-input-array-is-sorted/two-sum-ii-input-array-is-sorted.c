/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* numbers, int numbersSize, int target, int* returnSize) {
    *returnSize=2;
    int *res=malloc(2 * sizeof(int));
    int l=0,r=numbersSize-1;
    while(l<r){
        if((numbers[l]+numbers[r])>target) r--;
        else if((numbers[l]+numbers[r])<target) l++;
        else{
            res[0]=l+1;
            res[1]=r+1;
            return res;
        }
    }
    return 0;
}