/**
 * @author Jack Connolly
 */

public class Vegetable implements Food{
    //variables
    private String name;
    private int Kcals;
    private double protein;
    private double fat;
    private double Vit_A;
    private double Vit_B;
    private double Vit_C;
     
    //getters
    public String getName(){
        return this.name;
    }

    public int getKcals(){
        return this.Kcals;
    }

    public double getProtein(){
        return this.protein;
    }

    public double getFat(){
        return this.fat;
    }

    public double getVit_A(){
        return this.Vit_A;
    }

    public double getVit_B(){
        return this.Vit_B;
    }

    public double getVit_C(){
        return this.Vit_C;
    }



    //methods
    /**
     * Method that will return true or false based on whether the sum of the vitamins is greater that the sum of the fat and protein values
     * if true, this means that the food is healthy
     * if false, food is unhealthy
     */
    public boolean healthy(){
        return (getVit_A() + getVit_B() + getVit_C())>(getFat() + getKcals());
    }

    /**
     * 
     * @param newname - name of the vegetable
     * @param newKcal - number of calories
     * @param newProtein - amount of protein (g per 100g)
     * @param newFat - amount of fat (g per 100g)
     * @param newVit_A - amount of vitamin A
     * @param newVit_B - amount of vitamin B
     * @param newVit_C - amount of vitamin C
     */
    public Vegetable(String newname,int newKcal, double newProtein, double newFat, double newVit_A,double newVit_B, double newVit_C) {
        name = newname;
        Kcals = newKcal;
        protein = newProtein;
        fat = newFat;
        Vit_A = newVit_A;
        Vit_B = newVit_B;
        Vit_C = newVit_C;

    }

    //Display method displays the result in a clear and aesthetically pleasing manner
    public void display(){
        System.out.println(name + "\namount of protein (g per 100g): " + protein + "\nnumber of calories: " + Kcals + "\namount of fat (g per 100g): " + fat + "\nVitamin A amount: " + Vit_A + "\nVitamin B amount: " + Vit_B + "\nvitamin C amount: " + Vit_C + "\nIs the food healthy? " + healthy() + "\n");
    }
 }