public class Age 
{
    int intAge;
    
    public Age(int age)
    {
        intAge = (int) (Math.random()*(40-20+1)+20); //range from 20 years old to 40 (expressed in years)
    }
    int getAge()
    {
        return intAge;
    }
    
}
