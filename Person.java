public class Person
{
    //variables for characterisics 
    
    private String strName;
    private int intHeight;
    private int intAge;
    private int intWeight;
    
    
    public Person(String name)
    {
        
        
        strName = name;
        
        //Person is assigned random height, Age and Weight
        
        intHeight = (int) (Math.random()*(82-72+1)+72); //range from 6 foot to 7 foot for height (expressed in inches)
        intAge = (int) (Math.random()*(40-20+1)+20); //range from 20 years old to 40 (expressed in years)
        intWeight  = (int) (Math.random()*(300-200+1)+200); //range from 200 lb to 300 lb (expressed in pounds)
    }
     public Person(String name, int height, int weight, int age)
    {
        
        
        strName = name;
        
        //Person is assigned random height, Age and Weight
        
        intHeight = height;
        intAge = age;
        intWeight  = weight;
    }
    
    public String getName()
    {
        return this.strName;
    }
    public int getHeight()
    {
        return this.intHeight;
    }
    public int getAge()
    {
        return intAge;
    }
    public int getWeight()
    {
        return intWeight;
    }
    public void setName(String name) //for setting name during run time
    {
        strName = name;
    }
    
}
