class Solution {

    class Pair{
        int element;
        int index;
        Pair(int element, int index){
            this.element = element;
            this.index = index;
        }
    }
    public int largestRectangleArea(int[] heights) {
        // TC -> O(n)
        // SC -> O(n)
       int n = heights.length;
        int [] left = nsl(heights);
        int [] right = nsr(heights);
        int [] width = new int[n];
        for(int i=0; i<n; i++){
            width[i] = right[i] - left[i] - 1;
        }
       int [] area = new int[n];
       for(int i=0; i<n; i++){
        area[i] = width[i] * heights[i];
       }
       int max = area[0];
        for(int i = 0; i < heights.length; i++){
            if(area[i] > max)
            max = area[i];
            
        }
        return max;
    }
    public int [] nsl(int [] heights){
        int n = heights.length;
        int [] left = new int [n];
        Stack<Pair> st = new Stack<>();
       
        for(int i = 0; i<n; i++){
            if(st.isEmpty()){
                left[i] = -1; //Psudo index
            }
            else if(!st.isEmpty() && st.peek().element < heights[i]){
                left[i] = st.peek().index;
            }
            else if(!st.isEmpty() && st.peek().element >= heights[i]){
                while(!st.isEmpty() && st.peek().element >= heights[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    left[i] = -1;
                }
                else if(st.peek().element < heights[i]){
                    left[i] = st.peek().index;
                }
            }
            st.push(new Pair(heights[i] , i));
        }
        return left;
    }
    public int [] nsr(int [] heights){
        int n = heights.length;
        int [] right = new int[n];
        Stack<Pair> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            if(st.isEmpty()){
                right[i] = n; // Psudo index
            }
            else if(!st.isEmpty() && st.peek().element < heights[i]){
                right[i] = st.peek().index;
            }
            else if(!st.isEmpty() && st.peek().element >= heights[i]){
                while(!st.isEmpty() && st.peek().element >= heights[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    right[i] = n;
                }
                else if(st.peek().element < heights[i]){
                    right[i] = st.peek().index;
                }
            }
            st.push(new Pair(heights[i] , i));
        }
        return right;
    }
      
    }
    