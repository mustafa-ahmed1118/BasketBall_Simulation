public class Weight 
{
    int intWeight;
    
    public Weight()
    {
        intWeight = (int) (Math.random()*(300-200+1)+200); //range from 200 lb to 300 lb (expressed in pounds)
    }
    
    int getWeight()
    {
        return intWeight;
    }
    
}
