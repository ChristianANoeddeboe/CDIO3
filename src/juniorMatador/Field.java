package juniorMatador;

public class Field {
    private String name;
    private int fieldNo;

    public Field(String name, int fieldNo){
        this.name=name;
        this.fieldNo=fieldNo;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getFieldNo(){
        return fieldNo;
    }

    public void setFieldNo(int fieldNo){
        this.fieldNo=fieldNo;
    }

	public void landOnField() {
		System.out.println("No action has been specified for this field");
	}

}