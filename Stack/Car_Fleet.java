class Solution {
    class Car {
        int position;
        int speed;
        public Car(int position , int speed){
            this.position = position;
            this.speed = speed;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        // TC -> O(nlogn) since sorting is required
        // Sc -> O(n)
        int n = position.length;
        Car [] cars = new Car[n];
        for(int i = 0; i<n; i++){
            cars[i] = new Car(position[i] , speed[i]);
        }
        Arrays.sort(cars, (a,b) -> b.position - a.position);
        Stack<Double> st = new Stack<>();
        for(Car car : cars){
            double time = (double)(target - car.position) / car.speed;
            if(st.isEmpty() || st.peek() < time){
                st.push(time);
            }
        }
        return st.size();
    }
}