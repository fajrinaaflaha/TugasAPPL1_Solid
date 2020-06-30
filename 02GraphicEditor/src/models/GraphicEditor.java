/*
 * Created By Fajrina Aflaha.
 */
package models;

import interfaces.IShape;
/**
 *
 * @author Fajrina Aflaha
 */
public class GraphicEditor{
    public void DrawShape(IShape shape){
        System.out.println(shape.Drow());
    }
}
