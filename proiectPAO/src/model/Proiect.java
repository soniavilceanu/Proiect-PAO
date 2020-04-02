package model;

public class Proiect {
    private int categoryId;
    private int id;
    private float financialResources;
    private String projectName;



    public Proiect(int categoryId, int id, float financialResources, String projectName){
        this.categoryId = categoryId;
        this.id = id;
        this.financialResources = financialResources;
        this.projectName = projectName;

    }


    public float getFinancialResources() {
        return financialResources;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public int getId() {
        return id;
    }
    public String getProjectName() {
        return projectName;
    }




    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public void setFinancialResources(float financialResources) {
        this.financialResources = financialResources;
    }


    public String toStringy(){
        return "Date proiect:\nName: " + projectName + "\nid: " + id + "\nSuma de bani alocata: " + financialResources + "\nCategoria in care se incadreaza proiectul: " + categoryId +"\n" + "\n";
    }
}
