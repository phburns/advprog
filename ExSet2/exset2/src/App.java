abstract class Patient {
    abstract void patientInfo1();
    abstract void patientInfo2();
  }
  
  class PatientDetails1 extends Patient {
    void patientInfo1() {
      String pName = "Hemanth";
      int pAge = 21;
      String pLocation = "Bangalore";
  
      System.out.println("Patient name: " + pName);
      System.out.println("Patient age: " + pAge);
      System.out.println("Patient location: " + pLocation);
    }
  
    void patientInfo2() {
      String p_Status = "Good";
      int p_sugar = 110;
      int p_bp = 120;
  
      System.out.println("Patient status: " + p_Status);
      System.out.println("Patient age: " + p_sugar);
      System.out.println("Patient location: " + p_bp);
    }
  }
  
  class Main {
    public static void main(String args[]) {
      PatientDetails1 p = new PatientDetails1();
      p.patientInfo1();
      p.patientInfo2();
    }
  }