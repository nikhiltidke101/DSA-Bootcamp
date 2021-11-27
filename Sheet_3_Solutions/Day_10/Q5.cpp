// Trapping Rain Water 

class Solution {
public:
    int trapRainWater(vector<vector<int>>& heightMap) {
        int res = 0;
        for(int i=0;i<heightMap[0].size();i++){
            vector<int> height;
            for (int j =0;j<heightMap.size();j++){
                height[j] = heightMap[j][i];
            }
            res += trap(height);
        }
        return res;
    }

    int trap(vector<int>& height) {
        int n = height.size();
        
        int lmax[n], rmax[n];
        
        int res =0;
        
        lmax[0] = height[0];
        for (int i=1;i<n;i++){
            lmax[i] = max(height[i],lmax[i-1]);
        }
        
        rmax[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            rmax[i] = max(height[i],rmax[i+1]);
        }
        
        for(int i=0;i<n;i++){
            res += min(lmax[i],rmax[i]) - height[i];    
        }
        
        return res;
    }
    
    int max(int a,int b){
        if (a >= b){
            return a;
        }else{
            return b;
        }
    }
    
    int min (int a,int b){
        if (a <= b){
            return a;
        }else{
            return b;
        }
    }
};