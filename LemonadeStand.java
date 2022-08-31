/**
 * LemonadeStand.java
 * 
 */

//Put any imports below this line.

/**
 * Short, one-line description of LemonadeStand class here.
 * 
 * Optionally, include a paragraph that provides a more 
 * detailed description.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LemonadeStand
{
    private int lemons;
    private int gallonsOfWater;
    private int cupsOfSugar;
    private int emptyGlasses;
    private int glassesOfLemonade;
    private double price;
    private double income;

    /**
     * comment.
     */
    public LemonadeStand()
    {
        lemons = 0;
        gallonsOfWater = 0;
        cupsOfSugar = 0;
        glassesOfLemonade = 0;
        emptyGlasses = 0;
        price = 0;
        income = 0;

    }

    /** Contructor.
     * LemonadeStand Constructor
     *
     * @param newLemons A parameter
     * @param newGallonsOfWater A parameter
     * @param newCupsOfSugar A parameter
     * @param newEmptyGlasses A parameter
     * @param newPrice A parameter
     */
    public LemonadeStand(int newLemons, int newGallonsOfWater, 
        int newCupsOfSugar, int newEmptyGlasses, double newPrice)
    {
        setLemons(newLemons); 
        setGallonsOfWater(newGallonsOfWater);
        setCupsOfSugar(newCupsOfSugar);
        setEmptyGlasses(newEmptyGlasses);
        setPrice(newPrice); 
        glassesOfLemonade = 0;
        income = 0;
    }

    /** Mutator to change the amount of lemons.
     * Method setLemons
     *
     * @param newLemons A parameter
     * 
     */
    public void setLemons(int newLemons)
    {
        if (newLemons >= 0)
        {
            lemons = newLemons;

        }
        else
        { 
            lemons = 0;
        }

    }

    /** Mutator to change gallons of water.
     * Method setGallonsOfWater
     *
     * @param newGallonsOfWater A parameter
     * 
     */
    public void setGallonsOfWater(int newGallonsOfWater)
    {

        if (newGallonsOfWater >= 0)
        {
            gallonsOfWater = newGallonsOfWater;

        }
        else
        {
            gallonsOfWater = 0;
        }

    }

    /** Mutator to set cups of sugar.
     * Method setCupsOfSugar
     *
     * @param newCupsOfSugar A parameter
     * 
     */
    public void setCupsOfSugar(int newCupsOfSugar)
    {

        if (newCupsOfSugar >= 0)
        {
            cupsOfSugar = newCupsOfSugar;

        }

        else
        {
            cupsOfSugar = 0;
        }

    }

    /** Mutator to modify the number of empty glasses.
     * Method setEmptyGlasses
     *
     * @param newEmptyGlasses A parameter
     * 
     */
    public void setEmptyGlasses(int newEmptyGlasses)
    {

        if (newEmptyGlasses >= 0)
        {
            emptyGlasses = newEmptyGlasses;

        }

        else
        {
            emptyGlasses = 0;
        }

    }

    /** Mutator to modify the glasses of lemonade.
     * Method setGlassesOfLemonade
     *
     * @param newGlassesOfLemonade A parameter
     *
     */
    public void setGlassesOfLemonade(int newGlassesOfLemonade)
    {

        if (newGlassesOfLemonade >= 0)
        {
            glassesOfLemonade = newGlassesOfLemonade;
        }

        else
        {
            glassesOfLemonade = 0;
        }
    }

    /** Mutator to change the price.
     * Method setPrice
     *
     * @param newPrice A parameter
     * 
     */
    public void setPrice(double newPrice)
    {

        if (newPrice >= 0)
        {
            price = newPrice;
        }

        else
        {
            price = 0;
        }

    }

    /** Mutator to set the income.
     * Method setIncome
     *
     * @param newIncome A parameter
     * 
     */
    public void setIncome(double newIncome)
    {

        if (newIncome >= 0)
        {
            income = newIncome;
        }

        else
        {
            income = 0;
        }

    }

    /** Accessor to make lemonade.
     * Method makeLemonade
     *
     * @return The return value
     **/

    public int makeLemonade()
    {
        if (lemons >= 6 && gallonsOfWater >= 1 && cupsOfSugar >= 1 
            && emptyGlasses >= 8)
        {
            lemons -= 6;
            gallonsOfWater -= 1;
            cupsOfSugar -=  1; 
            emptyGlasses -= 8;
            glassesOfLemonade += 8;
            return 8;
        }
        return 0;
    }

    /** Accessor to lemonade selling.
     * Method sellLemonade
     *
     * @return The return value
     */
    public int sellLemonade()
    {
        if (glassesOfLemonade >= 1)
        {
            glassesOfLemonade -= 1;
            income = income + price;
            return 1;
        }
        else  
        {
            makeLemonade();
            if (glassesOfLemonade == 0)
            {
                return 0;
            }
            income = income + price;
            glassesOfLemonade -= 1;
            return 1;
        }

    }

    /** Accessor to get number of lemons.
     * Method getLemons
     *
     * @return The return value
     */
    public int getLemons()
    {
        return lemons;
    }

    /** Accessor to return gallons of water.
     * Method getGallonsOfWater
     *
     * @return The return value
     */
    public int getGallonsOfWater()
    {
        return gallonsOfWater;
    }

    /** Accessor to return cups of sugar.
     * Method getCupsOfSugar
     *
     * @return The return value
     */
    public int getCupsOfSugar()
    {
        return cupsOfSugar;
    }

    /** Accessor to return the value of empty glasses.
     * Method getEmptyGlasses
     *
     * @return The return value
     */
    public int getEmptyGlasses()
    {
        return emptyGlasses;
    }

    /** Accessor to return glasses of lemonade.
     * Method getGlassesOfLemonade
     *
     * @return The return value
     */
    public int getGlassesOfLemonade()
    {
        return glassesOfLemonade;
    }

    /** Accessor to return the price.
     * Method getPrice
     *
     * @return The return value
     */
    public double getPrice()
    {
        return price;
    }

    /** Accesor to return the income rate.
     * Method getIncome
     *
     * @return The return value
     */
    public double getIncome()
    {
        return income;
    }

    /** Accessor for lemonade selling.
     * Method sellMoreLemonade
     *
     * @param requestedGlasses A parameter
     * @return The return value
     */
    public int sellMoreLemonade(int requestedGlasses)
    {
        int var = 0;
        for (int i = 0; i < requestedGlasses; i++)
        {
            var += sellLemonade();
        }
        return var;
    }

    /** Main method of the program.
     * Method main
     *
     * @param args A parameter
     */
    public static void main(String[] args)
    {
        LemonadeStand lemonadeStand = new LemonadeStand(8, 2, 2, 5, 1.0);
        lemonadeStand.makeLemonade();
        lemonadeStand.sellLemonade();
        System.out.println(lemonadeStand.sellMoreLemonade(5));
        System.out.println(lemonadeStand.getLemons());
        System.out.println(lemonadeStand.getGallonsOfWater());
        System.out.println(lemonadeStand.getCupsOfSugar());
        System.out.println(lemonadeStand.getGlassesOfLemonade());
    }
}
