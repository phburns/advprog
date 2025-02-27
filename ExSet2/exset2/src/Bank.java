interface Bank {
    float rateOfInterest();
}
class Chase implements Bank {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class WellsFargo implements Bank {
    public float rateOfInterest() {
        return 9.7f;
    }
}
class DemoInterface2{
    public static void main(String[] args) {
        Bank b = new Chase();
        Bank w = new WellsFargo();

        System.out.println("Chase Bank Rate of Interest: " + b.rateOfInterest());
        System.out.println("Wells Fargo Bank Rate of Interest: " + w.rateOfInterest());  
    }
}

