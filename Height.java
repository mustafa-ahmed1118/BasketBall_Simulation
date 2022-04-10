public class Height 
{
    int intHeight;
    
    Height()
    {
        this.intHeight = (int) (Math.random()*(82-72+1)+72); //range from 6 foot to 7 foot for height (expressed in inches)
    }
    int getHeight()
    {
        return this.intHeight;
    }
}
