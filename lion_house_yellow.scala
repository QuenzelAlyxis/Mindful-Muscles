//Create a class for the Yoga and Fitness Studio
class YogaFitnessStudio { 
  //Instance variables 
  private var members: Int = 0 
  private var classes: Int = 0 
  
  //Constructor 
  def this(members: Int, classes: Int) { 
    this() 
    this.members = members 
    this.classes = classes 
  } 
  
  //Methods 
  def getMembers(): Int = { 
    members 
  } 
  
  def setMembers(members: Int): Unit = { 
    this.members = members 
  } 
  
  def getClasses(): Int = { 
    classes 
  } 
  
  def setClasses(classes: Int): Unit = { 
    this.classes = classes 
  } 
  
  //Display Function
  def display(): Unit = { 
    println("Members: " + members) 
    println("Classes: " + classes) 
  } 

} 

//Create a companion object for the class
object YogaFitnessStudio { 
  //Define a factory method 
  def apply(members: Int, classes: Int): YogaFitnessStudio = new YogaFitnessStudio(members, classes) 
  
  //Define a static variable 
  val maxCapacity = 50; 
  
  //Define a method to check capacity 
  def isFull(yfs: YogaFitnessStudio): Boolean = { 
    if(yfs.getMembers() >= maxCapacity) 
      return true 
    else 
      return false 
  } 
} 

//Create a main class 
object Main { 
  def main(args: Array[String]): Unit = { 
    //Create an object of the class 
    val yfs = YogaFitnessStudio(30, 5) 
    
    //Invoke the display method 
    yfs.display 
    
    //Invoke the isFull method 
    println("Is the studio full? " + YogaFitnessStudio.isFull(yfs)) 
    
    //Add 10 more members 
    yfs.setMembers(yfs.getMembers() + 10) 
    
    //Invoke the display method 
    yfs.display 
    
    //Invoke the isFull method 
    println("Is the studio full? " + YogaFitnessStudio.isFull(yfs)) 
  } 
}