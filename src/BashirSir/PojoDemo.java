//Example of POJO class
package BashirSir;
class PojoDemo {
    private Integer property;
    PojoDemo(){
        //no argument constructor
    }
    public void setProperty(Integer property){
        if(property == 0){
            return;
        }
        this.property = property;
    }
    //getter method of property
    public Integer getProperty(){
        if(property == 0){
            return null;
        }
        return property;
    }
}
 class MainMethod{
    public static void main(String[] args) {
        PojoDemo pd = new PojoDemo();
        pd.setProperty(23);
        System.out.println("After setting to property : " + pd.getProperty());

        pd.setProperty(34);
        System.out.println("After seeing to valid : " + "value : " + pd.getProperty());
    }
}

/* POJO : it stands for Plain Old Java Object 
 * Instance of an independent class that doesn't extend any class nor implement any interface
 * Exception is: it can implement marker interface
 * Java Bean also type of POJO
 * It support loose coupling (It means minimum independency)
 * Fields should have getter or setters or both
*/
