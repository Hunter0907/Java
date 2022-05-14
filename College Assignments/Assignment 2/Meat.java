/**
 * @author Jack Connolly
 */

public class Meat implements Food {
    //variables
    private String name;
    private int Kcals;
    private double protein;
    private double fat;
    private double Vit_A;
    private double Vit_B;
    private double Vit_C;


    /**
     * 
     * @param newname - name of the vegetable
     * @param newKcals - number of calories
     * @param newprotein - amount of protein (g per 100g)
     * @param newfat - amount of fat (g per 100g)
     * @param newVit_A - amount of vitamin A
     * @param newVit_B - amount of vitamin B
     * @param newVit_C - amount of vitamin C
     */
    public Meat(String newName, int newKcals, double newProtein, double newFat, double newVit_A, double newVit_B, double newVit_C){
        name = newName;
        fat = newFat;
        Kcals = newKcals;
        protein = newProtein;
        Vit_A = newVit_A;
        Vit_B = newVit_B;
        Vit_C = newVit_C;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }

    public double getProtein(){
        return this.protein;
    }

    public int getKcals(){
        return this.Kcals;
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
    public double getFat(){
        return this.fat;
    }

    /**
     * Method that will return true or false based on whether the sum of the vitamins and the protein is greater that the sum of the fat value
     * if true, this means that the food is healthy
     * if false, food is unhealthy
     */
    public boolean healthy(){
        return (getVit_A() + getVit_B() + getVit_C() + getProtein()) > (getFat());
    }


    /**
     * Display method displays the result in a clear and aesthetically pleasing manner
     */
    public void display(){
        System.out.println(name + "\namount of protein (g per 100g): " + protein + "\nnumber of calories: " + Kcals + "\namount of fat (g per 100g): " + fat + "\nVitamin A amount: " + Vit_A + "\nVitamin B amount: " + Vit_B + "\nvitamin C amount: " + Vit_C + "\nIs the food healthy? " + healthy() + "\n");
    }

}
