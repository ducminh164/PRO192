public class Flight {
    private String route;
    private int fare;
    
    public Flight(String route, int fare) {
        this.route = route;
        this.fare = fare;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
  
    
    /*Complete the below function for second test case*/
    public String getDeparture() {
        String res = "";
        for (int i = 0; i < route.length(); i++) {
            if (route.charAt(i) == '-') break;
            res += route.charAt(i);
        }
        
        return res;
    }
   //add and complete your other methods here (if needed)

    @Override
    public String toString() {
        return route + "\t" + fare;
    }
    
   
}
