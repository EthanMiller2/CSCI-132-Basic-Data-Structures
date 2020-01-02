/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imp;

/**
 *
 * @author ethanmiller
 */
public class PixelRegion {
   private int h, w, count;
    
    public PixelRegion(int h, int w)
    {
        this.h = h;
        this.w = w;
        count = 0;
    }
    
    public int getCount()
    {
        return count;
    }
    
    public void updateCount()
    {
        count++;
    }
    
    public int getH()
    {
        return h;
    }
    
    public int getW()
    {
        return w;
    }
    
}
