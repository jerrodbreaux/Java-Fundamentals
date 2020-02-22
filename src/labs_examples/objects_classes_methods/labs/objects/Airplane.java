package labs_examples.objects_classes_methods.labs.objects;
//For each POJO you created to complete the previous Airplane exercise, please change all the instance variables in each
//class to "private".<<<<<<<DONE Then, create getter and setter methods (for each instance variable) in each class you created for
        //the airplane exercise. <<<<<<<<<DONE Also, create a toString() method in each POJO. <<<<<DONE Once complete, demonstrate getting and setting
       // those variables from the class in which you composed the Airplane object, as well as invoking their toString() methods.

//class Example {

   // public static void main(String[] args){

    //    Engine myEngine = new Engine(470);

      //  Engine herEngine = new Engine(490);

     //   Engine hisEngine = new Engine(500);

      //  Avionics myAvionics = new Avionics("ARINC429");

       // Avionics herAvionics = new Avionics("ARINC826");

      //  Avionics hisAvionics = new Avionics("ARINC744");

      //  Plane myPlane = new Plane(myEngine, myAvionics, "Cessna", "White", 1100, 900);

    //    Plane herPlane = new Plane(myEngine, myAvionics, "Gulf", "White", 1400, 8);

       // Plane hisPlane = new Plane(myEngine, myAvionics, "Gulf", "Bone", 1600, 600);

        //System.out.println("I fly a " + myPlane.color + " " + myPlane.model + " with "

        //        + myPlane.avionics.type + " avionics, and an engine with " + myPlane.engine.thrust + " pounds of thrust");

        // OR

       // System.out.println(myPlane.toString());

  //  }

//}

//class Engine {

  //  private double thrust;  //pounds

  //  public Engine(double thrust){

   //     this.thrust = thrust;

   // }


   // public double getThrust() {
   //     return thrust;
   // }

  //  public void setThrust(double thrust) {
  //      this.thrust = thrust;
  //  }

  //  @Override
  //  public String toString() {
  //      return "Engine{" +
  //              "thrust=" + thrust +
   //             '}';
   // }
//}

//class Avionics {

  // private String type;

  //  public Avionics(String type){

     //   this.type = type;

  //  }


   // public String getType() {
   //     return type;
   // }

 //   public void setType(String type) {
       // this.type = type;
 //   }

   // @Override
  //  public String toString() {
//        return "Avionics{" +
 //               "type='" + type + '\'' +
 //               '}';
 //   }
//}

//class Plane {

  //  Engine engine;

    //Avionics avionics;

   // String model;

   // String color;

  //  private double fuelCapacity;

  //  private double currentFuelLevel;

  //  public Plane(Engine engine, Avionics avionics, String model, String color, double fuelCapacity,double currentFuelLevel){

  //      this.engine = engine;

    //    this.avionics = avionics;

     //   this.model = model;

     //   this.color = color;

      //  this.fuelCapacity = fuelCapacity;

     //   this.currentFuelLevel = currentFuelLevel;
  //  }


  //  public String getModel() {
  //      return model;
//    }

 //   public void setModel(String model) {
 //       this.model = model;
//    }

   // public String getColor() {
        //return color;
 //   }

  //  public void setColor(String color) {
  //      this.color = color;
   // }

  //  public double getFuelCapacity() {
  //      return fuelCapacity;
  //  }

  //  public void setFuelCapacity(double fuelCapacity) {
  //      this.fuelCapacity = fuelCapacity;
 //   }

    //public double getCurrentFuelLevel() {
        //return currentFuelLevel;
   // }

  //  public void setCurrentFuelLevel(double currentFuelLevel) {
  //      this.currentFuelLevel = currentFuelLevel;
  //  }

  //  @Override
  //  public String toString() {
  //      return "Plane{" +
  //              "model='" + model + '\'' +
  //              ", color='" + color + '\'' +
  //              ", fuelCapacity=" + fuelCapacity +
 //               ", currentFuelLevel=" + currentFuelLevel +
 //               '}';
 //   }
//}
