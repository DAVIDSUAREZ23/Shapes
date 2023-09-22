package domain.model;

public class Square extends Shape{
    /*Atributo se puede poner ancho o altura */
    private int width=0;
    public int getWidth(){
        return width;
    }
    
    public void setWidth (int newWidth){
        if (newWidth >=0)
        width = newWidth;
    }

    public int getHeight(){
        return getWidth();
    }

    public void setHeight(int newHeight){
        setWidth(newHeight);
    }


}