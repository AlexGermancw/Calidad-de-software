/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author Admin
 */
public class TriangleCalculator {
    public boolean isTriangle(int edge1, int edge2, int edge3){
        return (edge1 + edge2 > edge3) && (edge2 + edge3 > edge1) && (edge1 + edge3 > edge2);
    }
    
    public String triangleType(int edge1, int edge2, int edge3){
        if(edge1 == edge2 && edge2 == edge3){
            return "EQUILATERO";
        }else if(edge1 == edge2 || edge2==edge3 || edge1 == edge3){
            return "ISÓSCELES";
        }else{
            return "ESCALENO";
        }
    }
    
    
}
